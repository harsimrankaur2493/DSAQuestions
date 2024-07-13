public class isSorted {


    
   public static boolean isSorted(int arr[], int index){
            
            //base case
            if(index == arr.length-1){
               return true;
            }

            //working
            if(arr[index] <= arr[index+1]){
                //call for further indices
               return isSorted(arr, index+1);
                               
            }

            else{
               return false;
            } 
                            
            
   }


   public static void main(String []args){
      int arr[]={1,2,3,4,5,2};

      System.out.println(isSorted(arr, 0));
      
   }
}
/**
 * base case :
 *    if arr finished 
 
 * working :
 *    if(arr[index] < arr[index+1]){
 * continue searching for a higher index value
 * return the function value}
 *    if element bigger or equal
 * 
 * return value ??
 */
