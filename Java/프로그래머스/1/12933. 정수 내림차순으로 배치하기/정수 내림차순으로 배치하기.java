import java.util.Arrays;

class Solution {
    public long solution(long n) {
        String str = String.valueOf(n);
        char[] cal = str.toCharArray();

        Arrays.sort(cal);

        StringBuilder sb = new StringBuilder();
        for (int i = cal.length - 1; i >= 0; i--) {
            sb.append(cal[i]);
        }

        long answer = Long.parseLong(sb.toString());
        return answer;
    }
}