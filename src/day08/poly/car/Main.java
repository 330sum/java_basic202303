package day08.poly.car;

import static day07.util.Utility.makeLine;

public class Main {

    public static void main(String[] args) {

        CarShop shop = new CarShop();
        shop.runTest();

//        Utility.makeLine();
        makeLine();

        Driver park = new Driver();

//        park.driveMustang(new Mustang());
//        park.driveMustang(new Tucson());
//        park.dirveStinger(new Stinger());

//        park.drive(new Mustang());
//        park.dirve(new Stinger());
////        park.drive(new Tucson());

        park.dirve(new Tucson());

        makeLine();

        Mustang mustang = new Mustang();
        mustang.accelerate();
        mustang.powerSound();

        Car stinger = new Stinger(); // 업캐스팅은 싸인 필요없음. 자동으로 됨
        stinger.accelerate();

        makeLine();


        Car car = (Mustang) shop.exportCar(6000);
        // 다운캐스팅할 때는 싸인 꼭 필요! -> 내리는 이유? 원본의 고유기능 사용하기 위해서
        System.out.println("car = " + car);
//        car.powerSound();



//        Car car2 = (Stinger) shop.exportCar(6000);
        // 현재는 아무런 문제 없는데 (런타임에러), 실행하면 문제생김
        // 다운캐스팅 할때, 타입 잘 주의해서 써야함
        // 그 타입을 검사하는 방법이 instanceof

        Car car3 = shop.exportCar(6000);
        System.out.println(car instanceof Stinger);  // car가 Stinger의 객체냐? false
        System.out.println(car instanceof Tucson);   // car가 Tucson 객체냐? false
        System.out.println(car instanceof Mustang);  // car가 Mustang의 객체냐? false



        // 오버라이딩된 메서드는 업캐스팅하면 그냥 사용가능
        // 근데, 클래스 안의 고유기능은 업캐스팅됐을 때 사용 불가
        // 타입이 올라가면 고유기능 호출 불가하기 때문에 다운캐스팅 해야함 (싸인필요)







    }
}
