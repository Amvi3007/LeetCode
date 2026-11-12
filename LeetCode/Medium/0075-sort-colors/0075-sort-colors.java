class Solution {

    public void mergeSort(int left,int right,int mid,int[] nums){
        int temp[] = new int[right - left + 1];
        int k = 0;
        int i = left;
        int j = mid+1;
        while(i<=mid && j<=right){
            if(nums[i]>nums[j]){
                temp[k++] = nums[j++];
            }else{
                temp[k++] = nums[i++];
            }
        }

        while(i<=mid){
            temp[k++] = nums[i++];
        }

        while(j<=right){
            temp[k++] = nums[j++];
        }

        for(int f = left ;f<=right;f++){
            nums[f] = temp[f - left];
        }
    }

    public void merge(int left,int right,int[] nums){
        if(left>=right)return;
        int mid = left + (right - left)/2;
        merge(left,mid,nums);
        merge(mid+1,right,nums);
        mergeSort(left,right,mid,nums);
    }
    public void sortColors(int[] nums) {
        merge(0,nums.length-1,nums);
    }
}