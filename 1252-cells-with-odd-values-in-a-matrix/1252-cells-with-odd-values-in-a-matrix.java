class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] matrix = new int[m][n];

        // zero matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = 0;
            }
        }
        
        // final matrix after increments
        increment(m, n, indices, matrix);
        
        // finding odd elements count
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] % 2 != 0){
                    count++;
                }
            }
        }

        return count;
    }

    void increment(int m, int n, int[][] indices, int[][] matrix) {
        int i = 0;
        while(i<indices.length){
            int j = 0; //col of indices
            
            for(int r = 0; r < matrix.length; r++){
                for (int c = 0; c < matrix[r].length; c++) {
                    if(r==indices[i][j]){
                        matrix[r][c]++;
                    }   
                    if(c==indices[i][j+1]){
                        matrix[r][c]++;
                    }

                }
            }

            i++;
        }
    }
}