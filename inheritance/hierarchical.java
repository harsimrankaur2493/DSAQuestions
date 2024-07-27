// public class hierarchical {
//     public static void main(String []args){
//         bird nemo= new bird();
//         nemo.fly();
//         nemo.breathe();
//     }
// }
// /**
//  * single base class and multiple derived lasses
//  * 
//  */
// class Animal{
//     void eat(){
//         System.out.println("eats");
//     }
//     void breathe(){
//         System.out.println("breathes");
//     }
// }

// class Dog extends Animal{
//     int legs;
//     String breed;

// }

// class fish extends Animal{
//     int fins;

// }
// class bird extends Animal{
//     void fly(){
//         System.out.println("flies");
//     }
// }

//hybrid inheritance

public class hierarchical{
    human Simran= new human();
    Simran.smarter();
}
class Animal{
    void breathe(){
        System.out.println("breathes");
    }
}
class fish extends Animal{
    void swim(){
        System.out.println("swim");
    }
}
class bird extends Animal{
    void fy(){
        System.out.println("flies");
    }
}
class mammal{
    void walk(){
        System.out.println("walks");
    }
}
class tuna extends fish{
    void small(){
        System.out.println("it is a small fish");
    }
}
class shark extends fish{
    void big(){
        System.out.println("it is a big fish");
    }
}
class peacock extends bird{
    void big(){
        System.out.println("it is a big bird");
    }
}
class dog extends mammal{
    void loyalty(){
        System.out.println("dogs are loyal");
    }
}
class cat extends mammal{
    void smart(){
        System.out.println("cats are smart");
    }
}
class human extends mammal{
    void smarter(){
        System.out.println("humans are the smartest of them all");
    }
}
