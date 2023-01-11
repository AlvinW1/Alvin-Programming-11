import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Teacher> teachers = new ArrayList<>();
        ArrayList<Student> students = new ArrayList<>();

        /* Here the  Teacher list is created and their first name, last name, and Subject is typed in so that
         * it says their information when it's printed out  */
        System.out.println("Teachers: ");
        Teacher Susan = new Teacher("Susan", "Ko", "Math");
        teachers.add(Susan);

        Teacher Klop = new Teacher("Klop", "Lop", "Social Studies");
        teachers.add(Klop);

        Teacher Paiza = new Teacher("Paiza", "Qrtt", "Chemistry");
        teachers.add(Paiza);

        /* The code then takes all the stored teachers in the Arraylist and prints them out */
        for (int i = 0; i < teachers.size(); i++) {
            System.out.println(teachers.get(i));
        }
        System.out.println();
        System.out.println("Students:");

        /* Here the  Students list is created and their first name, last name, and Grade is typed in so that
         * it says their information when it's printed out  */
        Student Joe = new Student("Joe", "Ho", "7");
        students.add(Joe);

        Student Matt = new Student("Matt", "Dsad", "9");
        students.add(Matt);

        Student Maddie = new Student("Maddie", "Sal", "8");
        students.add(Maddie);

        Student Donald = new Student("Donald", "Pop", "12");
        students.add(Donald);

        Student Katie = new Student("Katie", "Mcdonald", "11");
        students.add(Katie);

        Student Sarah = new Student("Sarah", "Dow", "12");
        students.add(Sarah);

        Student Anthony = new Student("Anthony", "Am", "10");
        students.add(Anthony);

        Student Dylan = new Student("Dylan", "Lo", "7");
        students.add(Dylan);

        Student Rachel = new Student("Rachel", "Siu", "11");
        students.add(Rachel);

        Student Hi = new Student("Hi", "Bye", "8");
        students.add(Hi);

        /* The code then takes all the stored Students in the Arraylist and prints them out */
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
        /* This code removes 2 Students and 1 Teacher from the list */
        students.remove(Katie);
        students.remove(Sarah);
        teachers.remove(Susan);

        System.out.println();

        /*This prints out the new Teachers list after the teacher gets removed */
        System.out.println("Updated Teachers list:");
        for (int i = 0; i < teachers.size(); i++) {
            System.out.println(teachers.get(i));
        }
        System.out.println();

        /* This prints out the new Students list after the teacher gets removed*/
        System.out.println("Updated Students list:");
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));


        }
    }
}