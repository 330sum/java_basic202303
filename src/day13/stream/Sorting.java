package day13.stream;

import java.util.Comparator;
import java.util.stream.Collectors;

import static day13.stream.Menu.menuList;

public class Sorting {

    public static void main(String[] args) {

        // stream의 정렬 sorted
        System.out.println("\n===== stream의 정렬 sorted =====");
        System.out.println("===== 메뉴 목록 중 칼로리가 낮은 순으로 정렬 =====");

//        menuList.stream()
//                .sorted(new Comparator<Dish>() {
//                    @Override
//                    public int compare(Dish o1, Dish o2) {
//                        return 0;
//                    }
//                })
//                .collect(Collectors.toList())
//                .forEach(d -> System.out.println(d));


        menuList.stream()
                .sorted(Comparator.comparing(d -> d.getCalories()))
                .collect(Collectors.toList())
                .forEach(d -> System.out.println(d));


        System.out.println("\n===== 메뉴 목록 중 이름으로 내림차 정렬 (zyx순) =====");
        menuList.stream()
                .sorted(Comparator.comparing(Dish::getName).reversed())
                .collect(Collectors.toList())
                .forEach(d -> System.out.println(d));

        // reversed()가 람다는 안되고... 메소드참조는 됨



        System.out.println("\n========== 칼로리가 300칼로리보다 큰 요리 중 앞에서 3개만 (저칼로리, 고칼로리) 필터링 ==========");
        menuList.stream()
                .filter(d -> d.getCalories() > 300)
                .sorted(Comparator.comparing(dish -> dish.getCalories())) // 저칼로리 탑3
//                .sorted(Comparator.comparing(Dish::getCalories).reversed()) // 고칼로리 탑3
                .limit(3) // 앞에서부터 3개 추출
                .collect(Collectors.toList())
                .forEach(d -> System.out.println(d));








    }


}
