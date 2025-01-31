public class Game {
    //PROPERTIES
    private Player[] playerList;
    private ImpResults results;

    //CONTRUCTORS
    public Game(Player[] thePlaer){
        this.playerList = thePlaer;
        this.results = new ImpResults();
    }


    //METHODS
    public void addPlayer(Player newPlayer){
        Player[] newList = new Player[playerList.length + 1];
        newList[newList.length-1] = newPlayer;
        this.playerList = newList;
    }

    public ImpResults getResults(){
        return results;
    }
}
