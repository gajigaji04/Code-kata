class Solution {
    public boolean solution(String s) {
        String str = s;
        
        boolean isValid = str != null && str.matches("^(\\d{4}|\\d{6})$");
        
        if(isValid) {
            return true;
        } else {
            return false;
        }
        
    }
}