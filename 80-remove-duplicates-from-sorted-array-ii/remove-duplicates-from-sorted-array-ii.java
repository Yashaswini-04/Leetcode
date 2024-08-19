class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        // Initialize pointers
        int n = 1; // The length of the array with duplicates removed
        int count = 1; // Count of occurrences of the current element

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[n - 1]) {
                if (count < 2) {
                    nums[n++] = nums[i];
                    count++;
                }
            } else {
                nums[n++] = nums[i];
                count = 1; // Reset count for the new element
            }
        }

        return n; // Length of the array with at most two occurrences
    }
}
