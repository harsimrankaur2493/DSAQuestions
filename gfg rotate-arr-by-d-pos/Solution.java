class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) {
        int n=arr.length;
        d%=n;
        //auxilary array
        int aux[]= new int[d];
        
        for(int i=0;i<d;i++){
            aux[i] = arr[i];
        }
        //shift to left by d positions
        for(int i=d;i<n;i++){
            arr[i-d] = arr[i];
        }
        
        //copying aux elements to end of array
        for(int i=0;i<d;i++){
            arr[n-d+i] = aux[i];
        }
    }
}
