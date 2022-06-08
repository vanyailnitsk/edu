public class Student {
    String name;
    int ege;
    int[] univ = new int[2];
    int currentPos=0;
    public Student (String name,int ege,int[] univ)
    {
        this.name = name;
        this.ege = ege;
        for (int i=0;i<this.univ.length;i++)
        {
            this.univ[i] = univ[i];
        }
    }
}