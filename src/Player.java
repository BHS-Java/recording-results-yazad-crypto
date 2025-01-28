
public class Player implements Person{
    //PROPERTIES
    String name;
    int height;
    int age;
    Results results;

    //CONSTRUCTORS
    public Player(Results results, String name, int height, int age){
        this.results = results;
        this.name = name;
        this.height = height;
        this.age = age;
    }

    //METHODS
    @Override
    public void setName(String settingName){
        this.name = settingName;
    };

    @Override
    public String getName(){
        return this.name;
    };

    @Override
    public int getHeight(){
        return this.height;
    };

    @Override
    public int getAge(){
        return this.age;
    };

    @Override
    public Results getResults(){
        return this.results;
    }; 
}
