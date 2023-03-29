package day03;

import java.util.Arrays;

// 배열 중간 삭제
public class DArrayDelete {

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11};
        System.out.println("삭제 전 : " + Arrays.toString(arr));

//        // 내가 3을 지우고 싶으면
//        arr[1] = arr[2];
//        arr[2] = arr[3];
//        arr[3] = arr[4];
//        arr[4] = arr[5];
////        arr[5] = arr[6];  // 런타임 오류

        // 지우고 싶은 인덱스
        int delIndex = 1;
        for (int i = delIndex; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        //pop
        int[] temp = new int[arr.length - 1];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = arr[i];
        }
        arr = temp;
        temp = null;

        System.out.println("삭제 후 : " + Arrays.toString(arr));
    }
}
