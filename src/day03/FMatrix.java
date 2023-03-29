package day03;

import java.util.Arrays;

public class FMatrix {

    public static void main(String[] args) {
        int korScore = 10;
        int mathScore = 20;
        int engScore = 30;

        int[] kimScores = {korScore, mathScore, engScore};
        int[] parkScores = {100, 34, 99};
        int[] hongScores = {10, 100, 11};

        // 2차원 배열
        int[][] classScores = {kimScores, parkScores, hongScores};

        System.out.println(classScores[0]); // int 1차원 배열의 주소값
        System.out.println(kimScores); // 주소값

        System.out.println(classScores[0][0]);
        System.out.println(kimScores[0]);

//        System.out.println(classScores[0] - classScores[1]); // 안됨
        System.out.println(classScores[0][2] - classScores[1][1]); // 김의 국어30 - 박의 수학34


        System.out.println(Arrays.toString(classScores)); // 주소값들
        System.out.println(classScores[1]);
        System.out.println(parkScores);

        System.out.println(Arrays.deepToString(classScores)); // [[10, 20, 30], [100, 34, 99], [10, 100, 11]]


        // 2차원 배열의 값 초기화
        int[][] arr2d = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90},
                {100, 200, 300},
        };
        // 60에 접근하려면? (행렬 읽고 각각 -1 해주기)
        System.out.println(arr2d[1][2]); // 60

        int[] arr3 = arr2d[2]; // [70, 80, 90]


        // 2차원 배열의 순회
        for (int[] arr : arr2d) {
            for (int n : arr) {
                System.out.printf("%3d ", n); // %3d : 억지로 3칸 차지하기 (가격 줄맞추기)
            }
            System.out.println();
        }


        for (int i = 0; i < arr2d.length; i++) {
            int[] arr = arr2d[i];
            for (int j = 0; j < arr.length; j++) {
                int n = arr[j];
                System.out.printf("%3d ", n); // %3d : 억지로 3칸 차지하기 (가격 줄맞추기)
            }
            System.out.println();
        }


        System.out.println("===========================");
        // 배열의 기본값
        // 정수배열은 0이 기본값, 실수배열는 0.0이 기본값
        // 논리 기본값 false, char배열 기본값 공백
        // 나머지는 전부 null이 기본값
        char[] numbers = new char[5];
        System.out.println(Arrays.toString(numbers));


        // 5행 4열의 정수 2차원배열을 생성만 하고 싶다.
        int[][] array2d = new int[5][4];
        for (int[] ints : array2d) {
            for (int anInt : ints) {
                System.out.printf("%3d ", anInt);
            }
            System.out.println();
        }
        System.out.println("===========================");


        // 2차원 배열의 수정
        array2d[1][3] = 100; // array2d 2행 4열 값 수정
        array2d[2][1] = 55;
        array2d[3] = new int[]{9, 8, 7, 6}; // 선언과 동시에 초기화한다면 new Type[] 생략가능, 그 외에는 생략 불가! (day2-DArrayCopy)

        for (int[] ints : array2d) {
            for (int anInt : ints) {
                System.out.printf("%3d ", anInt);
            }
            System.out.println();
        }


        System.out.println("===========================");
        // 3차원 배열
        int[][][] arr3d = {
                {
                    {10, 20},
                    {30, 40}
                },
                {
                    {50, 60},
                    {70, 80}
                },
                {
                    {90, 100},
                    {200, 30}
                },
        };
        // 60에 접근하려면?
        System.out.println(arr3d[1][0][1]);


    }
}
