class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
       
       int startIndex = SearchOne(nums, target, true);
       int endIndex = SearchOne(nums, target, false);
       
       ans[0] = startIndex;
       ans[1] = endIndex;

       return ans;
    }
    
    int SearchOne(int[] nums, int target, boolean findStartIndex){
        int start = 0;
        int end = nums.length-1;
        int index = -1;

        while(start<=end){
            int mid = start + (end-start)/2;

            if (target>nums[mid]){
                start = mid+1;
            }else if (target < nums[mid]){
                end = mid-1;
            }else{
                index = mid;
                if (findStartIndex){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }
       }
       return index;
    }
}