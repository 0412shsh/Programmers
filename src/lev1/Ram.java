package lev1;

public class Ram {
    int solution(int n, int k) {
        int answer = 0;
        if(n/10 != 0) {
            // 양꼬치 10인분 먹었을 때 가격
            answer = n*12000 + k*2000 - (n/10)*2000;
        }
        else answer = n*12000+k*2000;
        return answer;
    }
}
