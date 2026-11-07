class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals , (a,b) -> (a[0] - b[0]));
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int i = 0;i<intervals.length;i++){
            ArrayList<Integer> x = new ArrayList<>();
            x.add(intervals[i][0]);
            x.add(intervals[i][1]);
            list.add(x);
        }

        for(int i = 0;i<list.size()-1;i++){
            if(list.get(i).get(1) >= list.get(i+1).get(0)){
                int temp = list.get(i+1).get(1);
                list.remove(i+1);
                list.get(i).set(1,Math.max(list.get(i).get(1),temp));
                i--;
            }
        }

        int[][] ans = new int[list.size()][2];
        for(int i =0;i<list.size();i++){
            for(int j =0;j<2;j++){
                ans[i][j] = list.get(i).get(j);
            }
        }

        return ans;
    }
}