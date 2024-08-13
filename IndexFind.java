class IndexFind {
    public int binarySearch(int[] nums, int target, int first, int last) {
        /**
        conduct binary search
         */
        while(last>=first){
            int mid=first+(last-first)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid] < target){
                return binarySearch(nums, target, mid+1, last);
            }
            else if(nums[mid]>target){
                return binarySearch(nums, target, first, mid-1);
            }
        }
        return -1;        
    }
    public int searchInsert(int nums[], int target){
        int ans=binarySearch(nums, target, 0, nums.length-1);
        if(ans==-1){
            if(target < nums[0]){
                return 0;
            }
            else if(target>nums[nums.length-1]){
                return nums.length;
            }
            for(int i=0;i<nums.length-1;i++){
                if(nums[i] < target && nums[i+1] > target){
                    return (i+1);
                }
                
                 
            }
        }
        return ans;
    }
}

// Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

// You must write an algorithm with O(log n) runtime complexity.
