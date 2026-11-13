class Solution {
    static void dfs(int[][] image,int row,int col,int oc,int nc){
        int rows = image.length;
        int cols = image[0].length;
        if(row<0 || col<0 || row>=rows || col>=cols){
            return;
        }

        if(image[row][col]!=oc){
            return;
        }
        image[row][col] = nc;
        dfs(image,row-1,col,oc,nc);
        dfs(image,row+1,col,oc,nc);
        dfs(image,row,col+1,oc,nc);
        dfs(image,row,col-1,oc,nc);
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int oc = image[sr][sc];
        if(oc == color){
            return image;
        }else{
            dfs(image,sr,sc,oc,color);
        }
        return image;
    }
}