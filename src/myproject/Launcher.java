package myproject;

public class Launcher {
    public static void main(String[] args) {
        new Student().myexperience(" Bugema University!!");
        String [] student = new String[4];
        student[2]="Gama";
       student[1]="Godfrey";
        student[0]="Edward";
        student[3]="Fred";
        gsoc(student);
    }
    public static<E>void gsoc(E []value){
        for(E element: value) {
            System.out.printf("%s", element + " ");
            System.out.println();
        }

    }
}
