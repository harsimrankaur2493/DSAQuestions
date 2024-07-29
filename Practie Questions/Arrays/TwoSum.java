// Given an array A[] of n numbers and another number x, the task is to
//  check whether or not there exist two elements in A[] whose sum is exactly x.
import java.util.*; 
public class TwoSum {
    //bruteforce approach
    public static boolean isPresent(int arr[], int x){
        for(int i=0; i<arr.length; i++){
            for(int j=1; j<arr.length; j++){
                if(arr[i] + arr[j] == x){
                    return true;
                }
                
            }
        }
        return false;
    } 
    //optimized approach
    /**
     * first sort the array 
     * then make 2 pointers traversing the array one at the start and another at the end , using a while loop
     * if(arr[l] + arr[r] == sum{
     *      return true})
     * else if(arr[l] + arr[r] < sum){
     *          l++}
     * else if(arr[l] + arr[r] > sum){
     *          r++}
     * 
     * return false 
     * 
     */

     public static boolean isPresentOptimized(int arr[], int x, int size){
        
        int l=0;
        int r=size-1;
        Arrays.sort(arr);
        while(l<r){
            if(arr[l]+arr[r]==x){
                return true;
            }
            else if(arr[l] + arr[r] < x){
                l++;
            }
            else if(arr[l] + arr[r] > x){
                r--;
            }
        }
        return false;
     }
    public static void main(String []args){
        int arr[]={1,5,2,4,3};
        int x=5;
        System.out.println(isPresentOptimized(arr, x, 5));
    }
}
