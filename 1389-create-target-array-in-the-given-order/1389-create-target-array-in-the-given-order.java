class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] newArray = new int[nums.length]; 
        
        for(int i = 0; i<nums.length; i++){
            if(index[i]>=i){
                newArray[index[i]] = nums[i];
            }else{
                insertatIndex(newArray, nums[i], index[i]);
            }
        }
        return newArray;
    }
    
    void insertatIndex(int[] newArray, int num, int pos){
        for (int i = newArray.length - 1; i > pos; i--) {
            newArray[i] = newArray[i - 1];
        }
        newArray[pos] = num;
    }
}