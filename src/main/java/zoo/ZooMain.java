package zoo;

import oop.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

public class ZooMain {
    //Class Fields
    private static final Scanner scanner = new Scanner(System.in);
    private static final Zoo zoo = new Zoo("Chandru Zoo","11000 American Dream Way, Reston, VA");
    private static final Lion lion = new Lion(10,"Male","Killer",true);
    private static final Duck duck = new Duck(7,"Male","Donald");
    private static final Fish fish = new Fish(15,"Male","Flapper",25,true);

    public static void main(String[] args) {
        // Greetings
        System.out.println(greeting());

        //Add some Animals
        register();

        // Viewing Animals
        while(true) {
            switch (pickAnimal()) {
                case 1:
                    System.out.println("You are viewing the Duck!");
                    viewDuck();
                    break;
                case 2:
                    System.out.println("You are viewing the Fish!");
                    viewFish();
                    break;
                case 3:
                    System.out.println("You are viewing the Lion!");
                    viewLion();
                    break;
                case 4:
                    System.out.println("Thank you " + zoo.getVisitor().getFirstName() + " for visiting the Chandru Zoo!");
                    System.exit(0);
                default:
                    System.out.println("Please pick Either 1-4");
            }
        }
    }

    // Methods
    public static String greeting(){
        return "Welcome to the Zoo!";
    }

    public static void addAnimalsToZoo(){

        //Declaring new Array List of Animals
        ArrayList<Animal> animals = new ArrayList<>();

        //Adding the animals to the List.
        animals.add(lion);
        animals.add(duck);
        animals.add(fish);

        System.out.println(animals);
        // Setting animals array List to the zoo object array list.
        zoo.setAnimals(animals);

    //    zoo.setAnimals(new ArrayList<Animal>(Arrays.asList(lion,duck,fish)));
    }

    public static void register(){
        System.out.println("Lets get you registered");
        System.out.println("Please enter your first Name");
        String firstName = scanner.next();
        System.out.println("Please enter your Last Name");
        String lastName = scanner.next();
        System.out.println("Please enter your Age");
        int age = scanner.nextInt();
        zoo.setVisitor(new Person(firstName,lastName,age));
    }

    public static int pickAnimal(){
        System.out.println("""
                sout("Please enter your selection?"
                1. Duck
                2. Fish
                3. Lion
                4. Exit
                """);
        return scanner.nextInt();
    }

    public static void viewDuck(){
        System.out.println(duck);
    }

    public static void viewFish(){
        System.out.println(fish);
    }

    public static void viewLion(){
        System.out.println(lion);
    }
}
