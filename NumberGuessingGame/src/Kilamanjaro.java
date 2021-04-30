import java.util.Scanner;

public class Kilamanjaro {
    public static void main(String[] args) {
        boolean keepGoing = true;
        Scanner scan = new Scanner(System.in);

        while (keepGoing){

            for(int i = 0; i <= 6; i++){
                System.out.println(i);
            }

            System.out.println("Enter y to keep going or n to stop: ");
            String test = scan.nextLine();
            if(test.equals("n")){
                keepGoing = false;
            }
        }

        System.out.println("Game over.");
    }
}
