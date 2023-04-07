package day10.collection.list;

import day07.util.Utility;

import java.util.*;

/**
 * - 저장 데이터의 순서를 보장
 * - 인덱스를 가지고 있음
 * - 중복 데이터를 저장 가능
 */

public class ListExample {

    public static void main(String[] args) {

        // 리스트에 직접 접근 못하고 메서드를 통해서 우회해서 접근

        List<String> foodList = new ArrayList<>();

        // add(E e) : 끝 추가
        foodList.add("짜장면");
        foodList.add("짬뽕");
        foodList.add("닭강정");
        foodList.add("파스타");
        foodList.add("리조또");

        // add(index, element) : 중간 삽입 -> 오버로딩
        foodList.add(2, "족발");
        System.out.println("foodList = " + foodList);


        // size() : 저장된 데이터 개수를 반환
        int size = foodList.size();
        ;
        System.out.println("size = " + size);

        System.out.println(foodList.toString());
        System.out.println(foodList);
        // 주소값이 들어있는 객체면 toString 적지 않아도 배열 바로 나열해줌

        // indexOf(E e) : 해당 데이터의 인덱스 반환
        int index = foodList.indexOf("파스타");
        System.out.println("index = " + index);

        // contains(E e) : 해당 데이터 저장 유무 확인
        System.out.println(foodList.contains("짜장면"));
        System.out.println(foodList.contains("마파두부"));

        // remove(index), remove(obj) -> 오버로딩
        String removedFood = foodList.remove(1); // 인덱스로 지우면 뽑은 데이터 줌
        boolean remove = foodList.remove("파스타");
        System.out.println("remove = " + remove);
        System.out.println("removedFood = " + removedFood);
        System.out.println("foodList = " + foodList);

        // set(index, newElement) : 수정
        foodList.set(0, "동파육");
        System.out.println("foodList = " + foodList);

        // get(index) : 리스트에 저장된 데이터 참조
        String s = foodList.get(1);
//        String s = foodList[1]; // 원래같으면 이거~
        System.out.println("s = " + s);


        // =================================================
        Utility.makeLine();
        // 반복문처리
        for (int i = 0; i < foodList.size(); i++) {
            System.out.println(foodList.get(i));
//            System.out.println(foodList[i]); // 원래같으면 이거~
        }

        // List ctrl 눌러서 타고타고 들어가면
        // 인터페이스 iterable 있는데, 얘가 있으면
        // 떙땡이 for문(for-each) 돌릴수 있음
        for (String food : foodList) {
            System.out.println("food = " + food);
        }

        // clear() : 내부 데이터 전체삭제
        foodList.clear();
        System.out.println("foodList = " + foodList);
        System.out.println(foodList.isEmpty());


        // 리스트에 초기값 넣고 시작하기
        List<String> tvxq = new ArrayList<>(
                Arrays.asList("유노윤호", "최강창민")
        );
        System.out.println("tvxq = " + tvxq);


        //===========================================================
        Utility.makeLine();
        // 정렬 (듀얼 피벗 퀵 정렬)
        List<Integer> numbers = new ArrayList<>(
                Arrays.asList(67, 5, 88, 22, 54, 44)
        );
        System.out.println("numbers = " + numbers);
        
        // 오름차 정렬
        Collections.sort(numbers);
        System.out.println("numbers = " + numbers);

        // 내림차 정렬
        numbers.sort(Comparator.reverseOrder());
        System.out.println("numbers = " + numbers);





    }
}
