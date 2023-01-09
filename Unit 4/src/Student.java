public class Student {

    /* These are all the String that are used for the Student class to store information, and they're set to private,
    so they cant be accessed elsewhere */
    private String firstName;
    private String lastName;
    private String grade;
    static int sdNumber = 1;
    private int studentNumber;

    /* This saves the code so whatever I type in to assign the Strings they are saved to the specific thing I typed in */

    Student() {
        firstName = "";
        lastName = "";
        grade = "";
        studentNumber = sdNumber;
        sdNumber++;
    }
    /* This code is so that I can add information to the Students string by typing whatever into the allocated slots in
    the main class */
    Student(String firstName, String lastName, String grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        this.studentNumber = sdNumber;
        sdNumber++;
    }
    /* These are the getters and setters for the private Strings */


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

   /* This is the code so when the computer prints out a Students name it will follow this format to display the message */
    public String toString() {
        return "Name:" + this.firstName + " " + this.lastName + ", " + "Grade:" + this.grade + ", " + "Student Number:" +
                this.studentNumber;
    }
}
