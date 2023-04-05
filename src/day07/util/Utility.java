package day07.util;

import java.util.Scanner;

public class Utility {

    private static Scanner sc = new Scanner(System.in);

    // 외부에서 객체가 만들 필요가 없으니까(new Utility()할 필요가 없으니까)
    // 객체생성을 아예 못하도록, 생성자를 못 쓰도록 private로 막아버리기
    private Utility() {}

    // 구분선을 출력하는 기능
    public static void makeLine() {
        System.out.println("======================================");
    }

    public static String input(String message) {
        System.out.print(message);
        return sc.nextLine();
        // 7번라인에 스캐너도 static으로 붙이기 -> 왜? static메서드 안에서는 static필드만 참조가능
        // 그리고 그 앞에 private 붙이기 -> 왜? 외부에서 접근 못하도록 하게 만들기

        // 공통적으로 사용하는 것은 static으로 불러서 사용하는 것이 편의성이 띄어남
    }

}
