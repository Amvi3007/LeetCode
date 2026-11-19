class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        HashMap<String,Integer> map = new HashMap<>();
        for(int i =0;i<cpdomains.length;i++){
            String[] x = cpdomains[i].split(" ");
            int c = Integer.parseInt(x[0]);
            String[] y = x[1].split("\\.");
            StringBuilder s = new StringBuilder();
            for(int j = y.length-1;j>=0;j--){
                if (s.length() == 0) {
                    s.append(y[j]);
                } else {
                    s.insert(0, y[j] + ".");
                }
                map.put(s.toString(),map.getOrDefault(s.toString(),0)+c);
                
            }
        }


        List<String> ans = new ArrayList<>();
        for(String key : map.keySet()){
            StringBuilder s = new StringBuilder();
            s.append(map.get(key));
            s.append(" ");
            s.append(key);
            ans.add(new String(s));
        }

        return ans;
    }
}