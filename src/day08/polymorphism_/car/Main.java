package day08.polymorphism_.car;

import static day07.util.Utility.makeLine;

public class Main {

    public static void main(String[] args) {

        CarShop shop = new CarShop();
        shop.runTest();
//        new CarShop().runTest();

//        Utility.makeLine();
        makeLine();

        Driver park = new Driver();

//        park.driveMustang(new Mustang());
//        park.driveMustang(new Tucson());
//        park.driveStinger(new Stinger());

//        park.drive(new Mustang());
//        park.drive(new Stinger());
////        park.drive(new Tucson());

        park.dirve(new Tucson());

        makeLine();

        Mustang mustang = new Mustang();
//        Car mustang = new Mustang(); // Car로 업캐스팅하면, 머스탱의 고유기능(메서드) 파워사운드를 사용 못함 -> 다운캐스팅 필요 (42번라인)
        park.dirve(mustang);
        mustang.accelerate();
        mustang.powerSound();

        Car stinger = new Stinger(); // 업캐스팅은 싸인 필요없음. 자동으로 됨
        stinger.accelerate();

        makeLine();


        // CarShop에서 6000주고 구매하면 Car타입의 머스탱이 떨어짐
//        Car car = shop.exportCar(6000);
        Mustang car = (Mustang) shop.exportCar(6000);
        // 다운캐스팅할 때는 싸인 꼭 필요! -> 내리는 이유? 원본의 고유기능 사용하기 위해서
        System.out.println("car = " + car);
        car.powerSound(); // Car타입의 머스탱을 Mustang으로 다운캐스팅 후(44번라인), 파워사운드 사용가능
        // 좀 더 와닿는 설명
        // 고등학생 교복(고딩타입) 입고, 학생할인 받았는데(고딩타입의 고유메서드)
        // 내가 성인인척(성인타입)하면, 학생할인 못받음 (고딩타입의 고유메서드 못씀)



//        Stinger car2 = (Stinger) shop.exportCar(6000);
        // 6000주면 머스탱 떨어지는데 스팅어로 다운캐스팅한거임
        // 현재는 아무런 문제 없는데 (런타임에러), 실행하면 문제생김
        // 다운캐스팅 할때, 타입 주의해서 써야함 (부모타입으로 오면, 자식 중 무슨타입인지 잘 모르기 때문에)
        // 그 타입을 검사하는 방법이 instanceof

        Car car3 = shop.exportCar(6000);
        System.out.println(car3 instanceof Stinger);  // car3가 Stinger의 객체냐? false
        System.out.println(car3 instanceof Tucson);   // car3가 Tucson 객체냐? false
        System.out.println(car3 instanceof Mustang);  // car3가 Mustang의 객체냐? true



        // 오버라이딩된 메서드는 업캐스팅하면 그냥 사용가능
        // 근데, 클래스 안의 고유기능은 업캐스팅됐을 때 사용 불가
        // 타입이 올라가면 고유기능 호출 불가하기 때문에 다운캐스팅 해야함 (싸인필요)







    }
}
