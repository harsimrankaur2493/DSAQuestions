import java.util.*;
public class checkPallindrome {

    public static boolean isPallindrome(String str){
        Stack<Character> s= new Stack<>();
       for(int i=0;i<str.length()/2;i++){
        s.push(str.charAt(i));
       }
       int start= (str.length()%2==0) ? str.length()/2 : ((str.length())/2) + 1;
       for(int i=start;i<str.length()-1;i++){
        if(str.charAt(i)==s.pop()){
            continue;
        }else{
            return false;
        }
       }
       return true;
    }
    public static void main(String[] args) {
        String str="racecar";
        System.out.println(isPallindrome(str));
    }
}
