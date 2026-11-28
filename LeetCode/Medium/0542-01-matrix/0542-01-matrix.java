class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int[][] dis = new int[mat.length][mat[0].length];
        Queue<int[]> q = new LinkedList<>();
        for(int i = 0;i<mat.length;i++){
            for(int j = 0;j<mat[0].length;j++){
                if(mat[i][j] == 0){
                    q.add(new int[]{i,j});
                }
                else{
                    dis[i][j] = -1;
                }
            }
        }

        int[][] dir = {{-1,0},{0,-1},{1,0},{0,1}};
        while(!q.isEmpty()){
            int n = q.size();
            for(int i = 0;i<n;i++){
                int[] cur = q.poll();
                for(int[] d : dir){
                    int nr = cur[0]+d[0];
                    int nc = cur[1]+d[1];
                    if(nr<mat.length && nr>=0 && nc<mat[0].length && nc>=0 && dis[nr][nc] == -1){
                        dis[nr][nc] = dis[cur[0]][cur[1]]+1;
                        q.add(new int[]{nr,nc});
                    }
                }
            }
        }
        return dis;
    }
}