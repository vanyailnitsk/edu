

public class University{
    String name;
    int id;
    int places;
    int currNumOfStud = 0;
    Student[] students = new Student[5];
    public University(String name, int id,int places)
    {
        this.name = name;
        this.id = id;
        this.places = places;
    }
    public void addStudent(Student student)
    {
        this.students[currNumOfStud] = student;
        currNumOfStud++;
    }
    public void printStudents()
    {
        for (int i=0;i<places;i++)
        {
            if (students[i]!=null)
            {
                System.out.printf("Student %s: %d ballov\n",students[i].name,students[i].ege);
            }
        }
    }
    public void sort()
    {
        for (int i=0;i<currNumOfStud;i++)
        {
            for (int j=0;j<currNumOfStud-1;j++)
            {
                if (students[j].ege<students[j+1].ege)
                {
                    Student buf = students[j];
                    students[j] = students[j+1];
                    students[j+1] = buf;
                }
            }
        }
    }
}
