class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<numbers.length;i++){
            map.put(numbers[i],i+1);
        }

        for(int i = 0;i<numbers.length;i++){
            int current = numbers[i];
            if(map.containsKey(target - current)){
                return new int[]{i+1,map.get(target - current)};
            }
        }
        return new int[]{};
    }
}