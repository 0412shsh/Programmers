package lev0;

import java.util.Arrays;

public class Center {

    class Solution {
        public int solution(int[] array) {
            Arrays.sort(array); // 오름차순 정렬
            int size = array.length; // 배열사이즈
            int indexNum = size / 2; //
            int answer = array[indexNum];
            return answer;
        }
    }
}
