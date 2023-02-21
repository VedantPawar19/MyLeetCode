class Solution {
    public int singleNonDuplicate(int[] nums) {
        
         int start = 0;
    int end = nums.length - 1;
    while (start < end) {
        int mid = start + (end - start) / 2;
        if (mid % 2 == 1) {
            // mid is odd, adjust to make it even
            mid--;
        }
        if (nums[mid] == nums[mid + 1]) {
            // single element is on the right side of mid
            start = mid + 2;
        } else {
            // single element is on the left side of mid
            end = mid;
        }
    }
    return nums[start];
    }
}