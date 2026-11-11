class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        for(int i =0;i<nums.length;i++){
            if(i>0 && i<nums.length && nums[i] == nums[i-1])continue;
                    int j = i+1;
                    int k = nums.length-1;
                    while(j<k){
                        if(nums[i]+nums[j]+nums[k] == 0){
                            ArrayList<Integer> x = new ArrayList<>();
                            x.add(nums[i]);
                            x.add(nums[j]);
                            x.add(nums[k]);
                            list.add(x);
                            j++;
                            while(j<k && nums[j] == nums[j-1])j++;
                            k--;
                            while(k>j && nums[k] == nums[k+1])k--;
                        }else if (nums[i]+nums[j]+nums[k] > 0){
                            k--;
                        }else{
                            j++;
                        }
                    
            }
        }
        return list;
    }
}