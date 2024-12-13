class Solution {
    
    void reverse(int arr[], int strt, int end){
        int i=strt;
        int j=end;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    void nextPermutation(int[] arr) {
        int n=arr.length;
        int brkPt=-1;
        
        //finding break point
       for(int i=n-2;i>=0;i--){
           if(arr[i] < arr[i+1]){
               brkPt = i;
               break;
           }
       }
       
       if(brkPt ==-1){
          reverse(arr,0,n-1);
          return;
       }
       
       //find closest larger number and swap
       for(int i=n-1;i>brkPt;i--){
           if(arr[brkPt] < arr[i]){
               //swap
               int temp = arr[brkPt];
               arr[brkPt] = arr[i];
               arr[i] = temp;
               break;
           }
       }
       
       //sort the ahead array in ascending order
       Arrays.sort(arr, brkPt+1, n);
    }
}
