package day13.stream;

import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import static day13.stream.Menu.menuList;

public class Filtering {

    public static void main(String[] args) {

        // stream의 fillter
        // 필터조건에 맞는 데이터들을 필터링

        // 메뉴 목록 중에 채식주의자가 먹을 수 있는 요리를 알려주세요

        // 객체생성 없이 접근 할 수 있는 이유는? static이라서!
        // Menu.menuList

//        List<Dish> vegeList = new ArrayList<>();
//        for (Dish dish : vegeList) {
//            dish
//        }

//        List<Dish> filteredList = Menu.menuList.stream()
//                .filter(new VegePredicate())
//                .collect(Collectors.toList());
//        System.out.println("\n\n========== 채식주의자 식용 요리목록 ========== ");
//        for (Dish dish : filteredList) {
//            System.out.println("dish = " + dish);
//        }


        // 내부클래스
//        List<Dish> filteredList = Menu.menuList.stream()
//                .filter(new Predicate<Dish>() {
//                    @Override
//                    public boolean test(Dish dish) {
//                        return
//                                dish.isVegeterian();
////                                dish.getType() = Dish.Type.MEAT;
//                    }
//                })
//                .collect(Collectors.toList());
//        System.out.println("\n\n========== 채식주의자 식용 요리목록 ========== ");
//        for (Dish dish : filteredList) {
//            System.out.println("dish = " + dish);
//        }


        // 람다식
        List<Dish> filteredList = menuList.stream()
                .filter(
                        dish -> dish.isVegeterian()
                )
                .collect(Collectors.toList());

        // Collectors는 import static 할 수 있음. 왜? toList가 static이니까. 왜 한번에 보고 바로 앎? 클래스는 대문자로 시작
        // dish는 import static 불가. dish는 변수임. 관례를 꼭 지킬 것

        System.out.println("\n\n========== 채식주의자 식용 요리목록 ==========");
//        for (Dish dish : filteredList) {
//            System.out.println("dish = " + dish);
//        }

        // 내부클래스
        filteredList.forEach(new Consumer<Dish>() {
            @Override
            public void accept(Dish dish) {
                System.out.println(dish);
            }
        });

        // 람다식 변경 가능 (Alt + Enter)
//        filteredList.forEach(dish -> System.out.println(dish));

        // 하... 이렇게도 변경 가능
//        filteredList.forEach(System.out::println);


        System.out.println("\n\n========== 메뉴 목록중에서 육류이면서 600칼로리 미만인 요리 필터링 ==========");
        menuList.stream()
                .filter(d -> d.getType() == Dish.Type.MEAT && d.getCalories() < 600)
                .collect(Collectors.toList())
                .forEach(d -> System.out.println(d));


        // . . . 메서드 체인
        String greeting = "hello world!";
        String upperCase = greeting.toUpperCase();
        String substring = upperCase.substring(0, 5);
        char c = substring.charAt(2);
        System.out.println("c = " + c);

        char c1 = "hello world!"
                .toUpperCase()
                .substring(0, 5)
                .charAt(2);
        System.out.println("c1 = " + c1);


        System.out.println("\n\n========== 메뉴 목록중에서 요리이름이 4글자인 요리들만 필터링 ==========");
        menuList.stream()
                .filter(d -> d.getName().length() == 4)
                .collect(Collectors.toList())
                .forEach(d -> System.out.println(d));


        System.out.println("\n\n========== 원하는 개수만 필터링하기 ==========");
        System.out.println("========== 칼로리가 300칼로리보다 큰 요리 중 앞에서 3개만 필터링 ==========");
        menuList.stream()
                .filter(d -> d.getCalories() > 300)
                .limit(3) // 앞에서부터 3개 추출
                .collect(Collectors.toList())
                .forEach(d -> System.out.println(d));


        System.out.println("\n\n========== 칼로리가 300칼로리보다 높은 요리 중 처음 2개는 제끼고 3개만 필터링 ==========");
        menuList.stream()
                .filter(d -> d.getCalories() > 300)
                .skip(2) // 맨앞 2개 제외
                .limit(3)
                .collect(Collectors.toList())
                .forEach(d -> System.out.println(d));


        System.out.println("\n\n========== 메뉴 목록에서 처음 등장하는 2개의 고기요리를 필터링해서 출력해서 리스트에 반환 ==========");
        List<Dish> collect = menuList.stream()
                .filter(d -> d.getType() == Dish.Type.MEAT)
                .limit(2)
                .collect(Collectors.toList());

//        System.out.println(collect);
        System.out.println(collect.size());
        for (Dish dish : collect) {
            System.out.println(dish);
        }


        System.out.println("\n\n========== 중복제거 ========== ");

        List<Integer> numbers = List.of(1, 2, 1, 3, 3, 2, 4, 4, 5, 6);

        System.out.println("========== 리스트에서 중복제거하기  ==========");
        List<Integer> distinctList = numbers.stream()
                .distinct() // 중복제거
                .collect(Collectors.toList());
        System.out.println("distinctList = " + distinctList);

        System.out.println("========== 리스트에서 짝수만 걸러낸 뒤 중복 제거 ==========");
        List<Integer> distinctList2 = numbers.stream()
                .filter(n -> n % 2 == 0)
                .distinct() // 중복제거
                .collect(Collectors.toList());
        System.out.println("distinctList2 = " + distinctList2);

    }


}
