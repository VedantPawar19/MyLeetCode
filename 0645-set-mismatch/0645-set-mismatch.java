class Solution {
    public int[] findErrorNums(int[] nums) {
    //cycle sort then I can iterate and compare to find which element is not in place and thus finding which element is needed in that place
        cycleSort(nums);
        int index = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] != i + 1){
                index = i;
            }
        }
        return new int[]{nums[index], index+1};
    }

    void cycleSort(int[] nums){
        int i = 0;
        while(i < nums.length){
            int correct = nums[i]-1;
            if(nums[i] != nums[correct]){
                int temp = nums[correct];
                nums[correct] = nums[i];
                nums[i] = temp;
            }else{
                i++;
            }
        }
    }
}