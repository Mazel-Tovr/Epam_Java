import Main_Task.MainTask;
import Main_Task.Optional_Task_1;
import Сontrol.Tryparse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main
{

    public static void main(String[] args) throws IOException
    {

        boolean z = true;
        while (z)
        {
            System.out.println("Choose Task number");
            System.out.println("MAIN TASK = 1\n" + "In progress = 2\n"+"Exit = 0");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String a = reader.readLine();
            Integer s = Integer.MIN_VALUE;
            if (Tryparse.tryParseInt(a))
            {
                s = Integer.parseInt(a);
            }

            switch (s)
            {
                case 0 : z=false;
                    break;
                case 1:
                    MainTaskStart();
                   // z = false;
                    break;
                case 2:

                   // z = false;
                    break;
                default:
                    System.out.println("Wrong numbers, Try again 1 - ..");
                    break;
            }
        }

    }


    private  static  void MainTaskStart() throws IOException {
        System.out.println("Choose Task number 1-3\n"+"Main Task = 1\n"+"Optional Task 1 = 2\n"+"In progress = 3");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean z =true;
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
                        MainTask start = new MainTask();
                        start.StartMainTask();
                        z = false;
                        break;
                    case 2:
                        Optional_Task_1 ot = new Optional_Task_1();
                        ot.StartMainTask();
                        z = false;
                        break;
                    case 3:

                        z=false;
                        break;

                    default:
                        System.out.println("Wrong numbers");
                        break;
                }

        }

    }
}
