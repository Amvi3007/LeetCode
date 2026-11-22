class Solution {
    public int maxSubArray(int[] nums) {
        int MaxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for(int i =0;i<nums.length;i++){
            currentSum = Math.max(currentSum + nums[i],nums[i]);
            MaxSum = Math.max(currentSum,MaxSum);
        }
        return MaxSum;
    }
}