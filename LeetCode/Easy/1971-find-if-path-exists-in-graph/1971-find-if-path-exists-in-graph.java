class Solution {
    static boolean check(List<List<Integer>> list,int source,int destination,boolean[] visited){
        visited[source] = true;
        if(source == destination)return true;
        for(int node : list.get(source)){
            if(!visited[node]){
                if(check(list,node,destination,visited)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i =0;i<n;i++){
            list.add(new ArrayList<>());
        }

        for(int[] edge: edges){
            int u = edge[0];
            int v = edge[1];

            list.get(u).add(v);
            list.get(v).add(u);
        }

        boolean[] visited = new boolean[n];
        return check(list,source,destination,visited);
    }
}