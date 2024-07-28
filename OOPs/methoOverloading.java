public class Polymorphism {
    public static void main(String []args){
        calculator calc= new calculator();
        System.out.println(calc.sum(1,2));
        System.out.println(calc.sum(1.5f,2.5f));
        System.out.println(calc.sum(1,2,3));

    }
    
}
class calculator{
    //function overloading => a form of compile tme polymorphism
    int sum(int a, int b){
        return a+b;
    }
    float sum(float a, float b){
        return (a+b);   
    }
    int sum(int a, int b, int c){
        return (a+b+c);

    }
}
// compile time polymorpism: method overloading(static)
// run tmie polymorphism : method overriding (Dynamic)
// method overloading: functions with same name but different parameters
/*
 Eg:
 sum(int a , int b);
 sum (float a , float b);
 sum(int a, int b, int c);

 */
