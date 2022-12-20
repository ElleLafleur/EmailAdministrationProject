import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGenerator;

/*It should generate a new email based on the
employee’s first name, last name, and department
 */
public class EmailInfo {

    //String newPass;

    static String getFirstName() {
        Scanner fName = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String firstName = fName.nextLine();
        return firstName;
    }

    static String getLastName() {
        Scanner lName = new Scanner(System.in);
        System.out.println("Enter your last name: ");
        String lastName = lName.nextLine();
        return lastName;
    }

    static String getDepartment() {
        Scanner dept = new Scanner(System.in);
        System.out.println("Enter your Department: ");
        String department = dept.nextLine();
        return department;
    }

    static String getPassword() {
        String password = new Random().ints(10, 33, 122).collect(StringBuilder::new,
                        StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        return password;
    }

    public static void setMailboxCapacity(){
        Random mailboxCapicity = new Random(); //instance of random class
        int upperbound = 101;
        int capacity = mailboxCapicity.nextInt(upperbound);
        System.out.printf("Mailbox Capacity: " + capacity + "GB");
    }


//     String getNewPassword() {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Would you like to create a new password?");
//        String answer = input.nextLine();
//        switch(answer){
//             case "yes", "Yes", "YES":
//                Scanner sc = new Scanner(System.in);
//                System.out.println("Please enter your new password: ");
//                this.newPass = sc.nextLine();
//                String[] newPass = new String[]{this.newPass};
//                    if (newPass.length < 8) {
//                        System.out.println("Your Password has to be between 8 - 10 Characters long");
//                        System.out.println("The generated password is your new password!");
//                    if (newPass.length == 10) {
//                        System.out.println("Thank You");
//                        System.out.println("Please keep all information regarding your password in a safe place");
//                }
//            }
//        default:
//            System.out.println("Password security is important. It is advised that you change your password to something that you can remember.");
//            break;
//
//    }
//
//        return newPass;
//}

 static void theEmail(){
        System.out.println("Your email is " +getFirstName()+"."+ getLastName()+ "@"+getDepartment()+".company.com");
        System.out.println("Your password is: " +getPassword());

        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to create a new password?");
        String answer = input.nextLine();
        switch(answer){
         case "yes", "Yes", "YES":
             Scanner sc = new Scanner(System.in);
             System.out.println("Please enter your new password: ");
             String an = sc.nextLine();
             System.out.println("Your new password is: "+ an);
             //             String[] newPass = new String[]{};
//             if (newPass.length < 8) {
//                 System.out.println("Your Password has to be between 8 - 10 Characters long");
//                 System.out.println("The generated password is your new password!");
//
//                 if (newPass.length == 10) {
//                     System.out.println("Thank You");
//                     System.out.println("Please keep all information regarding your password in a safe place");
//                 }
//             }
         default:
             //System.out.println("Thank You");
             System.out.println("Please keep all information regarding your password in a safe place");
             break;

        }

     //return answer;
 }

}
