package day07.Fstatic_;

public class Calculator {

    // 모든 계산기 색깔이 다르니까 static 붙이면 안됨!
    String color; // 계산기 색깔
    static double pi = 3.14; // 원주율
    // 원주율 다 똑같으니까 메모리에 1개만 만들어서 다 돌려쓰면 됨. 그니까 static!

    // 원의 넓이를 구하는 메서드
    static double calcAreaCircle(int r) {
        return pi * r * r;
    }

    // 계산기에 색칠을 예쁘게 칠하는 기능
    void paint(String color) {
        System.out.println("계산기에 " + color + "색을 칠합니다.");
        this.color = color;
    }


}
