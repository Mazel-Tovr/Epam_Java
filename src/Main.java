import Main_Task.MainTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
       /*
    1.     Приветствовать любого пользователя при вводе его имени через командную строку.

2.     Отобразить в окне консоли аргументы командной строки в обратном порядке.

3.     Вывести заданное количество случайных чисел с переходом и без перехода на новую строку

4.     Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль.

5.   Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу. Осуществить проверку корректности ввода чисел.
     */

    public static void main(String[] args) throws IOException
    {
        System.out.println("Choose Task number");
        System.out.println("MAIN TASK = 1");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Integer s = Integer.parseInt(reader.readLine());
        if(s>=1 && s<=5) {
            switch (s) {
                case 1:
                   MainTaskStart();
                    break;
                case 2:

                    break;
            }
        }
        else
        {
            System.out.println("Wrong numbers");
        }
    }


    private  static  void MainTaskStart() throws IOException {
        System.out.println("Choose Task number 1-3");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Integer s = Integer.parseInt(reader.readLine());
        if(s>=1 && s<=3) {
            switch (s) {
                case 1:
                    MainTask start = new MainTask();
                    start.StartMainTask();
                    break;
                case 2:

                    break;
                case 3:

                    break;
            }
        }
        else
        {
            System.out.println("Wrong numbers");
        }
    }
}
