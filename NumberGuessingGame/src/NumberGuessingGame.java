import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args){
        Random rand = new Random();
        int secretNumber = rand.nextInt(21);

        Scanner keyboard = new Scanner(System.in);

        int userAttempts = 0;
        int userGuess = 0;
        //String repeatChoice = "y";
        boolean repeatChoice = true;

        System.out.println("Hello! What is your name?");
        String userName = keyboard.nextLine();

//        System.out.println("Well," + userName + ", I am thinking of a number between 1 and 20.");
//        System.out.println("Take a guess.");
//        userGuess = keyboard.nextInt();

        // Put user's choice logic inside a for loop that iterates 6 times
        // break the for loop if the user is correct and go back to the while loop
        // in while loop check if user wants to play again
        while(repeatChoice){
            System.out.println("Well," + userName + ", I am thinking of a number between 1 and 20.");
            System.out.println("Take a guess.");
            userGuess = keyboard.nextInt();

            for (int i  = 0; i <= 6; i++){
                if(userGuess < secretNumber){
                    System.out.println("Your guess is too low.");
                    System.out.println("Take a guess.");
                    userGuess = keyboard.nextInt();
                    userAttempts++;
                }
                else if(userGuess > secretNumber){
                    System.out.println("Your guess is too high.");
                    System.out.println("Take a guess.");
                    userGuess = keyboard.nextInt();
                    userAttempts++;
                }
                else {
                    //System.out.println("Good job," + userName + "! You guessed my number in" + userAttempts + "guesses!");
                    //System.out.println("Would you like to play again? (y or n)");
                    break;
                   // repeatChoice = keyboard.nextLine();
                    //keyboard.nextLine();
                }
            }

            System.out.println("Good job," + userName + "! You guessed my number in" + userAttempts + "guesses!");
            System.out.println("Would you like to play again? (y or n)");
            String input = keyboard.nextLine();
            if (input.equals("n"))
                repeatChoice = false;
        }
//        while (userAttempts < 6 && !repeatChoice.equals("n")){
//            if(userGuess < secretNumber){
//                System.out.println("Your guess is too low.");
//                System.out.println("Take a guess.");
//                userGuess = keyboard.nextInt();
//                userAttempts++;
//            }
//            else if(userGuess > secretNumber){
//                System.out.println("Your guess is too high.");
//                System.out.println("Take a guess.");
//                userGuess = keyboard.nextInt();
//                userAttempts++;
//            }
//            else {
//                System.out.println("Good job," + userName + "! You guessed my number in" + userAttempts + "guesses!");
//                System.out.println("Would you like to play again? (y or n)");
//                repeatChoice = keyboard.nextLine();
//                keyboard.nextLine();
//            }
//        }

    }
}
