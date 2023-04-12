package day13.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Student> students1 = List.of(
                new Student("홍철수", 15, 79),
                new Student("박영희", 17, 41),
                new Student("손흥민", 11, 11),
                new Student("감우성", 25, 34)
        );

        students1.forEach(s -> System.out.println(s));

        // List.of 는 고정된 리스트임
        // 그래서 이렇게 추가하거나 삭제안됨. (수정안됨!!!)
//        students1.add(new Student("박영희", 17, 41));
        // 그래서 아래 처럼 작성해야함 (불변성을 깨기 위해서!!)

        // ===============================================================


        List<Student> students2 = new ArrayList<>(
                List.of(
                        new Student("홍철수", 15, 79),
                        new Student("박영희", 17, 41),
                        new Student("손흥민", 11, 11),
                        new Student("감우성", 25, 34)
                )
        );


        System.out.println("\n\n===== 나이 순으로 오름차 정렬 (나이 적은순) =====");
        students2.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() - o2.getAge(); // 오름차정렬
            }
        });
        students2.forEach(s -> System.out.println(s));


        System.out.println("\n\n===== 이름 가나다순으로 오름차 정렬 =====");
        students2.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        students2.forEach(s -> System.out.println(s));


        // 람다로 바꿔보기
        // stream에 더 편한 sort가 있음 (알아서 오름차, 내림차 해줌)


    }
}
