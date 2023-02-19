package lev0;

public class EvenSum {
    class Solution {
        public int solution(int n) {
            int answer = 0;
            for(int i=0; i<=n; i++){ // 순차적으로 정수에 접근할 수 있도록 for문 사용
                if(i % 2 == 0) { // 짝수 판별
                    answer += i; // 누적합
                }
            }
            return answer;
        }
    }
}
