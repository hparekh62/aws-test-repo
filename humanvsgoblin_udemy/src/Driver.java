import java.util.Random;
import java.util.Scanner;

public class Driver {
    //do i need this?
    static int randomGen(int limit){
        return limit;
    }

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        GameWorld myGameWorld = new GameWorld();

        int humanLevel = rand.nextInt(101);
        int goblinLevel = rand.nextInt(101);

        Human human = new Human();
        Goblin goblin = new Goblin();

        human.setHumanLevel(humanLevel);
        goblin.setGoblinLevel(goblinLevel);

        //System.out.println(human.getHumanLevel());
        //System.out.println(goblin.getGoblinLevel());

        System.out.println("You awaken in a mysterious place");
        System.out.println("Please enter your name: ");
        String pName = scan.nextLine();
        human.setPlayerName(pName);
        System.out.println("Where would you like to move [N/E/S/W]? (Refer to the compass rose): ");
        System.out.println(myGameWorld.getCompassRose());
        //might be going into infinite loop because not waiting for any input?

        //printGameWorld()

        /*
        while(isAlive) ... or maybe a do while
        do while, might be possible to print a "you lose" statement
         */
//        do {
//            System.out.println("Where would you like to move [N/E/S/W]? (Refer to the compass rose): ");
//            System.out.println(myGameWorld.getCompassRose());
//        }while (human.getIsAlive());
    }
}
