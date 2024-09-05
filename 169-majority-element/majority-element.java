class Solution {

    /**
     *After sorting the array, the majorith element will always always occur in the middle 
     */
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int mid = nums.length/2;
        return nums[mid];
    }
}
