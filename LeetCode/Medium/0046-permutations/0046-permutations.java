class Solution {
    public List<List<Integer>> check(List<Integer> cur,List<Integer> rem,int n,List<List<Integer>> output){
        if(cur.size() == n){
            output.add(new ArrayList<>(cur));
            return output;
        }
        for(int i=0;i<rem.size();i++){
            int x = rem.get(i);
            cur.add(x);
            rem.remove(i);
            check(cur,rem,n,output);
            cur.remove(cur.size()-1);
            rem.add(i,x);
        }

        return output;
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> out = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        List<Integer> rem = new ArrayList<>();
        for(int x:nums){
            rem.add(x);
        }
        List<List<Integer>> p = check(cur,rem,nums.length,out);
        return p;
    }
}