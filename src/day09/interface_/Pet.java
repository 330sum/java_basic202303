package day09.interface_;

public interface Pet {
    // 인터페이스는
    // 필드를 선언할수 없음
    // 생성자도 선언 불가

    // 메서드가 필수로 오버라이딩 되서 구현되야하는 경우에는
    // 인터페이스 (추상클래스보다 범용성이 넓음)

    // 필드 상속하는 것이 필요하면
    // 추상클래스

    // 두가지를 같이 사용하는 경우에는
    // 상속(extends)먼저 쓰고, 인터페이스(implements) 사용

    void eat();
//    public abstract void eat();
    // public abstract이 자동으로 추가 됨! (안적어줘도 됨)


}
