package lev1;

import java.util.Arrays;

public class ArrayAverage {

        public double solution(int[] numbers) {
            return Arrays.stream(numbers).average().getAsDouble();
        }

}
