import java.util.Scanner;

public class HangmanGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // checks if whole word has been guessed
        boolean wholeWordGuessed = false;

        int lettersMatched = 0;

        String secretWord = "cat";

        String[] lettersGuessed = new String[secretWord.length()];

        System.out.println("Guess a letter.");
        String input = scan.nextLine();
        for (int i = 0; i < lettersGuessed.length; i++){
            lettersGuessed[i] = scan.nextLine();
        }
        for (int i = 0; i < lettersGuessed.length; i++){
            System.out.println(lettersGuessed[i]);
        }



//        while (wholeWordGuessed){
//            System.out.println("HANGMAN");
//            System.out.println("+---+");
//            System.out.println("|");
//            System.out.println("|");
//            System.out.println("|");
//            System.out.println("===");
//        }
    }
}
