public class Abstraction{
        //definition: hiding all the unnecessary details and showing only the important parts to the user 
        //done using access modifirers => data dising 
        //only differene between data hiding abstraction and data hiding is that in abstraction 
        //, important things are also shown unlike data hiding 
        //abstraction done using => abstract classs and interaces
        //idea given , implementation not given 
        /**
         * abstract classes 
         * Properties: can not create an instance / object
         * -> can have both abstract and onn abstract methods
         * ->can have a constructor 
         */

        public static void main(String []args){
            Horse h= new Horse();
            h.eat();
            h.walk();
            System.out.println(h.color);//gives brown
                                        // -> this happes because when an object is
                                        //is created for a derived class , constructor of the
                                        // parent class is called first and then constructor of derived class is called 
            h.changeColor();
            System.out.println(h.color);//gives dark brown

            Chicken c= new Chicken();
            c.eat();
            c.walk();
            poney p1= new poney();
             /* first animal construtor called then horse called then poney called */

        }


}
abstract class Animal{
    String color;
    Animal(){
        color = "brown";
        System.out.println("Animal constructor called ");
    }
    void eat(){
        System.out.println("eats");
    }
    abstract void walk();   //abstract functions are not dedined during definition, 
                            //the sub class will tell what implementation is done here
}
class Horse extends Animal{
    //walk is necessary to be defined in any extendsd/ derived/ child class
    void walk(){
        System.out.println("Walks on 4 legs");
    }
    Horse(){
        System.out.println("Horse constructor called ");
    }
    void changeColor(){
        color= "dark brown";
    }
}
class Chicken extends Animal{
    void walk(){
        System.out.println("Walks on 2 legs");
    }
    void changeColor(){
        color= "yellow";
    }
    
}
class poney extends Horse{
    poney(){
        System.out.println("poney constructor called");
    }
}
//the class animal only gave an idea that it is compulsory to have a function called walk
//in all the subclasses of the Abstract class animal, further , the derived classes
//are free to define the method as per their requirement
//Animal a= new Animal(); -> gives error
