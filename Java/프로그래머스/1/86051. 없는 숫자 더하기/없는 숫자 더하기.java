class Solution {
    public int solution(int[] numbers) {
        int answer = 45;

        for(int num : numbers) {
        answer -= num;
}
        return answer;
    }
}

// 배열에서 0~9 숫자 무작위 포함
// numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 rturn해야 함