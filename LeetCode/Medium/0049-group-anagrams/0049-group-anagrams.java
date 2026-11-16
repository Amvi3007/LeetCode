class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(int i =0;i<strs.length;i++){
            String k = strs[i];
            char[] arr = k.toCharArray();
            Arrays.sort(arr);
            String x = new String(arr);
            map.putIfAbsent(x,new ArrayList<>());
            map.get(x).add(strs[i]);
        }

        return new ArrayList<>(map.values());
    }
}