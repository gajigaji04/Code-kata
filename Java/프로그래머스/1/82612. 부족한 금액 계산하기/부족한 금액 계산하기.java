class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long totalSum = 0;

        // 1부터 count까지 반복하며 각 회차의 이용료를 누적 합산
        for (int i = 1; i <= count; i++) {
            totalSum += (long) price * i;
        }
        
        if(totalSum > money) {
            return totalSum - money;
        } else {
            return 0;
        }
    }
}