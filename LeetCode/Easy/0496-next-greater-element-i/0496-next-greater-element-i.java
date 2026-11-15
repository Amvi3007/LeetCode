class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        for(int i =0;i<nums1.length;i++){
            int max = nums1[i];
            boolean flag = false;
            for(int j = 0;j<nums2.length;j++){
                if(nums1[i] == nums2[j]){
                    for(int k = j+1;k<nums2.length;k++){
                        if(nums2[k] > max){
                            max = nums2[k];
                            flag = true;
                            break;
                        }
                    }
                }
                if(flag){
                    break;
                }
            }
            if(max == nums1[i]){
                nums1[i] = -1;
            }else{
                nums1[i] = max;
            }
        }
        return nums1;
    }
}