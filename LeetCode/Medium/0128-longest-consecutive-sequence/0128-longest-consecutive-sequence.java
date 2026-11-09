class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)return 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            map.put(nums[i],i);
        }

        int max = 0;
        for(int key:map.keySet()){
            int count = 0;
            if(!map.containsKey(key-1)){
                while(map.containsKey(key)){
                    count++;
                    key = key+1;
                }
                if(max <count){
                    max = count;
                }
            }
        }
        return max;
    }
}