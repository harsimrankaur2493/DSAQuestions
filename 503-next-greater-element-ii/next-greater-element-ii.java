class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] nge = new int[n]; // Array to store the result
        Stack<Integer> st = new Stack<>(); // Stack to track elements

        // Iterate through the array twice for circular behavior
        for (int i = 2 * n - 1; i >= 0; i--) {
            // Use modulo to simulate circular indexing
            while (!st.isEmpty() && st.peek() <= nums[i % n]) {
                st.pop();
            }

            // Only fill the result array for the first pass
            if (i < n) {
                if (st.isEmpty()) {
                    nge[i] = -1;
                } else {
                    nge[i] = st.peek();
                }
            }

            // Push the current element onto the stack
            st.push(nums[i % n]);
        }

        return nge;
    }
}
