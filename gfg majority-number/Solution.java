class Solution {
    // Function to find the majority elements in the array
    public List<Integer> findMajority(int[] nums) {
        int n = nums.length;

        // Result list
        ArrayList<Integer> list = new ArrayList<>();

        // Sort the array
        Arrays.sort(nums);

        // Variable to track frequency
        int count = 1;

        // Traverse the sorted array
        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1]) {
                // Increment count if the current number is the same as the previous one
                count++;
            } else {
                // Check if the previous number is a majority element
                if (count > n / 3) {
                    list.add(nums[i - 1]);
                }
                // Reset count for the new number
                count = 1;
            }
        }

        // Check the last number after the loop ends
        if (count > n / 3) {
            list.add(nums[n - 1]);
        }

        // Return unique elements in the result
        return list;
    }
}
