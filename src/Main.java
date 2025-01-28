import java.util.Scanner;

public class Main implements Spec{
    //PROPERTIES
    Results theResults = new ImpResults();
    String name;
    int height;
    int age;

    
    public void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("What is the player's name");
        this.name = s.nextLine();
        System.out.println("What is the player's height");
        this.height = s.nextInt();
        System.out.println("What is the player's age");
        this.age = s.nextInt();
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
    public Person makePerson(String name){
        Player newGuy = new Player(this.theResults, this.name, this.height, this.age);
        newGuy.setName(name);
        return newGuy;
    }

    @Override
    public void addResults(Person player){
        
    }
}