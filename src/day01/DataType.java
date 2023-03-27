package day01;

public class DataType {
    public static void main(String[] args) {
        // 정수형
        // byte, short(2byte), int(4byte) - 2147483647(21억정도), long(8byte) - 900경정도

        // 정수저장 원리
        int a = 1000;
        // [10진수] 1000 : [2진수] 0011 1110 1000 (10bit)
        // 8byte == 1byte
        // 1024byte == 1kb

//        영상파일은 byte단위로 데이터를 보냄(영상이 끊기지 않게 하기 위해서)


        //정수도 리터럴
//        100; // 메모리에 저장 (정수 리터럴은 기본적으로 4바이트 할당)
//        int a; // 메모리에 4byte공간 할당하고 이름을 a라고 부여
//        a = 100; // 미리 저장된 100을 a에 복사

        long money = 21474836470L; //210억정도
        // 정수도 리터럴이기 때문에 숫자만 벌써 8바이트가 넘음
        // 그래서 L을 써서 8바이트 할당해줘야 함



        // 실수형
        // float(4바이트) - 소수점 7자리까지, double(8바이트) - 소수점 15자리까지 (소수점 더 늘리려면 객체사용)
        // 실수 리터럴은 기본 8바이트 할당
        // float 4바이트 : 다운캐스팅
        float f1 = 1.2345678F;
        System.out.println("f1 = " + f1);

        double d1 = 1.234455667788998877;
        System.out.println("d1 = " + d1);



        // 논리타입
        boolean b1 = true;
        boolean b2 = false;
//        boolean b3 = TRUE; // 안됨. 되는건 뭐다? 위에 boolean TRUE = true; 이런 코드 있으면 된다



        // 문자 타입 : 한글자
        char c1 = 'A'; //65
//        char c2 = 'AB'; // 안됨
        char c3 = '가';
//        char c4 = '가나' // 안됨
        System.out.println(c1 + 1); // 66
        System.out.println((char) (c1 + 1)); // B

        char c5 = 44032; // 가
        System.out.println("c5 = " + c5);
        
        char c6 = '힣';
        System.out.println("(int)c6 = " + (int)c6); //55203


        // String
//        기본타입이 아니라 객체다!
//        String은 char 배열이다!
//        객체는 함수를 가지고 있다 (왜? 객체는 속성과 기능!) str하고 점(.) 누르면 함수 많이 나옴!
        String str = "hello";

    }
}
