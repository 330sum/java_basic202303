package day06.encap;

public class BMain {

    public static void main(String[] args) {
        ACar myCar = new ACar("그랜저");

        // 필드에 직접적으로 접근하는 건 안됨. 그래서 필드에 다 private 붙이기
//        myCar.model = "페라리488";
//        myCar.speed = -10000;
//        myCar.mode = 'A';



//        myCar.setSpeed(500);
        myCar.setSpeed(150);
        System.out.println(myCar.getSpeed());

        myCar.setMode('A');
        System.out.println(myCar.getMode()); // P



//        myCar.pressButton();
//        myCar.inject();
//        myCar.putOil();
//        myCar.moveCylinder();

        myCar.pressButton();




    }
}
