class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int[] num = new int[points.length];
        
        //adding x point of points 2d array in num
        for(int i = 0; i < points.length; i++){
            num[i] = points[i][0];
        }
        
        Arrays.sort(num);
        return maxDiff(num);
    }
    
    int maxDiff(int[] num){
        int maxDifference = 0;
        for(int i = 0; i<num.length-1; i++){
            int Difference  = num[i+1] - num[i];
            maxDifference = Math.max(Difference, maxDifference);
        }
        
        return maxDifference;
    }
}