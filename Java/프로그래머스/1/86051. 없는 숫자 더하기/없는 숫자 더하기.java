class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        // 0부터 9까지 반복
        for (int i = 0; i <= 9; i++) {
            boolean found = false;
            
            // numbers 배열에 해당 숫자(i)가 있는지 확인
            for (int num : numbers) {
                if (num == i) {
                    found = true;
                    break; // 찾았으면 더 확인할 필요 없음
                }
            }
            
            // 배열에 없었던 숫자라면 answer에 더함
            if (!found) {
                answer += i;
            }
        }
        
        return answer;
    }
}