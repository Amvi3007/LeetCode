class Solution {
    public boolean check(int row,int col,int n,int[][] board){
        int i = row-1;
        int j = col-1;
        while(j>=0){
            if(board[row][j] == 1){
                return false;
            }
            j--;
        }
        j = col-1;
        while(i>=0 && j>=0){
            if(board[i][j] == 1){
                return false;
            }
            i--;
            j--;
        }

        i = row+1;
        j = col-1;
        while(i<n && j>=0){
            if(board[i][j] == 1){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public void solve(int n,List<List<String>> temp,int c,int board[][]){
        if(c == n){
            List<String> x = new ArrayList<>();
            for(int i = 0;i<n;i++){
                StringBuilder s = new StringBuilder("");
                for(int j =0;j<n;j++){
                    if(board[i][j] == 1){
                        s.append("Q");
                    }else{
                        s.append(".");
                    }
                }
                x.add(s.toString());
            }
            temp.add(x);
            return;
        }
        for(int row=0;row<n;row++){
            if(check(row,c,n,board)){
                board[row][c] = 1;
                solve(n,temp,c+1,board);
                board[row][c] = 0;
            }
        }

    }
    public List<List<String>> solveNQueens(int n) {
        int board[][] = new int[n][n];
        List<List<String>> temp = new ArrayList<>();
        solve(n,temp,0,board);
        return temp;
    }
}