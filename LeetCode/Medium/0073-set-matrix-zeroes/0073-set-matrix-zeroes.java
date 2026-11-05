class Solution {
    public void setZeroes(int[][] matrix) {
        int x = matrix.length;
        int y = matrix[0].length;
        boolean[][] check = new boolean[x][y];


        for(int i = 0;i<matrix.length;i++){
            for(int j =0;j<matrix[0].length;j++){
                if(matrix[i][j] == 0){
                    check[i][j] = true;
                }else{
                    check[i][j] = false;
                }
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j = 0;j<matrix[0].length;j++){
                if(check[i][j] == true){
                    int m = i;
                    int n = j;
                    for(int k = 0;k<matrix.length;k++){
                        matrix[k][n] = 0;
                    }
                    for(int l = 0;l<matrix[0].length;l++){
                        matrix[m][l] = 0;
                    }
                }
            }
        }
    }
}