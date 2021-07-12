public class Human {
    //set to final because I don't want playerIcon to change.
    //looks like for this reason, final variables don't need setters
    private final String playerIcon = "H";

    private String playerName;

    private boolean isAlive = true;

    //position attribute? [i][j]

    public String getPlayerIcon() {
        return playerIcon;
    }

    //randomly generate a level for human and goblin? whichever has the higher level wins the encounter?
    private int humanLevel;

    public int getHumanLevel() {
        return humanLevel;
    }

    public void setHumanLevel(int humanLevel) {
        this.humanLevel = humanLevel;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public boolean getIsAlive() {
        return isAlive;
    }

    public void setIsAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }

    //encounterCheck()
    //check if the index contains 'G'.

    //need to do something with the constructor, pass in level? what about setHumanLevel()?
//    public Human(int hLev){
//        this.humanLevel = hLev;
//    }
}
