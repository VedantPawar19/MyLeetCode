class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        for(int i = 0; i<mat.length; i++){
            for (int j = 0; j<mat.length; j++){
                if(i==j){
                    sum += mat[i][j];
                }    
            }
        }
        
        // for(int i = 0; i<mat.length; i++){
        //     for(int j = mat.length - 1; j>=0; j--){
        //         sum += mat[i][j];   
        //     }
        // }
        int row = 0;
        int col = mat.length-1;
        while(row<mat.length){
            if(row!=col){
            sum += mat[row][col]; 
            }
            row++;
            col--;
        }
        
        return sum;
    }
}