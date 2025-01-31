import java.util.Scanner;

public class Main implements Spec{
    //PROPERTIES
    Results theResults = new ImpResults();
    String name;
    int height;
    int age;
    String symbol;
    String stairType;

    
    public void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("give me a char");
        this.symbol = s.nextLine();
        System.out.println("Choose a stair type (LU/LD/RU/RD)");
        this.stairType = s.nextLine();
        System.out.println("What is the player's name");
        this.name = s.nextLine();
        System.out.println("What is the player's height");
        this.height = s.nextInt();
        System.out.println("What is the player's age");
        this.age = s.nextInt();

        //char symbolChar = symbol.charAt(1);



        Player newPlayer = makePerson("John");
        newPlayer.getName();
        System.out.println("give me a length for the stairs");
        newPlayer.climb(stairType, s.nextInt(), symbol.charAt(0));
        //newPlayer.climb();
    }
        
    //METHODS

    @Override
    public String askString(String question){
        Scanner theScanner = new Scanner(System.in);
        System.out.println(question);
        String getAnswer = theScanner.next();
        theScanner.close();
        return getAnswer;
    }

    @Override
    public int askNumber(String question){
        Scanner theScanner = new Scanner(System.in);
        System.out.println(question);
        int getAnswer = theScanner.nextInt();
        theScanner.close();
        return getAnswer;
    }

    @Override
    public Results getResults(Game guessingOrBetter){
        return null;
    }

    @Override
    public Player makePerson(String name){
        Player newGuy = new Player(this.theResults, this.name, this.height, this.age);
        newGuy.setName(name);
        return newGuy;
    }

    @Override
    public void addResults(Person player){
        
    }
}