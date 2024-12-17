class Solution {
    public void reverse(int arr[], int start, int end){
        int i=start;
        int j=end;

        while(i<j){
            int temp=arr[i];
            arr[i] = arr[j];
            arr[j]= temp;
            i++;
            j--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n; //normalization
        if(nums.length==0 || nums.length==1){
            return ;
        }
        //rotating array clockwise 
        //reverse array 
        reverse(nums, 0, nums.length-1);
        //reverse first k elemets
        reverse(nums, 0, k-1);
        //rotate remaining elements 
        reverse(nums, k, nums.length-1);
    }
}