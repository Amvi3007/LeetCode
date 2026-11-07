class Solution {
    public int findDuplicate(int[] nums) {
        for(int i =0;i<nums.length;i++){
            int index = Math.abs(nums[i])-1;
            if(nums[index]>0){
                nums[index] = -nums[index];
            }else{
                return Math.abs(nums[i]);
            }
        }

        return -1;
    }
}