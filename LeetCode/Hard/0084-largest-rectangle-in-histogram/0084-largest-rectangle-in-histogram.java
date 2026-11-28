class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int max = 0;
        for(int i = 0;i<=heights.length;i++){
            int cur = (i == heights.length)?0:heights[i];
            while(!st.isEmpty() && cur < heights[st.peek()]){
                int height = heights[st.pop()];
                int left = st.isEmpty()?-1:st.peek();
                int width = i - left - 1;
                int area = height*width;
                max = Math.max(area,max);
            }
            st.push(i);
        }
        return max;
    }
}