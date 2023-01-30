package lev1;

public class Multi {
    class Solution {
        public int solution(int n) {
            int answer = 0;
            for(int i=0; i<n; i++){
                if(i*i == n){
                    answer = 1;
                }
            }
            return answer == 1? 1:2;
        }
    }
}
