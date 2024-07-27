public class inheritance1 {
    public static void main(String []args){
        // Fish shark= new Fish();
        // shark.eat();

        Dog dobby = new Dog();
        dobby.legs=10;
        System.out.println(dobby.legs);
    }
}
class Animal{
    String color;
    
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
}

class mammals extends Animal{
    int legs;

}
class Dog extends mammals{
    String breed;
    
}

// class Fish extends Animal{
//     int fins;
//     void swim(){
//         System.out.println("Swims in water");
//     }
// }

/**
 * types of inheritance :
 * single level -> when we have single level base class and that gives a singe derived class
 * 
 * Multi level inheritance 
 * base class -> derived class -> derived class
 * 
 */
