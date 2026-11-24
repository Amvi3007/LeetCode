class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> q = new LinkedList<>();
        int fresh = 0;
        for(int i = 0;i<grid.length;i++){
            for(int j = 0;j<grid[i].length;j++){
                if(grid[i][j] == 2){
                    q.add(new int[]{i,j});
                }else if(grid[i][j] == 1){
                    fresh++;
                }
            }
        }

        int[][] dir = {{-1,0},
                        {0,-1},
                        {1,0},
                        {0,1}

                    };


        int time = 0;
        while(!q.isEmpty() && fresh>0){
            int n = q.size();
            for(int i =0;i<n;i++){

            int[] x = q.poll();
            int r = x[0];
            int c = x[1];
            
            for(int[] d : dir){
                int nr = d[0];
                int nc = d[1];

                int f = nr+r;
                int p = nc+c;

                if(f>=0 && f<grid.length && p>=0 && p<grid[0].length && grid[f][p] == 1){
                    grid[f][p] = 2;
                    fresh--;
                    q.add(new int[]{f,p});
                }
            }
            }
            time++;

        }
        if(fresh>0)return -1;

        return time;
    }
}