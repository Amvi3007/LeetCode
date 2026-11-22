class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int ans = 0;
        while(left<right){
            int width = right - left;
            int length = Math.min(height[left],height[right]);

            int area = width * length;
            ans = Math.max(area,ans);
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        return ans;
    }
}