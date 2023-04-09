package day10.collection.GS25;

import day07.util.Utility;

import static day07.util.Utility.*;

public class ItemView {

    private final static ItemRepository ir;

    static {
        ir = new ItemRepository();
    }

    // 메인 실행 기능
    public static void start() {
        while (true) {

            System.out.println("\n ***** GS25 편의점 ***** ");
//            System.out.printf("# 현재 등록되어 있는 스낵 종류: %d\n", ctrl.);
            System.out.println("# 1. 스낵 등록하기");
            System.out.println("# 2. 스낵 정보 검색");
            System.out.println("# 3. 나가기");
            makeLine();

            String menuNum = input(">> ");

            switch (menuNum) {
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
                default:
                    System.out.println("# 메뉴를 잘못 입력했습니다!");
                    break;
            }



        }
    }



}
