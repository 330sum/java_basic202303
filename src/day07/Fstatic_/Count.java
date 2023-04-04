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
        // static메서드는 main에 Count.m1(); 이런식으로 호출하면 c1의 m1()인지, c2의 m1()인지, 어떤 객체의 m1()을 호출하는지 모름 (즉, this 정보를 알 수가 없어서 호출 불가능, 필드참조불가)
        System.out.println("x = " + x); // x는 static이여서 애초에 1개 뿐이여서 사용가능
//        System.out.println("y = " + this.y); // y가 100개면 누가 누구인지 모름

        // 그러나, static메서드에서 this를 확실히 알려주면 호출 가능
        // 방법1. static메서드 안에서 객체를 만들어서 인스턴스필드를 참조 시켜줌
        Count c3 = new Count();
        System.out.println("c3.y = " + c3.y);
        // 방법2. 매개변수로 객체를 받아서 인스턴스필드 참조 가능
        System.out.println("c4.y = " + c4.y);
        // 즉, 인스턴스필드를 static메서드 안에서 사용하고 싶다면, 누구의 y인지(어떤 객체의 인스턴스필드인지) 정확하게 알려줘야함

    }
    // 인스턴스 메서드
    public void m2() {
        System.out.println("인스턴스 메서드 호출!");
        System.out.println("x = " + x); // static x는 1개여서 그냥 1개 호출하면 됨
        System.out.println("y = " + this.y);
        // this를 알 수 밖에없음 왜? 이 m2()를 부르려면 정확히 불러야 호출가능 함.(Main에서 26번라인) 누구지 앎

    }


}
