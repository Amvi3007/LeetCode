class Solution {
    static boolean check(int n, List<List<Integer>> list, int source, int destination,boolean[] visited){
        visited[source] = true;
        Queue<Integer>q = new LinkedList<>();
        q.add(source);
        while(!q.isEmpty()){
            int x = q.poll();
            for(int node : list.get(x)){
                if(!visited[node]){
                    q.add(node);
                    visited[node] = true;
                }
            }
            if(x == destination){
                return true;
            }
        }
        return false;
    }

    public boolean validPath(int n, int[][] edges, int source, int destination) {
        boolean[] visited = new boolean[n];
        List<List<Integer>> list= new ArrayList<>();
        for(int i =0;i<n;i++){
            list.add(new ArrayList<>());
        }

        for(int[] edge: edges){
            int u = edge[0];
            int v = edge[1];

            list.get(u).add(v);
            list.get(v).add(u);
        }
        return check(n,list,source,destination,visited);
    }
}