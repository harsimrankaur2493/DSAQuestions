public class PrintReverse {
    
   public static void reverse(String str, int idx){
      //base case
      if(idx==0){
         System.out.print(str.charAt(0));
         return;
      }
      //working
      System.out.print(str.charAt(idx));
      reverse(str, idx-1);
   }

   public static void main(String []args){
      reverse("abcd" , 3);
      
   }
}
