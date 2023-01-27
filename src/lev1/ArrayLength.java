package lev1;

public class ArrayLength {
    class Solution {
        public int[] solution(String[] strlist) {
            int[] answer = new int[strlist.length];
            for(int i=0; i<strlist.length; i++){
                answer[i]=strlist[i].length();
            }
            return answer;
        }
    }
}
