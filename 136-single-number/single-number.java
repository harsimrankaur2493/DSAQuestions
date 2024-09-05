class Solution {
    public int singleNumber(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        Arrays.sort(nums);  
        int i=1;
        while(nums[i]==nums[i-1] && nums[i] != nums[i+1] && i<nums.length-2){
            i+=2;
        }
        if(nums[i]!=nums[i-1]){
            return nums[i-1];
        }
        if(nums[nums.length-1] != nums[nums.length-2]){
            return nums[nums.length-1];
        }
        return nums[i];
        
    }
}