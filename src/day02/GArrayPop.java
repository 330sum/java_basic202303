package day02;

import java.util.Arrays;

public class GArrayPop {

    public static void main(String[] args) {

        // 배열의 맨 끝 데이터 삭제
        int[] arr = {10, 20, 30, 40, 50};

        // 1. 원본배열보다 1개 사이즈 작은 새 배열 생성
        int[] temp = new int[arr.length - 1];

        // 2. 맨 마지막 데이터만 빼고 모두 새배열에 복사
        for (int i = 0; i < temp.length; i++) {
            temp[i] = arr[i];
        }

        // 3. 주소값 이전
        arr = temp; temp = null;

        System.out.println(Arrays.toString(arr));


    }
}
