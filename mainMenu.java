 import java.util.Scanner;

 public class mainMenu {

     Scanner scanner = new Scanner(System.in);
     Boolean running = true;

     while(running)
     {
         System.out.println(
                 "Welcome to Nick's coding challenges! To see a program in action, enter the digit and then the Enter key!");
         String input = scanner.nextLine();

         switch (input) {
//             case "1":

//                 String usernameInput = inputUtil.retrieveString("Username:\t");
//                 String passwordInput = inputUtil.retrieveString("Password:\t");

//                 Boolean areCredentialsValid = userService.validateCreds(new User(usernameInput, passwordInput));

//                 if (areCredentialsValid) {
//                     System.out.println("Welcome " + usernameInput + "!"); // add username
//                 } else {
//                     System.out.println("Invalid username or password");
//                 }

//                 break;

//             case "2":

//                 String usernameInput2 = inputUtil.retrieveString("Username:\t");
//                 String passwordInput2 = inputUtil.retrieveString("Password:\t");
//                 String firstNameInput2 = inputUtil.retrieveString("First name:\t");
//                 String lastNameInput2 = inputUtil.retrieveString("Last name:\t");

//                 User userToCreate = new User(usernameInput2, passwordInput2, firstNameInput2, lastNameInput2);
//                 User userFromDB = userService.createUser(userToCreate);

//                 if (userFromDB == null) {
//                     System.out.println("Username already taken, be someone new.");
//                 } else {
//                     userService.createUser(userToCreate);
//                     System.out.println("User created!");
//                 }
//                 break;

//             case "3":
//                 running = false;
//                 break;

//             default:
//                 System.out.println("Please select a valid option 1-3");
//                 break;
         }

     }
 }
