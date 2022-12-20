import java.util.Random;
import java.util.Scanner;

/*It should generate a new email based on the
employee’s first name, last name, and department
 */
public class Email {

    /*
       Class Instance Variables
     *///---------------------------------------------------------------------------------
    private String firstName;
    private String lastName;
    private String department;
    private String password;
    public final static int capacity = 10;
    //---------------------------------------------------------------------------------


    /*
        Constructor
            - most classes should have them
            - this method is called when an object of this class is created
    *///---------------------------------------------------------------------------------
    public Email(String firstName, String lastName, String department, String password) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setDepartment(department);
        this.setPassword(password);
    }
    //---------------------------------------------------------------------------------

    /*
        Mutators(set) and Accessor(gets)
        - using these methods prevents the user from directly accessing class member variables(information hiding)
     *///---------------------------------------------------------------------------------
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public String getDepartment() {
        return department;
    }
    public void setPassword(String password) {

        if(password.isEmpty()) {
            this.password =  new Random().ints(10, 33, 122).collect(StringBuilder::new,
                            StringBuilder::appendCodePoint, StringBuilder::append)
                    .toString();
        }
        else {
            this.password = password;
        }
    }
    public String getPassword() {
        return password;
    }
    //---------------------------------------------------------------------------------

    // Executable method
    public static void main(String[] args) {

        // Only a single scanner is needed
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first name:\t");
        String firstName = scanner.nextLine();

        System.out.print("Enter your last name:\t");
        String lastName = scanner.nextLine();

        System.out.print("Enter your Department:\t");
        String department = scanner.nextLine();

        Email email = new Email(firstName, lastName, department, "");

        System.out.println("Your email is " + email.getFirstName()+"."+ email.getLastName()+ "@"+ email.getDepartment()+".company.com");
        System.out.println("Your password is: " + email.getPassword());


        System.out.println("Would you like to create a new password?");
        String answer = scanner.nextLine();

        switch(answer.toLowerCase()){
            case "yes":
                System.out.print("Please enter your new password: ");
                String password = scanner.nextLine();
                System.out.println("Your new password is: "+ password);
                email.setPassword(password);
                break; // don't forget break, or it will always fall through to final case
             default:
                System.out.println("Please keep all information regarding your password in a safe place");
                break;
        }

        scanner.close(); // good practice to always release resources you opened and are finished with
    }

}
