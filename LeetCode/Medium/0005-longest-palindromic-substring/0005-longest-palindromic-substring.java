class Solution {
    public String Expand(int start,int end,String s){
        while(start>=0 && end<s.length() && s.charAt(start) == s.charAt(end)){
            start--;
            end++;
        }

        return s.substring(start+1,end);
    }
    public String longestPalindrome(String s) {
        String ans = "";
        for(int i = 0;i<s.length();i++){
            String odd = Expand(i,i,s);
            String even = Expand(i,i+1,s);

            if(odd.length()>ans.length())ans = odd;
            if(even.length()>ans.length())ans = even;
        }
        return ans;
    }
}