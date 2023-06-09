package day10.collection.set;

import day07.util.Utility;

import java.util.*;

/**
 * - 집합 자료구조
 * - 저장순서를 보장하지 않음
 * - 인덱스, 키를 사용하지 않아서 개별탐색이 불리함
 * - 저장값의 중복을 허용하지 않음
 */

public class SetExample {

    public static void main(String[] args) {

        Set<String> foodSet = new HashSet<>();

        // 데이터 추가 add(E e) -> boolean
        boolean flag1 = foodSet.add("김말이");
        foodSet.add("닭꼬치");
        foodSet.add("단무지");
        boolean flag2 = foodSet.add("김말이");
        foodSet.add("김밥");

        System.out.println(foodSet.size());
        System.out.println(foodSet.toString());
        System.out.println(foodSet);

        System.out.println("flag1 = " + flag1); //true
        System.out.println("flag2 = " + flag2); //false

        //=========================================
        Utility.makeLine();
        // 반복문 중 땡땡이 for문만 가능 (그냥 반복문은 순서가 없어서 못씀)
        for (String food : foodSet) {
            System.out.println("food = " + food);
        }

        // get, set 안됨

        // remove(obj) : 삭제
        foodSet.remove("단무지");
        System.out.println("foodSet = " + foodSet);


        List<Integer> numbers = new ArrayList<>(
                Arrays.asList(1, 1, 1, 3, 3, 5, 7, 9, 9)
        );
        // List를 Set으로 변환
        Set<Integer> numberSet = new HashSet<>();
        numberSet.addAll(numbers);
        System.out.println("numberSet = " + numberSet);

        // Set<Integer> numberSet = new HashSet<>(numbers);
        // 위는 52~53라인과 같은 것



    }


}
