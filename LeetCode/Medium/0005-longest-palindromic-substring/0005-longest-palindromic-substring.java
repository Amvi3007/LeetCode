class Solution {
    public String longestPalindrome(String s) {
        int maxLength = 0;
        String ans = new String("");

        for(int i =0;i<s.length();i++){
            for(int j = i;j<s.length();j++){
                int left = i;
                int right = j;
                boolean flag = false;
                while(left<right){
                    if(s.charAt(left)!=s.charAt(right)){
                        flag = true;
                        break;
                    }
                    left++;
                    right--;
                }
                if(!flag){
                    if(maxLength<=j-i+1){
                        maxLength = j-i+1;
                        ans = s.substring(i,j+1);
                    }
                }
                
            }
        }
        return ans;
    }
}