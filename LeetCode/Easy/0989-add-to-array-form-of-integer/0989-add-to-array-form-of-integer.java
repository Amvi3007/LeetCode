class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        int i = num.length-1;
        List<Integer> x = new ArrayList<>();
        while(i>=0 || k>0){
            if(i>=0){
                k+=num[i];
                i--;
            }
            x.add(k%10);
            k = k/10;
        }
        Collections.reverse(x);
        return x;
    }
}