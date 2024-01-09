class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> AnsList = new ArrayList<>();
        cycleSort(nums);
        
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != i + 1){
                AnsList.add(nums[i]);
            }
        }

        return AnsList;
    }

    void cycleSort(int[] nums){
        int i = 0;
        while(i < nums.length){
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
                swap(nums, i, correct);
            }else{
                i++;
            }
        }
    }

    void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}