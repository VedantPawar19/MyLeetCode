class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2*n];
        int i = 0;
        int j = n; 
        
        for(int k = 0; k<2*n; k++){
            ans[k] = nums[i];
            ans[k+1] = nums[j];
            System.out.println(nums[i]);
            System.out.println(nums[j]);
            i++;
            j++;
            k++;
        }
        
        return ans;
    }
}
