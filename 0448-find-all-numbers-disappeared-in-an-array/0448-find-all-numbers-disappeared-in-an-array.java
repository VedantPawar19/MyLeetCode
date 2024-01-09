class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> missingList = new ArrayList<>();
        cyclesort(nums);

        for (int i = 0; i < nums.length; i++) {
            if(nums[i]-1 != i){
                missingList.add(i+1);
            }
        }

        return missingList;
    }

    void cyclesort(int[] arr){
        int i = 0;
        while(i<arr.length){
            int correctPos = arr[i]-1;
            if(arr[i] != arr[correctPos]){
                swap(arr, i, correctPos);
            }else{
                i++;
            }
        }
    }

    void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}