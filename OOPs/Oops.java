public class Oops {

    public static void main(String []args){
        pen p1=new pen();
        p1.setColor("red");
        System.out.println(p1.color);
        p1.setTip(10);
        System.out.println(p1.tip);
        p1.setColor("yellow");
        System.out.println(p1.color);
    }
}
class pen{
    int tip;
    String color;

    void setTip(int ntip){
        tip=ntip;
    }
    void setColor(String ncolor){
        color=ncolor;
    }
}