public class Goblin {
    //from the GUI assignment. remove?
//    private double strength;
//    private double stamina;
//    private String name;
//    private String color;
//
//    public int attack(){
//        return 1;
//    }

    //set to final because I don't want playerIcon to change
    private final String playerIcon = "G";

    //position attribute? [i][j]

    public String getPlayerIcon() {
        return playerIcon;
    }

    private int goblinLevel;

    public int getGoblinLevel() {
        return goblinLevel;
    }

    public void setGoblinLevel(int goblinLevel) {
        this.goblinLevel = goblinLevel;
    }

    //need to do something with the constructor, pass in level? what about setHumanLevel()?
//    public Goblin(int gLev){
//        this.goblinLevel = gLev;
//    }
}
