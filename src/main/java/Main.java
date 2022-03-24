import zoo.Animal;
import zoo.Duck;

public class Main {
    public static void main(String[] args) {

//        Inheritance
          Animal donald = new Duck(6,"Flapper","Donald");
        System.out.println(donald.getAge() + " "  +  donald.getGender() + " " + donald.getName() );
        System.out.println(donald.swim());
        System.out.println(donald);

//        Animal bear = new Animal();
//
//        bear.setName("Tommy");
//        bear.setAge(6);
//
//        System.out.println(bear.getAge());
//        System.out.println(bear.getAge(bear.getName())); //Calling the Overloaded Method
//
//        System.out.println();
//
//        Animal lion = new Animal(7,"Male","Shera");
//        System.out.println(lion);;
//        System.out.println(lion + "is" + lion.isMammal());


//        People chandru = new People();
//        System.out.println(chandru);
//
//        People yuvraj = new People("Yuvraj","Khemani",9);
//        System.out.println(yuvraj);
//
//        People sid = new People("Siddharth","Khemani",1);
//        People sam = new People("Samrat","Khemani",1);
//        System.out.println(sam.getFirstName());



    }
}
