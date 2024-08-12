class Duplicates {
    public int removeDuplicates(int[] nums) {
        /**
         * 2 pointers
         * one stays on unique element , other tracks duplicate elements
         * once next unique element spotted, first pointer ++ , and unique element stored there
         * then the ptr1 stay on the new location and the ptr2 does the same for next array
         */
        int k=1;

         int ptr1=0;//stays on parent element
         int ptr2=1;//tracks duplicates
         while(ptr1<nums.length && ptr2 < nums.length){
            if(nums[ptr1] != nums[ptr2]){
                k++;
                ptr1+=1;
                nums[ptr1]=nums[ptr2];
            }
            ptr2++;
         }
         return k;
        
    }
}   

// Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.

// Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:

// Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
// Return k.
