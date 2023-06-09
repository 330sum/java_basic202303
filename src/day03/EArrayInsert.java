package day03;

import java.util.Arrays;

// 배열 중간 삽입
public class EArrayInsert {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        // 20이랑 30사이에 넣고 싶음
        int targetIndex = 2;
        int newData = 25; // 2번인덱스에 넣어야 함

//         1. 배열의 사이즈를 먼저 1 늘리기
//         2. 원본배열을 다 복사해놓음
//         3. 맨 뒤부터 타켓인덱스까지 한칸씩 뒤로 밀기
//         4. 타겟인덱스 자리에 새 데이터를 넣는다
//         5. 주소를 바꾼다

        System.out.println("추가 전 : " + Arrays.toString(arr));

        // 1.
        int[] temp = new int[arr.length + 1];
        // 2.
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        // 3.
        /*
        temp[5] = temp[4];
        temp[4] = temp[3];
        temp[3] = temp[2];
        temp[targetIndex] = newData;
        temp[1] = temp[1];
        temp[0] = temp[0];
        */
        for (int i = temp.length - 1; i > targetIndex; i--) {
            temp[i] = temp[i - 1];
        }
        // 4.
        temp[targetIndex] = newData;
        // 5.
        arr = temp;
        temp = null;

//        System.out.println("추가 전 : " + Arrays.toString(temp));
        System.out.println("추가 후 : " + Arrays.toString(arr));
    }
}
