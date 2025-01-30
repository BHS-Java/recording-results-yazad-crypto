public class Game {
    //PROPERTIES
    private Player[] playerList;

    //CONTRUCTORS
    public Game(Player[] thePlaer){
        this.playerList = thePlaer;
    }


    //METHODS
    public void addPlayer(Player newPlayer){
        Player[] newList = new Player[playerList.length + 1];
        newList[newList.length-1] = newPlayer;
        this.playerList = newList;
    }
}
