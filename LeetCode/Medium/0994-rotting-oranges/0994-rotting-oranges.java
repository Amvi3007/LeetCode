class Solution {
    public int orangesRotting(int[][] grid) {
        int[][] dir = {
            {-1,0},{0,-1},{1,0},{0,1}
        };

        Queue<int[]>q = new LinkedList<>();
        int fresh = 0;
        for(int i = 0;i<grid.length;i++){
            for(int j = 0;j<grid[0].length;j++){
                if(grid[i][j] == 1)fresh++;
                if(grid[i][j] == 2)q.add(new int[]{i,j});
            }
        }
        int count = 0;
        while(!q.isEmpty() && fresh>0){
            int n = q.size();
            for(int i = 0;i<n;i++){
                int cur[] = q.poll();
                for(int[] d:dir){
                    int nr = cur[0]+d[0];
                    int nc = cur[1]+d[1];
                    if(nr<grid.length && nr>=0 && nc<grid[0].length &&nc>=0 && grid[nr][nc] == 1){
                        grid[nr][nc] = 2;
                        fresh--;
                        q.add(new int[]{nr,nc});
                    }
                }
            }
            count++;
        }
        if(fresh>0){
            return -1;
        }
        
        return count;
    }
}