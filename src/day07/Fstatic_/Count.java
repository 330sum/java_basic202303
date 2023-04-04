package day07.Fstatic_;

public class Count {

    // 제한자(modifier)
    // 접근 제한자 (Access) : public, protected, default, private
    // 사용 제한자 (Usage) : static, final, abstract
    public static int x; // 정적 필드 : 모든 객체가 공유 (전역변수 저장영역에 저장됨 - 메모리 구조에서 따로 관리 됨)
    public int y;       // 인스턴스 필드 : 객체별로 관리

    // Count객체를 100개 만들어도
    // x개수는 1개, y개수는 100개

    // static은 객체와 무관한다
    // class당 1개, 메모리에 1개만 존재. 전역변수여서, 객체 생성 없이 바로 다른 곳에서 사용가능



    // 정적 메서드
    public static void m1(Count c4) {
        System.out.println("static메서드 호출!");
        // 필드참조 (static메서드 안에서는 static 필드만 참조가능)
        // static은 this 정보를 알 수 가 없어서 호출 불가능
        System.out.println("x = " + x); // x는 static이여서 애초에 1개 뿐이여서 사용가능
//        System.out.println("y = " + this.y); // y가 100개면 누가 누구인지 모름

        Count c3 = new Count();
        System.out.println("c3.y = " + c3.y);
        System.out.println("c4.y = " + c4.y);
        // 누구의 y인지 정확하게 알려줘야함

    }
    // 인스턴스 메서드
    public void m2() {
        System.out.println("인스턴스 메서드 호출!");
        System.out.println("x = " + x);
        System.out.println("y = " + this.y);
        // this를 알 수 밖에없음 왜? 이 m2를 부르려면 정확히 불러야 호출가능 함누구지 앎

    }


}
