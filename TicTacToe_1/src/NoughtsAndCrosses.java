import java.util.*;

public class NoughtsAndCrosses {
        //storing player's moves. don't know if it's a good idea to have them global
        static ArrayList<Integer> humanMoves =  new ArrayList<>();
        static ArrayList<Integer> computerMoves =  new ArrayList<>();

        public static void main(String[] args) {
            Scanner keyboard = new Scanner(System.in);

            //to randomly pick computer's move
            Random rand = new Random();

            String result = "";

            //board is going to be a 2 dimensional array. first array is the row, second array is the column
            //blank spaces are where X or O will go, other spaces are for boundaries
            char [] [] ticTacToeBoard = {
                    {' ', '|', ' ', '|', ' '},
                    {'-', '|', '-', '|', '-'},
                    {' ', '|', ' ', '|', ' '},
                    {'-', '|', '-', '|', '-'},
                    {' ', '|', ' ', '|', ' '}
            };
            drawBoard(ticTacToeBoard);

            while (true){
                //do I need to create a new Scanner object inside here?
                System.out.println("Where do you want to place your move (1-9)? ");
                int humanLocation = keyboard.nextInt();
                while (humanMoves.contains(humanLocation) || computerMoves.contains(humanLocation)){
                    //keeps asking for input until an empty place is selected
                    System.out.println("Position is already taken. Try again: ");
                    humanLocation = keyboard.nextInt();
                }
                putMove(ticTacToeBoard, humanLocation, "human");
                //check if there is a winner after every player makes a move
                result = winnerCheck();
                if (result.length() > 0){
                    System.out.println(result);
                    break;
                }

                int computerLocation = rand.nextInt(9) + 1; //sets range to 1-9
                //putMove(ticTacToeBoard, computerLocation, "computer");
                while (humanMoves.contains(computerLocation) || computerMoves.contains(computerLocation)){
                    //keeps generating numbers until an empty place is selected
                    computerLocation = rand.nextInt(9) + 1;
                }
                putMove(ticTacToeBoard, computerLocation, "computer");

                drawBoard(ticTacToeBoard);

                //check if there is a winner after every player makes a move
                result = winnerCheck();
                if (result.length() > 0){
                    System.out.println(result);
                    break;
                }
            }
        }

        public static void drawBoard(char [] [] ticTacToeBoard){
            //was originally inside main()
            for (char [] row: ticTacToeBoard){
                for (char c : row){
                    System.out.print(c);
                }
                System.out.println(); //blank line after each row
            }
        }

        public static void putMove(char [] [] ticTacToeBoard, int moveLocation, String player){
            char gamePiece = ' ';

            if (player.equals("human")){
                gamePiece = 'X';
                humanMoves.add(moveLocation);
            }
            else if (player.equals("computer")){
                gamePiece = 'O';
                computerMoves.add(moveLocation);
            }

            //originally inside main()
            //replaces empty space with player's piece
            switch (moveLocation){
                case 1:
                    ticTacToeBoard[0] [0] = gamePiece;
                    break;
                case 2:
                    ticTacToeBoard[0] [2] = gamePiece;
                    break;
                case 3:
                    ticTacToeBoard[0] [4] = gamePiece;
                    break;
                case 4:
                    ticTacToeBoard[2] [0] = gamePiece;
                    break;
                case 5:
                    ticTacToeBoard[2] [2] = gamePiece;
                    break;
                case 6:
                    ticTacToeBoard[2] [4] = gamePiece;
                    break;
                case 7:
                    ticTacToeBoard[4] [0] = gamePiece;
                    break;
                case 8:
                    ticTacToeBoard[4] [2] = gamePiece;
                    break;
                case 9:
                    ticTacToeBoard[4] [4] = gamePiece;
                    break;
                default:
                    break;
            }
        }

        public static String winnerCheck(){
            //win conditions
            List topRow = Arrays.asList(1, 2, 3);
            List middleRow = Arrays.asList(4, 5, 6);
            List bottomRow = Arrays.asList(7, 8, 9);
            List leftColumn = Arrays.asList(1, 4, 9);
            List middleColumn = Arrays.asList(2, 5, 8);
            List rightColumn = Arrays.asList(3, 6, 9);
            List diagonalLR = Arrays.asList(1, 5, 9); //left to right diagonal
            List diagonalRL = Arrays.asList(3, 5, 7); //right to left diagonal

            //list of lists, don't know why it's an array list
            List<List> winConditions = new ArrayList<>();
            winConditions.add(topRow);
            winConditions.add(middleRow);
            winConditions.add(bottomRow);
            winConditions.add(leftColumn);
            winConditions.add(middleColumn);
            winConditions.add(rightColumn);
            winConditions.add(diagonalLR);
            winConditions.add(diagonalRL);

            for (List l : winConditions){
                if(humanMoves.containsAll(l)){
                    return "Congratulations, human wins!";
                }
                else if (computerMoves.containsAll(l)){
                    return "Congratulations, computer wins!";
                }
                else if (humanMoves.size() + computerMoves.size() == 9){
                    return "Tie, board full";
                }
            }

            return "";
        }
}
