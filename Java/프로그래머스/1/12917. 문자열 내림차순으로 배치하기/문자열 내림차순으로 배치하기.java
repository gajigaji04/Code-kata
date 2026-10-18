import java.util.Arrays;

class Solution {
    public String solution(String s) {
        char[] list = s.toCharArray();
        
        Arrays.sort(list);
        
        String answer = new StringBuilder(new String(list)).reverse().toString();
        
        return answer;
    }
}