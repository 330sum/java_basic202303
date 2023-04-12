package day13.stream;

import java.util.Comparator;

import static day13.stream.Menu.menuList;

public class Finding {

    public static void main(String[] args) {

        System.out.println("\n\n========== 메뉴 목록에서 채식주의가 먹을 수 있는 요리가 하나라도 존재? ==========");
        boolean flag1 = menuList.stream()
                .anyMatch(d -> d.isVegeterian());
        System.out.println("flag1 = " + flag1);


        System.out.println("\n\n========== 메뉴 목록에서 칼로리가 100미만인 요리 존재? ==========");
        boolean flag2 = menuList.stream()
                .anyMatch(d -> d.getCalories() < 100);
        System.out.println("flag2 = " + flag2);


        System.out.println("\n\n========== 메뉴 목록의 모든 요리가 1000칼로리 미만인가? ==========");
        boolean flag3 = menuList.stream()
                .allMatch(d -> d.getCalories() < 1000);
        System.out.println("flag3 = " + flag3);


        // nonMatch : allMatch의 반대연산

        // 중복확인도 anymatch로 하면 됨!


        System.out.println("\n\n========== 메뉴 목록에서 칼로리가 가장 낮은것은? ==========");
        Dish dish1 = menuList.stream()
                .min(Comparator.comparing(d -> d.getCalories()))
                .get();
        System.out.println("dish = " + dish1);



    }
}
