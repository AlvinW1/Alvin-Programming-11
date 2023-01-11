import java.util.ArrayList;

public class School {
    /* These are the two ArrayList to store information in the list */
    ArrayList<String> teachers = new ArrayList<>();
    ArrayList<String> students = new ArrayList<>();

    /* These are all the strings that are used in the School class to store information, and they are set to private so
that it cant be accessed elsewhere */
    private String lastName;
    private String firstName;
    private String countryBirth;

    /* This saves the code so whatever I type in to assign the Strings they are saved to the specific thing I typed in */
    School() {
        lastName = "";
        firstName = "";
        countryBirth = "";
    }
    /* This code is so that I can add information to the School String by typing whatever into the allocated slots in the
    main class */
    School(String firstName, String lastName, String countryBirth ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.countryBirth = countryBirth;
    }
    /* These are the getters and setters for the private Strings */
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getCountryBirth() {
        return countryBirth;
    }

    public void setCountryBirth(String countryBirth) {
        this.countryBirth = countryBirth;
    }


}
