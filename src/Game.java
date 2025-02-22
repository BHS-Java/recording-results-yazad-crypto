import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    private ArrayList<Player> players;
    
    public Game() {
        this.players = new ArrayList<>();
    }

    public void loadPlayers(String filename) throws FileNotFoundException{
        File file = new File("playerData.csv");
        Scanner scanner = new Scanner(file);
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] data = line.split(",");
            String name = data[0];
            int height = Integer.parseInt(data[1]);
            int age = Integer.parseInt(data[2]);
            players.add(new Player(name, height, age));
        }
        scanner.close();
    }
    
    // Method to select a player by name
    public Player selectPlayer(String playerName) {
        for (int i = 0; i < players.size(); i++) {
            if (players.get(i).getName().equalsIgnoreCase(playerName)) {
                System.out.println(playerName + " selected.");
                return players.get(i);
            }
        }
        System.out.println("Player not found.");
        return null;
    }
    
    public ArrayList<Player> getPlayers() {
        return players;
    }
}
