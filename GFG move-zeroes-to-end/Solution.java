class Solution {
    void pushZerosToEnd(int[] arr) {
        int insertPos =0;
       for(int i=0;i<arr.length;i++){
           if(arr[i]!=0){
               arr[insertPos] = arr[i];
               insertPos++;
           }
       }
       
       while(insertPos < arr.length){
           arr[insertPos++]=0;
       }
    }
}
