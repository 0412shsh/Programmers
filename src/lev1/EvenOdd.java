package lev1;

public class EvenOdd {
    class Solution {
        public int[] solution(int[] num_list) {
            int odd = 0;
            int even = 0;
            for (int i = 0; i < num_list.length; i++) {
                if (num_list[i] % 2 != 0) // 짝수가 아닐 경우
                    odd++;
                else
                    even++;
            }

            return new int[] {even, odd};
        }
    }
}
