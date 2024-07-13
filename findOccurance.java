public class findOccurance {
   public static int first=-1;
   public static int last =-1;

    
   public static void findOccurance(String str, int index, char element){

      //base case
      if(index == str.length()){
         System.out.println("first: "+first);
         System.out.println("last: "+last);
         return;
      }

      //working
     char currChar=str.charAt(index);
     if(currChar == element){
         if(first == -1){
            first=index;
         }
         else{
            last = index;
         }
     }

     findOccurance(str, index+1, element);

   }

   public static void main(String []args){
      findOccurance("buixkjnauybsdvagagagagagag" , 0, 'a');
   }
}
