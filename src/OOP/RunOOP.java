package OOP;


import OOP.StudentPackage.Faculty;
import OOP.StudentPackage.Group;
import OOP.StudentPackage.StudentTask;
import Сontrol.Tryparse;

import java.util.Scanner;

public class RunOOP
{
    StudentTask studentTask = new StudentTask();


    public void startMain()
    {
        System.out.println("1) список студентов заданного факультета;\n" +
                "2) списки студентов для каждого факультета и курса;\n" +
                "3) список студентов, родившихся после заданного года;\n" +
                "4) список учебной группы.");
        Scanner scanner = new Scanner(System.in);
        Integer s = -1;
        do {
            String z  = scanner.nextLine();
            if (Tryparse.tryParseInt(z))
            {
                s = Integer.valueOf(z);
                switch (s)
                {

                    case 1:
                        start1();
                        break;
                    case 2:
                        start2();
                        break;
                    case 3:
                        start3();
                        break;
                    case 4:
                        start4();
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

        } while (!(s >= 1 && s <= 4));
    }




    void start1()
    {

        for (var item:studentTask.studentOfFaculty(Faculty.Строительства))
        {
            System.out.println( item.toString());
        }
    }
    void start2()
    {

        for (var item : studentTask.facultyAndCourse(Faculty.Инфорамтики,3))
        {
            System.out.println(item.toString());
        }
    }
    void start3()
    {
        for (var item : studentTask.studentBirthAfterYear(1998))
        {
            System.out.println(item.toString());
        }
    }
    void start4()
    {
        for (var item : studentTask.studentsOfGroup(Group.Pin_1705))
        {
            System.out.println( item.toString());
        }
    }

}
