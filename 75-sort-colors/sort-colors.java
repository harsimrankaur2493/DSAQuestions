class Solution {

    public int partition(int low, int high, int[] arr) {
        int pivot = arr[high]; // Pivot element
        int i = low - 1; // Index of smaller element

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;

                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap arr[i + 1] and arr[high] (or pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1; // Return the partitioning index
    }

    public void quickSort(int[] nums, int low, int high) {
        if (low < high) {
            int pi = partition(low, high, nums); // Partitioning index

            // Recursively sort elements before and after partition
            quickSort(nums, low, pi - 1);
            quickSort(nums, pi + 1, high);
        }
    }

    public void sortColors(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
    }
}
