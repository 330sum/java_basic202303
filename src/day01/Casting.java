package day01;

public class Casting {
    public static void main(String[] args) {
        // 대입도 연산임.
        // 프로그래밍 언어는 기본적으로 타입이 다르면 연산이 불가함.

        // 업캐스팅
        byte a = 100;
        int b = a;
        // int는 더 큰 공간이니까 자바가 알아서 자동으로 형변환 해줌 (잃을 데이터가 없기 때문에)


        // 다운캐스팅
        // +8 : 00001000
        // 음수는 1의 보수 변환 : 비트 반전
        //       11110111
        // 2의 보수로 변환 : +1
        //  -8 : 11111000

        // 00001000 + 11110111 = 1 00000000 (8bit니까 맨 앞의 부호비트는 삭제)

        // MSB(부호비트) 0은 양수, 1은 음수
        // int c : [2진수] 0 00000000 00000000 00000011 11101000
        int c = 1000;

        // byte d : 11101000
        //          00010111
        //                +1
        //          00011000 (8+16 = 24)
        byte d = (byte) c;
        System.out.println("d = " + d); // -24
        // 다운캐스팅은 큰집에서 작은집으로 가니까 가구를 버려야함. (그 가구들이 훼손될 수도 있다는 것에 사인해야함)


        // 다운캐스팅은 데이터소실의 위험성이 있다
        double x = 3.5566;
        int y = (int) x; // 소수점 버리는 다운캐스팅 (데이터 날라간거)
        System.out.println("y = " + y); // 3


        // 데이터 소실이 없을 수 도 있음
        short n = 20;
        byte m = (byte) n; // byte는 +127까지 표현 가능하기 때문
        System.out.println("m = " + m);


        // 타입이 다른 데이터의 연산
        // 큰 타입에 맞춰서 변환한 후 연산 진행
        int k = 100;
        double j = 5.5;
        double v = k + j;
        // (double)k + j 임. k가 100.0으로 바뀌어서 연산이 일어남


        char c1 = 'A';
        byte alpha = 1;
        System.out.println(c1 + alpha);

        // int보다 작은데이터(byte, short, char)끼리의 연산은
        // 무조건 둘 다 int로 변환된다

        byte b1 = 100;
        byte b2 = 20; //(만약 b2 = 120이면, 더하기 연산 불가. byte의 범위를 넘어갈 위험성 때문에 int로 자동형변환)
        int b3 = b1 + b2;


        System.out.println('가' + 'A');


        int g = 24;
        double result = g / 5;
        System.out.println("result = " + result); //4.0
//        double result = g / 5.0;             -> 4.8
//        double result = (double) g / 5;       -> 4.8
//        double result = (double) (g / 5);     -> 4.0
//        double result = (double) g / (double) 5.0; // alt + Enter


    }
}
