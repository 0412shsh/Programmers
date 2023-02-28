package lev0;

public class EvenOdd {
    class Solution {
        public int[] solution(int[] num_list) {
            int[] answer = new int[2]; // 배열은 두칸만 있으면 된다.
            int even = 0;
            int odd = 0;
            int length = num_list.length;
            for(int i = 0; i<length; i++){
                if(num_list[i] % 2 == 0) {
                    // 짝수
                    even++;
                    answer[0]= even;
                } else
                    // 홀수
                    odd++;
                    answer[1] = odd;

            }

            return answer;
        }
    }
}
