package day04;

public class EFieldAndLocal {
    int a; // a: 필드
    double d;
    double[] e;
    void mm(int b) { // b: 매개변수
        int c; // c: 지역변수

        if (a > 10) {
            c = 99;
        } else if (a < 5) {
            c = -100;
        } else {
            c = 55;
        }

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
    // 초기화의 가능성
    // a는 new연산자로 호출하게되면 힙영역에 사니까 0으로 알아서 초기화 해줌
    // b는 mm함수를 사용할 때, 무조건 매개변수로 b값을 적어줘야 하기 때문에, 그 때 초기화 되니까 걱정 무
    // c는 어떻게든 값이 설정되도록 해줘야 함
}
