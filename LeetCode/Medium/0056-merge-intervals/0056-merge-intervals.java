class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> list = new ArrayList<>();
        for(int i =0;i<intervals.length;i++){
            ArrayList<Integer> x = new ArrayList<>();
            list.add(intervals[i]);
        }

        list.sort((a,b)->(a[0]-b[0]));

        for(int i =0;i<list.size()-1;i++){
            if(list.get(i)[1]>=list.get(i+1)[0]){
                int temp = Math.max(list.get(i)[1],list.get(i+1)[1]);
                list.remove(i+1);
                list.get(i)[1] = temp;
                i--;
            }
        }

        int[][] ans = new int[list.size()][2];
        for(int i =0;i<list.size();i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
}