
public class mergingTwo{
    public static void mergeTwo(int nums1[] ,int nums2[] , int m, int n){
        int i=m-1;
        int j=n-1;
        int k=m+n-1;  
        
        while(j>=0){
            if(i>=0 && nums1[i] > nums2[j]){
                nums1[k--]=nums1[i--];
            }
            else{
                nums1[k--]=nums2[j--];
            }
        }
    }
   
}
//the above function merges 2 sorted arrays into an array of size n+m (sum of the two arrays) and stores it into the first array 


