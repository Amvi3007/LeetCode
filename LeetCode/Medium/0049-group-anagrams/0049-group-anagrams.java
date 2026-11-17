class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList<String>> map = new HashMap<>();
        for(int i =0;i<strs.length;i++){
            char[] x = strs[i].toCharArray();
            Arrays.sort(x);
            String p = new String(x);
            map.putIfAbsent(p,new ArrayList<>());
            map.get(p).add(strs[i]);
        }

        return new ArrayList<>(map.values());
    }
}