public class moveAllx {


    
   public static void shiftx(String str,int index, int count, String newString){
      //base case
      if(index== str.length()-1){
         for(int i=0; i<count; i++){
            newString+='x';
         }
         System.out.println(newString);
         return ;
      }
      char currChar = str.charAt(index);
      if(currChar =='x'){
         count++;
         shiftx(str,index+1,count,newString);
      }else{
         newString+=currChar;
         shiftx(str, index+1, count, newString);
      }
      
   }


   public static void main(String []args){
      String str="axbcxxd";
      shiftx(str, 0, 0, "");
      
      
   }
}
/**move all 'x' to the end of the string 
 * base case : 
 *    string length complete
 * working :
 *    input a stringBuilder, input index
 *    if x encountered , shift to the end of the string builder 
 *    check for th next index 
 */
