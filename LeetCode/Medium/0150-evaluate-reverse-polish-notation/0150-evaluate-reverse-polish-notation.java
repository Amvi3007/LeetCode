class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int res = 0;
        for(String token : tokens){
            if(token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")){
                int b = stack.pop();
                int a = stack.pop();
                if(token.equals("+")){
                    res = a + b;
                }
                else if(token.equals("-")){
                    res = a - b;
                }
                else if(token.equals("*")){
                    res = a*b;
                }
                else {
                    res = a/b;
                }

                stack.push(res);
                res = 0;
            }else{
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
}