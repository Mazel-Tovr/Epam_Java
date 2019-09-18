package Main_Task;
import Сontrol.Tryparse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Optional_Task_1
{
    private Integer[] int_array;
    public void setInt_array(Integer[] int_array) { this.int_array = int_array; }

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
                        // SecondTask();

                        break;
                    case 3:
                        //ThirdTask();

                        break;
                    case 4:
                        //FourthTask();

                        break;
                    case 5:
                        //FifthTask();

                        break;
                    case 6:
                        //SixthTask();
                        break;
                    case 7:
                        //SeventhTask();
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

    private void FirstTask()
    {

    }


}
