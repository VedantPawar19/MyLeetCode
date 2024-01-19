class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] yearAlive = new int[101];
        
        for(int i = 0; i < yearAlive.length; i++){
            for(int row = 0; row < logs.length; row++){
                if(1950+i >= logs[row][0] && 1950+i < logs[row][1]){
                    yearAlive[i]++;
                }             
            }
        }

        return maxValueIndex(yearAlive);
    }
    
    int maxValueIndex(int[] num){
        int max = num[0];
        int maxIndex = 1950;
        
        for(int i = 1; i < num.length; i++){
            if(num[i] > max){
                max = num[i];
                maxIndex = i + 1950;
            }
        }
        
        return maxIndex;
    }
}