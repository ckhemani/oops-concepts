//Developer Comments
/*
This is where you will put Comments for Programmer.
*/

//PACKAGE
package zoo;

//IMPORTS

import interfaces.ICommunication;

//Class Declaration
public class Animal implements ICommunication {
    // Fields
    private int age;
    private String gender;
    private String name;

    // ToDo Comments
    // Method Overloading  - check Google - Same Method with return Type
    // Method Overriding - check google -
    // Animal Method with no Parameters
    public Animal() {
    }

    // Animal Method with Parameters
    public Animal(int age, String gender, String name) {
        this.age = age;
        this.gender = gender;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    //Overloading Method. Same getAge() is overloaded to sent name and age.
    public String getAge(String name) {
        return "Your name is " + name + " And your age is : " + getAge();
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Methods
    public boolean isMammal(){
        return true;
    }

    public String swim(){
        return "I am swimming in Super which is the Animal Class.... ";
    }

    public String run(){
        return "I am running mam hear a roar!!!";
    }


//    public void isSwin(boolean swim){
//        this.isSwim(true);
//    }

    // To String
    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", gender='" + gender + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public String speak() {
        return "I do sounds "   ;
    }
}
