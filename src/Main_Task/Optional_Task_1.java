package Main_Task;
import Сontrol.Tryparse;


import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Optional_Task_1
{
    private Integer[] int_array;
    public void setInt_array(Integer[] int_array) { this.int_array = int_array; }
    public Integer[] getInt_array() { return int_array; }

    private void ArrayInit()
    {  Scanner scanner = new Scanner(System.in);
        System.out.println("Для выполнения данной группы заданий следут ввести раяд чисел в консоль (желательно через пробел)");
        boolean check = true;
        while (check)
        {
            check =false;
            String str = scanner.nextLine();
            String[] numbers = str.split("\\s*(\\s|,|!|\\.)\\s*");
            Integer[] temp_array = new Integer[numbers.length];
            for (int i = 0; i < temp_array.length; i++)
            {
                if(Tryparse.tryParseInt(numbers[i]))
                {
                    temp_array[i] = Integer.parseInt(numbers[i]);
                }
                else
                {
                    System.out.println("Введеный вами ряд чисел не соответствует требованиям");
                    check = true;
                    break;
                }
            }

            if(!check)setInt_array(temp_array);
        }
    }

    public void StartMainTask()
    {
        ArrayInit();
        System.out.println("Choose Task number 1-7");
        System.out.println("0. Если хотите изменить данные в массиве\n" +
                "1.     Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.\n" +
                "2.     Вывести числа в порядке возрастания (убывания) значений их длины.\n" +
                "3.     Вывести на консоль те числа, длина которых меньше (больше) средней длины по всем числам, а также длину.\n" +
                "4.     Найти число, в котором количество различных цифр минимально. Если таких чисел несколько, найти первое из них.\n" +
                "5.     Найти количество чисел, содержащих только четные цифры, а среди оставшихся — количество чисел с равным числом четных и нечетных цифр.\n" +
                "6.     Найти число, цифры в котором идут в строгом порядке возрастания. Если таких чисел несколько, найти первое из них.\n" +
                "7.     Найти число, состоящее только из различных цифр. Если таких чисел несколько, найти первое из них.");
        Scanner scanner = new Scanner(System.in);
        Integer s = -1;
        do {
            String z  = scanner.nextLine();
            if (Tryparse.tryParseInt(z))
            {
                s = Integer.valueOf(z);
                switch (s)
                {
                    case 0:
                        ArrayInit();
                        s = -1;
                    break;
                    case 1:
                          FirstTask();
                        break;
                    case 2:
                         SecondTask();
                        break;
                    case 3:
                        ThirdTask();
                        break;
                    case 4:
                        FourthTask();
                        break;
                    case 5:
                        FifthTask();
                        break;
                    case 6:
                        SixthTask();
                        break;
                    case 7:
                        SeventhTask();
                        break;
                    default:
                        System.out.println("Wrong numbers,Try again");
                        break;
                }

            }
            else
            {
                System.out.println("You should to write a number");
            }

        } while (!(s >= 1 && s <= 7));
    }
    private  void SeventhTask()
    {
        String answer = "";
        Integer[] array = getInt_array();
        for (int i = 0; i < array.length ; i++)
        {
            String s = array[i].toString();
            if(s.length() >1)
            {
                boolean c = true;
                for (int j = 0; j < s.length(); j++)
                {

                    for (int k = j+1; k <s.length(); k++)
                    {
                        if (s.charAt(j)==s.charAt(k))
                        {
                            c = false;
                            break;
                        }
                    }
                    if(!c) break;
                }
                if(c)answer = array[i].toString();
            }
        }
        System.out.println(answer.length() > 1 ? "Число, состоящее только из различных цифр: "+answer: "Такого числа нет");
    }
    private void SixthTask()
    {
        String number = "";
        Integer[] array = getInt_array();
        for (int i = 0; i < array.length; i++)
        {
            String s =array[i].toString();
            if(s.length()>1)
            {
                boolean check = true;
                for (int j = 1; j < s.length(); j++)
                {
                    if(s.charAt(j-1)>=s.charAt(j))//(!!!убарть!!равно!!!)а что считать под строигим ? допустим 556 ? идут в порядки возростания? да ? в строгом?
                    {
                        check = false;
                    }
                }
                if(check) {number = s;break;}
            }
        }
        System.out.println(number.length()>0 ?"Число цифры в котором идут в строгом порядке возрастания: "+number: "Такого числа нет ");
    }

    private void FifthTask()
    {
        int s1 =0,s2=0;
        Integer[] array = getInt_array();
        for (int i = 0; i < array.length ; i++)
        {
            int even = Count_of_even_digits(array[i].toString()),
                odd = Count_of_odd_digits(array[i].toString());
                if(even == array[i].toString().length())s1++;
                if(even == odd) s2++;
        }

        System.out.println("Количество чисел, содержащих только четные цифры: "+s1);
        System.out.println("Количество чисел с равным числом четных и нечетных цифр: "+s2);
    }
    private void FourthTask()
    {
        Integer[] array = getInt_array();
        int a = Integer.MAX_VALUE;//Текушее количество различных цифор в числе
        int b = 0;//Текушее число
        for (int i = 0; i < array.length; i++)
        {
            if (array[i].toString().length()>1)
            {
                String s = array[i].toString();
                //Если длинна числа равна 2
                if(s.length() == 2 )
                {
                    if(s.charAt(0)==s.charAt(1))
                    {
                        b =  array[i];
                        break;
                    }
                }
                //Если больше 2
                else
                {
                    int answer = Integer.MAX_VALUE;
                    for (int j = 0; j < s.length(); j++)
                    {
                        int count_of_duplicates = s.length();
                        for (int k = 0; k < s.length(); k++)
                        {
                            if(j!=k)
                            {
                              count_of_duplicates -= s.charAt(j) == s.charAt(k) ? 1 : 0;
                            }
                        }

                        answer = count_of_duplicates < answer ? count_of_duplicates : answer; // минимальное количестов дубликатов во всем числе
                    }
                    if (answer == 0)
                    {
                        b = array[i];
                        break;
                    }
                    else
                    {
                        b = a > answer ? array[i] : b;
                        a = a > answer ? answer : a;

                    }
                }
            }
        }
        System.out.println(b == 0? "В веденном вами массиве нет требуемого числа" : "Число с минимальным количество различных цифр: "+b);
    }
    private void  ThirdTask()
    {
        String str="",str1="",str2="";
        double avg =0;
        for (var item: getInt_array())
        {
         avg += item;
        }
        avg = (double) avg/getInt_array().length;
        for (var item: getInt_array())
        {
            if (item == avg) str2+=item+" ";
            if(item>avg) str+=item+" ";
            else str1 +=item+" ";
        }
        System.out.println("Среднее число "+avg);
        System.out.println("Числа больше среднего: "+str);
        System.out.println("Числа меньше среднего: "+str1);
        System.out.println(str2.length() > 0 ? "Числа равные среднему: "+str2 : "");

    }
    private void SecondTask()
    {
        //Не хочу париться со switch case))и ласт пробелом
        Arrays.sort(getInt_array());
        String s = "";
        for (var item :getInt_array())
        {
         s += item+" ";
        }
        System.out.println("Вывод по возростанию: "+s);
        s = "";
        Arrays.sort(getInt_array(), Collections.reverseOrder());
        for (var item : getInt_array())
        {
            s+= item+" ";
        }
        System.out.println("Вывод по убыванию: "+s);
    }
    private void FirstTask()
    {
         Arrays.sort(getInt_array());
        System.out.println(getInt_array().length > 1 ? "Самое короткое число: "+getInt_array()[0]+ " Самое длинное число: "+getInt_array()[getInt_array().length-1] : "Массив состоит из одного элемента "+getInt_array()[0]);
    }

    private Integer Count_of_even_digits(String number)
    {
        int count = 0;
        for (int i = 0; i <number.length() ; i++)
        {
            if(Integer.parseInt(String.valueOf(number.charAt(i)))%2 == 0)
            {
                count++;
            }
        }
        return count;
    }
    private Integer Count_of_odd_digits(String number)
    {
        int count = 0;
        for (int i = 0; i <number.length() ; i++)
        {
            if(Integer.parseInt(String.valueOf(number.charAt(i)))%2 > 0)
            {
                count++;
            }
        }
        return count;
    }
}
