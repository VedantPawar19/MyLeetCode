class Solution {
    public long findTheArrayConcVal(int[] nums) {
        long sum = 0;
        int start = 0;
        int end = nums.length-1;

        while(start<=end){
            if(start==end){
                sum += nums[start];
            }else if(start<end){
                sum += nums[start] * Math.pow(10, digits(nums[end])) + nums[end];
            }
            start++;
            end--;
        }

        return (long) sum;
    }


    static int digits(int n){
        int count = 0;
        while(n!=0){
            count++;
            n = n/10;
        }
        return count;
    }
}