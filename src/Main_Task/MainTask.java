package Main_Task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

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
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    Integer s = Integer.parseInt(reader.readLine());
        if(s>=1 && s<=5)
        {
    switch (s)
    {
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
    }
}
        else
    {
        System.out.println("Wrong numbers");
    }
}
private void FifthTask()
{
}
private void FourthTask()
{}
    private  void ThirdTask() throws IOException
    {
        System.out.println("Third Task Enter numbers count");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Integer s = Integer.parseInt(reader.readLine());
        System.out.println("Без перехода 0 или с переходом 1");
        Integer z = Integer.parseInt(reader.readLine());
        Random rnd = new Random();
        if(z == 0  || z ==1)
        {
            switch (z)
            {
                case 0:
                    for (int i = 0; i < s; i++)
                    {
                        System.out.print(i< s+1 ? rnd.nextInt(100) + " " : rnd.nextInt(100));
                    }
                    break;
                case 1:
                    for (int i = 0; i < s ; i++)
                    {
                        System.out.println(rnd.nextInt(100));
                    }
                    break;

            }
        }
         else
            {
                System.out.println("Wrong numbers");
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
