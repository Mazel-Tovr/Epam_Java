package Main_Task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import Сontrol.Tryparse;



/*
1.     Приветствовать любого пользователя при вводе его имени через командную строку.
2.     Отобразить в окне консоли аргументы командной строки в обратном порядке.
3.     Вывести заданное количество случайных чисел с переходом и без перехода на новую строку
4.     Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль.
5.     Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу. Осуществить проверку корректности ввода чисел.
 */
public class MainTask
{


    public void StartMainTask() throws IOException {
        System.out.println("Choose Task number 1-5");
        System.out.println("1.     Приветствовать любого пользователя при вводе его имени через командную строку.\n" +
                "2.     Отобразить в окне консоли аргументы командной строки в обратном порядке.\n" +
                "3.     Вывести заданное количество случайных чисел с переходом и без перехода на новую строку\n" +
                "4.     Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль.\n" +
                "5.     Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу. Осуществить проверку корректности ввода чисел.");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean z = true;
        while (z)
        {
            String a = reader.readLine();
            Integer s = Integer.MIN_VALUE;
            if (Tryparse.tryParseInt(a))
            {
                s = Integer.parseInt(a);
            }
            switch (s)
            {
                case 1:
                    FirstTask();
                    z = false;
                    break;
                case 2:
                    SecondTask();
                    z = false;
                    break;
                case 3:
                    ThirdTask();
                    z = false;
                    break;
                case 4:
                    FourthTask();
                    z = false;
                    break;
                case 5:
                    FifthTask();
                    z = false;
                    break;
                default:
                    System.out.println("Wrong numbers");
                    break;
            }
        }
    }





private void FifthTask()throws IOException
{
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    Integer a= null;
    System.out.println("Enter a number");
    String[]months = new String[]{"January","February","March","April","May","June","July","August","September","October","November","December"};
    while (true)
    {
        String str = reader.readLine();
        if(Tryparse.tryParseInt(str) && ( 1<=Integer.valueOf(str) && 12 >= Integer.valueOf(str)))
        {
            a = Integer.valueOf(str);
            break;
        }
        else
        {
            System.out.println("Allowed numbers are between 1 and 12");
        }
    }

    System.out.println(months[a-1]);
}
private void FourthTask()throws IOException
{
    System.out.println("Fourth Task Enter numbers");
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    Double a=null,b=null;
    while (true)
    {
        String str = reader.readLine();
        if(Tryparse.tryParseDouble(str))
        {
            a = Double.valueOf(str);
            break;
        }
        else
        {
            System.out.println("You should to write a number");
        }
    }
    while (true)
    {
        String str = reader.readLine();
        if(Tryparse.tryParseDouble(str))
        {
            b = Double.valueOf(str);
            break;
        }
        else
        {
            System.out.println("You should to write a number");
        }
    }

    System.out.println("Answer: "+ (a + b));
}
    private  void ThirdTask() throws IOException
    {
        System.out.println("Third Task Enter numbers count");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Integer s = null;
        while (true)
        {
            String a = reader.readLine();
            if (Tryparse.tryParseInt(a))
            {
                s = Integer.valueOf(a);
                break;
            }
            else
            {
                System.out.println("Write a number");
            }
        }
        System.out.println("Без перехода 1 или с переходом 2");
        Random rnd = new Random();
        boolean check = true;
        while (check)
        {
            Integer z = Integer.parseInt(reader.readLine());
            switch (z)
            {
                case 1:
                    for (int i = 0; i < s; i++)
                    {
                        System.out.print(i < s + 1 ? rnd.nextInt(100) + " " : rnd.nextInt(100));
                    }
                    check = false;
                    break;
                case 2:
                    for (int i = 0; i < s; i++)
                    {
                        System.out.println(rnd.nextInt(100));
                    }
                    check = false;
                    break;
                default:
                    System.out.println("You should to write  1 or 2 ");

            }
        }
    }




    private  void SecondTask()throws IOException
    {
        System.out.println("Second Task Enter something");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        System.out.println(new StringBuilder(s).reverse().toString());

    }


    private  void FirstTask()  throws IOException
    {
        System.out.println("First Task Enter your name");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        System.out.println("Hi,"+s);
    }
}
