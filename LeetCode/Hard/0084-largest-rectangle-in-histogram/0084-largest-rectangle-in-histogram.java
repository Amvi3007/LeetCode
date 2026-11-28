class Solution {
    public int largestRectangleArea(int[] heights) {
        int[] nse = new int[heights.length];
        int[] pse = new int[heights.length];
        Stack<Integer> st = new Stack<>();

        for(int i = heights.length-1;i>=0;i--){
            while(!st.isEmpty() && heights[st.peek()] >= heights[i]){
                st.pop();
            }
            if(st.isEmpty()){
                nse[i] = heights.length;
            }else{
                nse[i] = st.peek();
            }
            st.push(i);
        }

        st = new Stack<>();
        for(int i = 0;i<heights.length;i++){
            while(!st.isEmpty() && heights[st.peek()] >= heights[i]){
                st.pop();
            }
            if(st.isEmpty()){
                pse[i] = -1;
            }
            else{
                pse[i] = st.peek();
            }
            st.push(i);
        }



        int max = 0;
        for(int i = 0;i<heights.length;i++){
            int width = nse[i] - pse[i] - 1;
            int area = heights[i]*width;
            max = Math.max(area,max);
        }
        return max;
    }
}