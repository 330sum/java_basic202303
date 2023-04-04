package day07.Glotto;

import java.util.Arrays;

public class Lotto {

    static int[] numbers;

    static void information() {

        numbers = new int[6];
        for (int i = 0; i < 6; i++) {
            numbers[i] = (int) (Math.random() * 45 + 1);
        }
        // 배열 오름차순 정렬
        Arrays.sort(numbers);

        System.out.println(Arrays.toString(numbers));
    }


}
