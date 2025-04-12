class Solution {
    public int[] searchRange(int[] arr, int target) {
        int start =0;
        int end = arr.length-1;
        int mid  =0;
        int result =-1;
        int ans[] = {-1,-1};

        //finding first occurance;

        while(start <=end){
            mid = start + (end - start)/2;
            if ( target == arr[mid]){
                result = mid;
                end = mid -1;//search left

            }else if( target > arr[mid]){
                start = mid +1;
            }else {
               end = mid -1; 
            }
        }
        ans[0] = result;
        start =0;
        end = arr.length-1;
        mid=0;
        result=-1;

        while(start <=end){
            mid = start + (end - start)/2;
            if ( target == arr[mid]){
                result = mid;
                start = mid +1; //search right

            }else if( target > arr[mid]){
                start = mid +1;
            }else {
               end = mid -1; 
            }
        }

        ans [1] = result;

        return ans;
    }
}