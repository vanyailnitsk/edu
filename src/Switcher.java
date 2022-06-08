import java.util.ArrayList;

public class Switcher {
    public static University[] ListOfUniv = new University[10];
    public static Student[] ListOfStudents = new Student[10];
    public static int numOfUniv = 0;
    public static int numOfStudents = 0;
    public static void addUniv(University university)
    {
        ListOfUniv[numOfUniv]=university;
        numOfUniv++;
    }
    public static void addStudent(Student student)
    {
        ListOfStudents[numOfStudents]=student;
        numOfStudents++;
    }
    public static void initialize()
    {
        for (int i=0;i<numOfUniv;i++)
        {
            for (int j=0;j<numOfStudents;j++)
            {
                University tempUniv = ListOfUniv[i];
                Student tempStud = ListOfStudents[j];
                if (tempStud.univ[tempStud.currentPos]==tempUniv.id)
                {
                    ListOfUniv[i].addStudent(tempStud);
                    ListOfUniv[i].sort();
                }
            }
        }
    }

    public static void printListOfStudents()
    {
        for (int i=0;i<numOfStudents;i++)
        {
            Student temp = ListOfStudents[i];
            System.out.printf("Student %s : %d ballov\n",temp.name,temp.ege);
        }
    }


}
