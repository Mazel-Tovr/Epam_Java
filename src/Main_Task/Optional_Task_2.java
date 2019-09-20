package Main_Task;

import Сontrol.Tryparse;

import java.util.Random;
import java.util.Scanner;

public class Optional_Task_2 {

    private Integer[][] array;
    private int N = 0, M = 0;

    public Integer[][] getArray() {
        return array;
    }

    public void setArray(Integer[][] array) {
        this.array = array;
    }

    private void DataInit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Для выполения данной группы заданий введите \n" + "1 N - размерность матрицы\n" + "2 M - интервал значений");

        do {
            System.out.println("Введите N");
            String z = scanner.nextLine();
            if (Tryparse.tryParseInt(z)) {
                N = Integer.parseInt(z);
                break;
            } else {
                System.out.println("You should to write a number");
            }
        } while (true);

        do {
            System.out.println("Введите M");
            String z = scanner.nextLine();
            if (Tryparse.tryParseInt(z)) {
                M = Integer.parseInt(z);
                break;
            } else {
                System.out.println("You should to write a number");
            }
        } while (true);
        Random rnd = new Random();
        Integer[][] arr = new Integer[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = -M + rnd.nextInt(M - (-M));
                ;
            }
        }
        setArray(arr);

    }

    public void StartMainTask() {
        DataInit();

        System.out.println("Choose Task number 1-2");
        System.out.println("1.     Упорядочить строки (столбцы) матрицы в порядке возрастания значений элементов k-го столбца (строки).\n" +
                "2.     Найти и вывести наибольшее число возрастающих (убывающих) элементов матрицы, идущих подряд.");
        Scanner scanner = new Scanner(System.in);
        Integer s = -1;
        do {
            String z = scanner.nextLine();
            if (Tryparse.tryParseInt(z))
            {
                s = Integer.valueOf(z);

                switch (s) {
                    case 1:
                        FirstTask(getArray());
                        break;
                    case 2:
                        SecondTask();
                        break;
                    default:
                        System.out.println("Wrong numbers,Try again");
                        break;
                }
            } else {
                System.out.println("You should to write a number");
            }
        } while (!(s >= 1 && s <= 2));
    }

    private void SecondTask()
    {
     Integer[][] array = getArray();
     int index = -1; //Текуший индекс столбца с наибольшим числом возрастающих элементов.
     int count = 0;//Текушее число возрастающих  элементов, идущих подряд
        //Столбец
        for (int i = 0; i < array.length ; i++)
        {
            int countt = 0;
            int countperv = 0;
            int countcurent = 0;
            for (int j = 1; j <array.length ; j++)
            {

                if(array[i][j-1]<=array[i][j])
                {
                    countcurent++;
                }
                else
                {
                    countperv = countperv<countcurent ? countcurent : countperv;
                    countcurent = 0;
                }
            }
            countt = countperv < countcurent ? countcurent : countperv;
            if(countt == array.length-1)
            {
                index = i;
                break;
            }
            index = count < countt ? i : index;
            count = count < countt ? countt : count;

        }

            if(index>0)
            {
                System.out.println("Последовательность: ");
                for (int i = 0; i < array.length; i++)
                {
                    System.out.print(array[index][i]+" ");
                }
                //В count можно смело +1 ставить
                System.out.println("Макс число наибольшее число возрастающих элементов: " +count + " Столбец: "+index);
            }
            else System.out.println("Такой последовательности нет");

        int index1 = -1; //Текуший индекс столбца с наибольшим числом возрастающих элементов.
        int count1 = 0;//Текушее число возрастающих  элементов, идущих подряд
        //Столбец
        for (int i = 0; i < array.length ; i++)
        {
            int countt = 0;
            int countperv = 0;
            int countcurent = 0;
            for (int j = 1; j <array.length ; j++)
            {

                if(array[i][j-1]>=array[i][j])
                {
                    countcurent++;
                }
                else
                {
                    countperv = countperv<countcurent ? countcurent : countperv;
                    countcurent = 0;
                }
            }
            countt = countperv < countcurent ? countcurent : countperv;
            if(countt == array.length-1)
            {
                index1 = i;
                break;
            }
            index1 = count < countt ? i : index1;
            count1 = count < countt ? countt : count1;

        }

        if(index1>0)
        {
            System.out.println("Последовательность: ");
            for (int i = 0; i < array.length; i++)
            {
                System.out.print(array[index1][i]+" ");
            }
            //В count можно смело +1 ставить
            System.out.println("Макс число наибольшее число убывающих элементов: " +count1 + " Столбец: "+index1);
        }
        else System.out.println("Такой последовательности нет");
    }
    private void FirstTask(Integer[][] myArr) {
        for (int k = 0; k < N; k++) {
            for (int l = 0; l < N; l++) {
                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < N; j++) {
                        if (i + 1 == N && j + 1 == N) {
                            continue;
                        } else {
                            if (j + 1 == N && myArr[i][j] > myArr[i + 1][0]) {
                                int t = myArr[i][j];
                                myArr[i][j] = myArr[i + 1][0];
                                myArr[i + 1][0] = t;
                            } else {
                                if (j + 1 != N && myArr[i][j] > myArr[i][j + 1]) {
                                    int t = myArr[i][j];
                                    myArr[i][j] = myArr[i][j + 1];
                                    myArr[i][j + 1] = t;
                                }
                            }
                        }
                    }
                }
            }
        }
        for (int i = 0; i < N; i++)
        {
            String s = "";
            for (int j = 0; j < N; j++) {
                s += myArr[i][j] + "\t";
            }
            System.out.println(s);
        }
    }
}

