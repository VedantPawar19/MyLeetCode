class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        boolean[] ans = IsGreatest(candies, extraCandies);
        List<Boolean> ResultList = new ArrayList<>();
        
        for(int i=0; i<ans.length; i++){
            ResultList.add(ans[i]);
        }
        return ResultList;
    }
    
    boolean[] IsGreatest(int[] arr, int extraCandies){
        boolean[] result = new boolean[arr.length];
        for(int i = 0; i<arr.length; i++){
            if(arr[i] + extraCandies >= Max(arr)){
                result[i] = true;
            }else{
                result[i] = false;
            }
        }
        return result;
    }
    
    int Max(int[] arr){
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i]>max){
                max = arr[i];   
            }
        }
        return max;
    }
}