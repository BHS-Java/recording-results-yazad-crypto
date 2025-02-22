 import java.io.File;
 import java.io.FileNotFoundException;
 import java.io.FileWriter;
 import java.io.IOException;
 import java.util.ArrayList;
 import java.util.Scanner;
 
 
 public class PlayerManager{
   //PROPERTIES
   private ArrayList<Player> players;
 
   //CONSTRUCTORS
   public PlayerManager() throws FileNotFoundException{
     
     File f = new File("playerData.csv");
     this.players = new ArrayList<Player>();
     Scanner u = new Scanner(f);
 
     u.nextLine();
     while (u.hasNextLine()){
       String[] data = u.nextLine().split(",");
       Player yay = new Player(data);
       players.add(yay);
     }
 
     u.close();
   }
 
 
   //METHODS
   
   public Player findPlayer(String name){
     Player p;
     for(int i = 0; i < this.players.size(); i++){
       p = players.get(i);
       if (p.getName().equals(name)){
         return p;
       }
     }
     return null;
   }
 
   
   public void saveData(Player[] playerList) throws FileNotFoundException, IOException{
 
     FileWriter fw = new FileWriter("playerData.csv");
 
     fw.write("Name,Age,Height\n");
 
     for (int i = 0; i < playerList.length; i++) {
       fw.write(
         playerList[i].getName() + "," + 
         playerList[i].getHeight() + "," + 
         playerList[i].getAge() + ","
       );
     }
     fw.close();
   }
 
   public Player addPlayer(String name){
     String[] idk = {name, "0", "0",};
     Player defaultPlayer = new Player(idk);
     if(findPlayer(name) == null){
       return defaultPlayer;
     }
     else{
       return findPlayer(name);
     }
   }
   
   public ArrayList<Player> getArray(){
     return this.players;
   }
 
 }