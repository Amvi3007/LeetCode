class Solution {
    public void nextPermutation(int[] nums) {
        int pivot = -1;
        for(int i = nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                pivot = i;
                break;
            }
        }
        if(pivot>=0){
            int j = nums.length-1;
            while(j>pivot && nums[j]<=nums[pivot]){
                j--;
            }
            int temp = nums[j];
            nums[j] = nums[pivot];
            nums[pivot] = temp;
        }

        int left = pivot+1;
        int right = nums.length-1;
        while(left<right){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
        }

    }
}