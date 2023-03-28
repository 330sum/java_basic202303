package day02;

import java.util.Arrays;

public class CArrayBasic {
    public static void main(String[] args) {
        // 배열을 객체 생성

        // 동종모음 구조
        int[] arr = new int[5];
        // 윈도우 운영체제 64비트 (8바이트) - 주소값은 8바이트에 담을수 있음
        // int는 4바이트
        System.out.println("arr = " + arr);

        arr[0] = 50;
        arr[1] = 77;
        arr[2] = arr[0] + 20;
        arr[3] = (int) 66.7;
        arr[4] = 100;
//        arr[5] = 50; // 런타임 에러

        // 배열의 길이 - 저장 데이터 개수
        // 자바의 배열 immutable(불변성)
        System.out.printf("배열의길이: %d\n", arr.length);


        // 배열 반복문 처리 - 단축키 fori
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d번 데이터 : %d\n", i + 1, arr[i]);
        }

        System.out.println("======================");
        // foreach문 - 단축키 iter
        for (int n : arr) {
            System.out.printf("데이터 : %d\n", n);
        }


        // 배열 내부데이터 문자열로 출력
        System.out.println(Arrays.toString(arr));

    }
}
