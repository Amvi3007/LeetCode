class Solution {
    public void dfs(int i, int j,boolean[][]visited,char[][]grid){
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length){
            return;
        }
        if(visited[i][j] == true)return;
        if(grid[i][j] == '0')return;
        visited[i][j] = true;
        dfs(i+1,j,visited,grid);
        dfs(i,j+1,visited,grid);
        dfs(i-1,j,visited,grid);
        dfs(i,j-1,visited,grid);
    }
    public int numIslands(char[][] grid) {
        int count = 0;
        boolean[][]visited = new boolean[grid.length][grid[0].length];
        for(int i = 0;i<grid.length;i++){
            for(int j = 0;j<grid[0].length;j++){
                if(grid[i][j] == '1' && visited[i][j]!=true){
                    dfs(i,j,visited,grid);
                    count++;
                }
            }
        }
        return count;
    }
}