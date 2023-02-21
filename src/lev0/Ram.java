package lev0;

public class Ram {

    class Solution {
        public int solution(int n, int k) {
            // 양꼬지 n, 음료수 k
            int price = 0;
            if(n>9) {
                price = 12000*n+2000*k-2000*(n/10);
            } else
                price = 12000*n+2000*k;

            return price;
        }
    }
}
