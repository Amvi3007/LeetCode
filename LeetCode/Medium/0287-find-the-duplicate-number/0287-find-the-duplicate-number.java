class Solution {
    public int findDuplicate(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        while(left<right){
            int mid = left + (right - left)/2;
            int count = 0;
            for(int i =0;i<nums.length;i++){
                if(nums[i]<=mid){
                    count++;
                }
            }
            if(count > mid){
                right = mid;
            }else{
                left = mid + 1;
            }
        }

        return left;
    }
}

// n+1 numbers, values in 1..n, so by pigeonhole at least one value repeats
// left, right, mid are values, not indices
// Each step: count how many elements are <= mid (scan the whole array)
// count > mid → too many for the slots 1..mid → duplicate is in 1..mid → right = mid
// Otherwise → duplicate is in mid+1..n → left = mid + 1