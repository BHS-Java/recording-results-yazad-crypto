
public class Player implements Person{
    //PROPERTIES
    String name;
    int height;
    int age;
    Results results;

    //CONSTRUCTORS
    public Player(String name, int height, int age){
        //this.results = results;
        this.name = name;
        this.height = height;
        this.age = age;
        System.out.println("Created " + name + ". Their height is " + height + ", and their age is " + age);
    }

    public Player(String[] list){
        this.name = list[0];
        this.height = Integer.parseInt(list[1]);
        this.age = Integer.parseInt(list[2]);

        //this.ties = Integer.parseInt(list[3]);
        //this.games = Integer.parseInt(list[4]);
        //this.sym = list[5].charAt(0);
      }

    //METHODS

    public void climb(String whichStair, int lengthOfStair, char brick){
        //String theStair = "*****";
        //String theEmpty = "     ";

        
        if(whichStair.equals("RD")){
            for(int i = 0; i < lengthOfStair; i++) { 
                for (int o = 0; o <= i; o++) {
                    System.out.print(brick);
                }
                System.out.println();
            }

        }

        if (whichStair.equals("LD")) {
            for (int i = 1; i <= lengthOfStair; i++) {
                for (int j = lengthOfStair; j > i; j--) {
                    System.out.print(" ");
                }
                for (int o = 0; o < i; o++) {
                    System.out.print(brick);
                }
                System.out.println();
            }
        }

        if (whichStair.equals("LU")) {
            for (int i = lengthOfStair; i > 0; i--) {
                // Print leading spaces
                for (int o = 0; o < lengthOfStair - i; o++) {
                    System.out.print(" ");
                }
                // Print asterisks
                for (int o = 0; o < i; o++) {
                    System.out.print(brick);
                }
                System.out.println();
            }
        }

        if (whichStair.equals("RU")) {
            for (int i = lengthOfStair; i > 0; i--) {
                for (int o = 0; o < lengthOfStair - i; o++) {
                    System.out.print(" ");
                }
                for (int o = 0; o < i; o++) {
                    System.out.print(brick);
                }
                System.out.println();
            }
        }

    }

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

    public void setAge(int newAge){
        this.age = newAge;
    }

    public void setHeight(int newHeight){
        this.height = newHeight;
    }

    @Override
    public Results getResults(){
        return this.results;
    }; 
}
