class Solution {
    public String solution(String phone_number) {
        String answer = ""; // 1. 공백(" ") 대신 빈 문자열("")로 초기화!
        int length = phone_number.length();
        
        for (int i = 0; i < length - 4; i++) {
            answer += "*";
        }
        
        answer += phone_number.substring(length - 4);
        
        return answer; // 2. 결과를 반환하는 return 문 추가!
    }
}