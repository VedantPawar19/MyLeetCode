class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i = 0; i<nums.length; i++){
            if (even(nums[i])){
                count++;
            }
        }
        return count;
    }


    //function to check even digits or not
    static boolean even(int num){
        //converting int to str with concatenation
        String str = ""+num;
        int L= str.length();
        if(L%2==0){
            return true;
        }
        return false;
    }
}