package day11.api.Csystem;

import java.util.Arrays;

public class SystemExample {


    public static void main(String[] args) {

        // 운영체제의 현재 시간 읽기
        long time = System.currentTimeMillis();
        System.out.println("time = " + time);

        // 코드들 있고

        long time2 = System.currentTimeMillis();

        // 코드들이 돌아간 실행시간을 구할 수 있음
        //System.out.println(time2-time);



        // 배열카피 (성능상 이게 제일 빠름)
        int[] arr = {10, 20, 30, 40, 50};
        int[] copyArr = new int[arr.length];
        System.arraycopy(arr, 0, copyArr, 0, arr.length);
        System.out.println(Arrays.toString(copyArr));


        // 배열카피 Arrays.copyOf
        int[] arr1 = Arrays.copyOf(arr, 2);
        int[] arr2 = Arrays.copyOf(arr, 7);

        System.out.print("arr의 요소중 2개 불러오기 : ");
        for(int i=0;i<arr1.length;i++) {
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        System.out.print("arr의 요소중 7개 불러오기 : ");
        for(int i=0;i<arr2.length;i++) {
            System.out.print(arr2[i]+" ");
        }
        System.out.println();


        // 특정범위 배열복사 Arrays.copyOfRange
        int[] arr3 = Arrays.copyOfRange(arr, 2,6);

        System.out.print("인덱스 2에서 5까지 불러오기 : ");
        for(int i=0;i<arr3.length;i++) {
            System.out.print(arr3[i]+" ");
        }



    }
}
