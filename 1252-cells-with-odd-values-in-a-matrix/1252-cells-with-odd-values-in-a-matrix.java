class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[] rowIncrements = new int[m];
        int[] colIncrements = new int[n];
        
        for(int index[] : indices){
            rowIncrements[index[0]]++;
            colIncrements[index[1]]++;
        }

        int count = 0;
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                int cellValue = rowIncrements[i] + colIncrements[j];
                if(cellValue % 2 == 1){
                    count++;
                }
            }
        }

        return count;
    }
}