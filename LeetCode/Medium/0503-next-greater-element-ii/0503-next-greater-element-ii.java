class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int[] output = new int[nums.length];
        for(int i = 2*nums.length - 1;i>=0;i--){
            if(stack.isEmpty()){
                stack.push(nums[i%nums.length]);
            }else{
                while(!stack.isEmpty() && stack.peek()<=nums[i%nums.length]){
                    stack.pop();
                }
                if(!stack.isEmpty()){
                    output[i%nums.length] = stack.peek();
                }
                if(stack.isEmpty()){
                    output[i%nums.length] = -1;
                }
                stack.push(nums[i%nums.length]);
            }
        }

        return output;
    }
}