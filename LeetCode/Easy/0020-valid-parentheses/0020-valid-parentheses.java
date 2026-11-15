class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i =0;i<s.length();i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                st.push(s.charAt(i));
            }else{
                if(st.isEmpty()){
                    return false;
                }
                char ch = s.charAt(i);
                char p = st.pop();
                if( (ch == ')' && p!='(') ||
                (ch == '}' && p!='{') ||
                (ch == ']' && p!='[')){
                    return false; 
                } 
            }
        }
        if(!st.isEmpty())return false;
        return true;
    }
}