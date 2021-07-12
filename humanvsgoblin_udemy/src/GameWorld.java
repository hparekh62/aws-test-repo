import java.util.Arrays;

public class GameWorld {
//    private char [][] gameBoard = {
//            {'X', 'X', 'X', 'X', 'X'},
//            {'X', 'X', 'X', 'X', 'X'},
//            {'X', 'X', 'X', 'X', 'X'},
//            {'X', 'X', 'X', 'X', 'X'},
//            {'X', 'X', 'X', 'X', 'X'}
//    };

    private char gameBoard[][] = new char[5][5]; //move inside constructor?

    private final String compassRose = "  N \nW   E\n  S";

    public String getCompassRose() {
        return compassRose;
    }

    //TODO: need to do something about printing and modifying the game board
    public char[][] getGameBoard() {
        return gameBoard;
    }

    public void setGameBoard(char[][] gameBoard) {
        this.gameBoard = gameBoard;
    }

//    public static void drawGameBoard(){
//
//    }

    //method to place the game piece

    //method to move players

    //encounter check method, if an encounter is found then start the fight

    //constructor should also call world generator
    public GameWorld(){
        //creating world
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                gameBoard[i][j] = 'X';
            }
        }
        //printing world. should put into another method
        for (char[] x : gameBoard){
            for (char y : x){
                System.out.print(y);
            }
            System.out.println();
        }
    }
}
