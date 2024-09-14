class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        if(nums.length==0){
            return 0;
        }else if(nums.length==1){
            if(nums[0]==1){
                return 1;
            }else{
                return 0;
            }
        }
        int count=0;
        int maxCount=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                ++count;
            }else{
                maxCount = Math.max(count, maxCount);
                count=0;
            }
        }
        maxCount = Math.max(maxCount , count);
        return maxCount;
    }
}