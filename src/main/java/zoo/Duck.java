package zoo;

public class Duck extends Animal {
    //Fields
    private static final String BEAKCOLOR = "Yellow"; //Way to Declare the CONSTANT VARIABLE.
    //String test = "I can swim with Buddies";

    //Constructor

    public Duck(int age, String gender, String name) {
        super(age, gender, name);
    }

    //Setters and Getters - Not Needed since Fields is one and CONSTANT

    //Methods
    public String quack() {
        return "I am quacking";
    }

    public String fly() {
        return "I am Flying";
    }

    //Overrided Methods
    @Override
    public String swim() {
//        return super.swim();
        return " I am swimming in Pond from Duck Class and " + test;
    }

    //toString

    @Override
    public String toString() {
        return "The Duck's Name is " + getName() + " " +
                " Age : " + getAge() + " " +
                "Beak Color is " + BEAKCOLOR;
    }
}


