package day08.poly.overloading;

/*
   오버라이딩: 부모클래스의 메서드를 자식이 재정의하는 것
        - 조건: 부모의 메서드 리턴타입과 시그니처(메서드명, 파라미터)를 똑같이 사용 (파라미터 이름은 상관없지만, 타입은 같아야함)
               접근 제한자는 같거나 더 넓어야 함 (more public)
   오버로딩: 하나의 클래스 안에서 같은 이름의 메서드를 여러개 선언하는것
        - 조건: 반드시 매개변수의 타입, 순서, 개수가 달라야한다.
               리턴타입과 접근제한자는 관련이 없다.
*/
public class Over {

    // 데이터를 전달하면 데이터의 타입을 알려주는 기능

    // alertType(String)
    void  alertType(String s) {
        System.out.println("전달된 데이터는 문자열입니다.");
    }

    // alertType(int)
    void alertType(int x) {
        System.out.println("전달된 데이터는 정수입니다.");
    }

    // alertType(int, int)
    void alertType(int x, int y) {}
    // 리턴타입 상관없음
//    int alertType(int x, int y) {
//        return x + y;
//    }

    // alertType(int, String)
    void alertType(int x, String y) {}

    // alertType(String, int)
    void alertType(String x, int y) {}


    void test() {
        alertType("zzz", 10);
        System.out.println(); // 오버로딩의 대표적 예시
    }






}
