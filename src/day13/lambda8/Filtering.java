package day13.lambda8;

import java.util.List;
import java.util.stream.Collectors;

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
//        System.out.println("========== 채식주의자 식용 요리목록 ========== ");
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
//        System.out.println("========== 채식주의자 식용 요리목록 ========== ");
//        for (Dish dish : filteredList) {
//            System.out.println("dish = " + dish);
//        }


        // 람다식
        List<Dish> filteredList = Menu.menuList.stream()
                .filter(
                        dish -> dish.isVegeterian()
                )
                .collect(Collectors.toList());

        // Collectors는 import static 할 수 있음. 왜? toList가 static이니까. 왜 한번에 보고 바로 앎? 클래스는 대문자로 시작
        // dish는 import static 불가. dish는 변수임. 관례를 꼭 지킬 것

        System.out.println("========== 채식주의자 식용 요리목록 ========== ");
        for (Dish dish : filteredList) {
            System.out.println("dish = " + dish);
        }


    }

}
