//function overriding
 //parent and chile both contain same function but with different definitions
 public class methodOverriding{
    public static void main(String []args){
        deer d1= new deer();
         d1.eat();
         
        }
 }
 class Animal{
    Animal(){
        System.out.println("Animal constructor called");
    }
    void eat(){
        System.out.println("eats anything");
    }

 }

 class deer extends Animal{
    deer(){
        System.out.println("deeer constructor called");
    }
    void eat(){
        System.out.println("Eats grass");
    }
 }
