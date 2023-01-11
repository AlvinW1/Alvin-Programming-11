public class Teacher {

    /* These are all the strings that are used in the Teacher class to store information, and they are set to private so
    that it cant be accessed elsewhere */
    private String firstName;
    private String lastName;
    private String subject;

    /* This saves the code so whatever I type in to assign the Strings they are saved to the specific thing I typed in */
    Teacher(){
        firstName = "";
        lastName = "";
        subject = "";
    }

    /* This code is so that I can add information to the Teacher string by typing whatever into the allocated slots in the
    main class */
    Teacher(String firstName, String lastName, String subject){
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;

        /* These are the getters and setters for the private Strings */
    }
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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }


    /* This is the code so when the computer prints out a Teachers name it will follow this format to display the message */
    public String toString(){
        return "Name:" + this.firstName +" " + this.lastName +", " + "Subject:"  + this.subject;
    }
}