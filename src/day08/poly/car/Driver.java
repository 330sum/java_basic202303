package day08.poly.car;

// 운전자 객체
public class Driver {

//    public void driveMustang(Mustang m) {
//        System.out.println("운전을 시작합니다");
//        m.accelerate();
//    }
//
//    public void dirveStinger (Stinger s) {
//        System.out.println("운전을 시작합니다");
//        s.accelerate();
//    }



    // 오버로딩: 메소드명 같은데, 매개변수가 다름

//    public void drive(Mustang m) {
//        System.out.println("운전을 시작합니다");
//        m.accelerate();
//    }
//
//    public void dirve(Stinger s) {
//        System.out.println("운전을 시작합니다");
//        s.accelerate();
//    }



// 오버로딩 하다가 손꾸락 빠지겠음.(메서드 drive에 매개변수로 싼타페, 그랜저, 벤츠... 위에처럼 계속 적어야함) 이때 필요한 것이 다형성!
    public void dirve(Car c) {
        System.out.println("운전을 시작합니다");
        c.accelerate();
    }



}
