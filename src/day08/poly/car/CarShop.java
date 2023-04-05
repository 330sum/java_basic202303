package day08.poly.car;

// 자동차 판매 대리점
public class CarShop {

//    Mustang[] mustangs;
//    Stinger[] stingers;
//    Tucson[] tucsons;

    Car[] cars;


    // 대리점에 차를 입고하는 기능
    public void importCar() {

//        mustangs = new Mustang[] {
//                new Mustang(),
//                new Mustang(),
//                new Mustang(),
////                new Stinger()
//                // 배열은 동종모음구조이기 때문에 넣을 수 없음
//        };


//        Mustang mustang = new Mustang();
//        Stinger stinger = new Stinger();
//        Tucson tucson = new Tucson();

        Car m = new Mustang();
        Car s = new Stinger();
        Car t = new Tucson();


        // 다형성을 이용하면 배열을 이종모음구조로 바꿀 수 있음
        cars = new Car[]{
                new Mustang(),
                new Mustang(),
                new Stinger(),
                new Tucson(),
        };

        // 문자열과 정수와 논리를 배열에 담을 수 있는가? -> Object 배열을 만들면 다 집어 넣을 수 있음
        Object[] oArr = {
                50, 30, 3.3, "zzz", false, new Mustang()
        };
        // 그러나 위처럼 사용하며 타입스티브가 안좋음. -> 무슨말? 책가방안에 책말고 김치 넣을래?
    }


    // 주행테스트 기능
    public void runTest() {
        importCar(); // 차 입고
        for (Car car : cars) {
            car.accelerate(); // 오버라이딩

        }
    }



    // 차를 고객에게 인도하는 기능
    // 리턴타입에 적용되는 다형성
    public Car exportCar(int money) {
        if (money == 6000) {
            return new Mustang();
        } else if (money == 5000) {
            return new Stinger();
        } else if (money == 3000) {
            return new Tucson();
        } else {
            return null;
        }
    }


}
