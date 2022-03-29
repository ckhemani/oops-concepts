//Comments

//Packages
package zoo;



//Custom Imports
import interfaces.ICommunication;

import java.util.ArrayList;

public class Fish extends Animal {
    // Fields
    private int sizeInFeet;
    private boolean canEat;

    //Constructor


    public Fish() {
    }

//    public Fish(int sizeInFeet, boolean canEat) {
//        this.sizeInFeet = sizeInFeet;
//        this.canEat = canEat;
//    }

    public Fish(int age, String gender, String name, int sizeInFeet, boolean canEat) {
        super(age, gender, name);
        this.sizeInFeet = sizeInFeet;
        this.canEat = canEat;
    }


    //Getters and Setters

    public int getSizeInFeet() {
        return sizeInFeet;
    }

    public void setSizeInFeet(int sizeInFeet) {
        this.sizeInFeet = sizeInFeet;
    }

    public boolean isCanEat() {
        return canEat;
    }

    public void setCanEat(boolean canEat) {
        this.canEat = canEat;
    }

    //Methods

    //To_String


    @Override
    public String toString() {
        return "Fish{" +
                "sizeInFeet=" + sizeInFeet +
                ", canEat=" + canEat +
                '}';
    }
}
