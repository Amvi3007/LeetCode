class Solution {
    public boolean isPalindrome(String s) {
        StringBuffer sb = new StringBuffer();
        for(int i =0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i)))sb.append(Character.toLowerCase(s.charAt(i)));
        }

        int left = 0;
        int right = sb.length()-1;
        while(left<=right){
            if(sb.charAt(left)!=sb.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}