class Solution {
    public int[] buildArray(int[] nums) {
        if(nums.length==0 || nums.length==1){
            return nums;
        }
        int max=0;
        for(int i=0;i<nums.length;i++){
            max=Math.max(nums[i],max);
        }
        int newArr[] = new int[max+1];
        for(int i=0;i<max;i++){
            newArr[i] = nums[nums[i]];
        }
        newArr[max] = nums[nums[max]];
        return newArr;
    }
}