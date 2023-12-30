class Solution {
    public char nextGreatestLetter(char[] nums, char target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        if (start < nums.length) {
            return nums[start];
        } else {
            return nums[0];
        }
    }
}
