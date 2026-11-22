class Solution {
    public int trap(int[] height) {
        int[] PrefixMax = new int[height.length];
        int[] SuffixMax = new int[height.length];

        int max = height[0];
        for(int i =0;i<height.length;i++){
            max = Math.max(max,height[i]);
            PrefixMax[i] = max;
        }

        max = height[height.length-1];
        for(int i = height.length-1;i>=0;i--){
            max = Math.max(max,height[i]);
            SuffixMax[i] = max;
        }

        int sum = 0;
        for(int i =0;i<height.length;i++){
            sum+= Math.min(PrefixMax[i],SuffixMax[i]) - height[i]; 
        }

        return sum;
    }
}