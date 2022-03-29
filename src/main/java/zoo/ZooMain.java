package zoo;

import java.util.Scanner;

public class ZooMain {
    //Class Fields
    private static final Scanner scanner = new Scanner(System.in);
    private static final Zoo zoo = new Zoo("Chandru Zoo","11000 American Dream Way, Reston, VA");
    private static final Lion lion = new Lion(12,"Male","test",true);
    private static final Duck duck = new Duck(1,"Male","Donald");
    private static final Fish fish = new Fish(1,"Male","Flapper",25,true);

    public static void main(String[] args) {
        System.out.println("Welcome to Zoo");
    }
}
