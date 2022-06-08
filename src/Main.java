

public class Main {
    public static void main(String[] args) {
        Student vanya = new Student("Vanya",269,new int[]{1,2});
        Student kolya = new Student("Kolya",271,new int[]{2,1});
        Student dima = new Student("Dima",280,new int[]{1,2});
        University Bonch = new University("Bonch",1,3);
        University Spbgu = new University("Spbgu",2,3);

        Switcher.addStudent(vanya);
        Switcher.addStudent(kolya);
        Switcher.addStudent(dima);
        Switcher.addUniv(Bonch);
        Switcher.addUniv(Spbgu);
        //Switcher.printListOfStudents();
        Switcher.initialize();
        Switcher.ListOfUniv[0].printStudents();
        System.out.println("\nNext\n");
        Switcher.ListOfUniv[1].printStudents();
    }

}

