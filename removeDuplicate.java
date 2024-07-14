public class removeDuplicate {
   public static boolean arr[]= new boolean[26];

   public static void removeDup(String str, int index , String newString){
      //base case
      if(index == str.length()-1){
         System.out.println(newString);
         return;
      }
      char currChar=str.charAt(index);
      //working
      if(arr[currChar-'a'] == true){
         removeDup(str, index+1, newString);
      }
      else{
         newString +=currChar;
         arr[currChar-'a'] = true;
         removeDup(str, index+1, newString);
      }
                      
   }


   public static void main(String []args){
      removeDup("helloowoorlld",0,"");
      
   }
}
/**
 * array os length 26
 * if letter occured before, ascii value - 'a' = 1 ,
 * else 0
 * make a string of all ascii values non 0
 */
