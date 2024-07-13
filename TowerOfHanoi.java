public class TowerOfHanoi {
    
   public static void TowerofHanoi(int n, String source, String destination, String helper){
      //base case

      if(n==1){
         System.out.println("Transfering "+ source+" to "+ destination +" : "+ n+" disk");
         return;
      }
      TowerofHanoi(n-1, source, helper, destination);
      System.out.println("Transfering "+ source+" to "+ destination +" : "+ n+" disk");
      TowerofHanoi(n-1, helper, destination, source);
      
   }

   public static void main(String []args){
      TowerofHanoi(5, "S", "D", "H");
      
   }
}
