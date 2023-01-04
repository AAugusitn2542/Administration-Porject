public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailBoxCapicty;
    private String alternateEmail;

    // contructor to reievece the first and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName; // this is refer to the class variable and lastname is refer to local varibable
        System.out.println("Email Created" + this.firstName + this.lastName);
    }

    // ask for the department

    // set the mailbpx cap

    // define an alternate email address

    // change the password
}
