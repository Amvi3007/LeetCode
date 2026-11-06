class Solution {

    public void merge(int[] nums,int left,int right,int mid){
        int[] arr = new int[right - left + 1];
        int i = left;
        int j = mid+1;
        int k = 0;
        while(i<=mid && j<=right){
            if(nums[i]>nums[j]){
                arr[k] = nums[j];
                j++;
                k++;
            }else{
                arr[k] = nums[i];
                i++;
                k++;
            }
        }

        while(i<=mid){
            arr[k++] = nums[i++];
        }

        while(j<=right){
            arr[k++] = nums[j++];
        }

        for(int l = left;l<=right;l++){
            nums[l] = arr[l-left];
        }
    }

    public void mergeSort(int []nums,int left,int right){
        if(left >= right){
            return ;
        }
        int mid = left + (right - left)/2;
        mergeSort(nums,left,mid);
        mergeSort(nums,mid+1,right);
        merge(nums,left,right,mid);
    }
    public void sortColors(int[] nums) {
        mergeSort(nums,0,nums.length-1);
    }
}