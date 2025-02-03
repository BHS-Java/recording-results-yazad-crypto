import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    //PROPERTIES
    private Player[] playerList;
    private ImpResults results;
    private ArrayList<Player> vibhu;

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

    public void loadPlayers() throws FileNotFoundException{
        File f = new File("skibuddy.csv");
        this.vibhu = new ArrayList<Player>();
        Scanner u = new Scanner(f);

        u.nextLine();
        while (u.hasNextLine()){
          String[] data = u.nextLine().split(",");
          Player yay = new Player(data);
          vibhu.add(yay);
        }
    
        u.close();
    }
}
