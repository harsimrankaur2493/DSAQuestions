public class subSequences {
   public static boolean arr[]= new boolean[26];

   public static void sub(String str, int index, String newString){
         if(index==str.length()){
            System.out.println(newString);
            return;
         }

         char currChar=str.charAt(index);
         //to be
         sub(str, index+1, newString+currChar);

         //not to be
         sub(str, index+1, newString);
   }


   public static void main(String []args){
      sub("hello", 0, "");      
   }
}

