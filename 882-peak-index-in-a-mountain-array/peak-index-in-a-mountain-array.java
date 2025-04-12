class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start =0;
        int end = arr.length-1;
        int mid =0;
        while( start <=end ){
            mid = start + (end - start )/2;
            if( arr[mid] < arr[mid +1]){
                //we are in the ascending part of the array 
                //search right 
                start= mid +1 ;
            }
            else if( arr[mid] > arr[mid +1]){
                //we are in the desciending part of thearray
                //look towards the left
                end = mid-1;
            }
        }
        return start;//or mid or end
    }
}