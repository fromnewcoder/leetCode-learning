class Solution {
    public boolean isPalindrome(String s) {
        s = s.toUpperCase();
        StringBuilder stringBuilder = new StringBuilder();
        for(int i =0;i<s.length();i++){
            if(s.charAt(i) < 'a' || s.charAt(i) > 'z'){
                continue;
            }
            stringBuilder.append(s.charAt(i));
        }
        int start = 0;
        int end = stringBuilder.length() - 1;

        while (start < end){
            if(stringBuilder.charAt(start) == stringBuilder.charAt(end)){
                start++;
                end--;
            }else {
                return false;
            }
        }
        return true;
    }
}