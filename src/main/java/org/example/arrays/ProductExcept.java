package org.example.arrays;

public class ProductExcept {
    public int[] solution(int[] numbers) {
        int length = numbers.length;
        int[] result = new int[length];
        result[0] = 1;
        for(int i=1; i < numbers.length; i++) {
            result[i] = numbers[i-1] * result[i-1];
        }
        int R = 1;
        for (int i = length-1; i >= 0 ; i--) {
            result[i] = result[i]*R;
            R *= numbers[i];
        }
        return result;
    }
}
