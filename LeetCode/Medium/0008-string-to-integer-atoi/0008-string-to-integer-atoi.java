class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        if(s.length() == 0)return 0;
        long num = 0;
        int i = 0;
        int sign = 1;
        
        if(i<s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-') ){
            if(s.charAt(i) == '-'){
                sign = -1;
            }
            i++;
        }

        while(i<s.length() && Character.isDigit(s.charAt(i))){
            num = num*10 + s.charAt(i) - '0';
            if(sign == 1  && num>Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }
            if(sign == -1 && num >= Integer.MAX_VALUE + 1L){
                return Integer.MIN_VALUE;
            }
            i++;
        }
        return (int)num*sign;
    }
}