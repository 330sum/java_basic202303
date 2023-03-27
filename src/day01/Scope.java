package day01;

public class Scope {
    public static void main(String[] args) {

        int userNumber = 1010;
        // 변수, 함수 이름은 카멜케이스
        // 클래스명은 파스칼케이스

        // 자바는 블록단위 스코프를 가짐
        // 선언된 위치에서 수명이 결정 됨 (블록을 벗어나면 죽음)

        int n1 = 10;
        int n2 = 20; // main블록에서 생성된 변수

        if (true) {
//            int n1 = 200; // 자바와 자바스크립트의 차이점 (자바는 불가)
            int n3 = n1 + n2;
            System.out.println(n3);
        } // end if
//            System.out.println(n3); // 사용 불가


        int i;
        for (i = 0; i < 10; i++) {
            System.out.println(i);
        } // end for
        int n4 = i + 10;


    }// end main

//    int n3 = n1 + n2; // 사용 불가

}
