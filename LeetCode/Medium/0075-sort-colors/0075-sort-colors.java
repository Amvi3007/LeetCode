class Solution {

    public void quickSort(int low,int high,int[] nums){
        if(low>=high)return;
        int pvt = pivot(low,high,nums);
        quickSort(low,pvt-1,nums);
        quickSort(pvt+1,high,nums);
    }

    public int pivot(int low,int high,int[] nums){
        int pivot = nums[high];
        int i = low;
        for(int j = low;j<high;j++){
            if(nums[j]<pivot){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
        }
        int temp = nums[i];
        nums[i] = pivot;
        nums[high] = temp;

        return i;
    }
    public void sortColors(int[] nums) {
        quickSort(0,nums.length-1,nums);
    }
}