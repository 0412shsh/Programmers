package lev0;

public class Reverse {

    class Solution {
        public String solution(String my_string) {
            StringBuffer answer = new StringBuffer(my_string);
            String a = answer.reverse().toString();
            return a;
        }
    }
}
