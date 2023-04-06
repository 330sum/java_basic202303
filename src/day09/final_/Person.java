package day09.final_;

class SmartBagPack extends BagPack {

    public SmartBagPack(int size, String brand) {
        super(size, brand);
    }

//    void putItem() {
//
//    }

    @Override
    void getItem() {
        super.getItem();
    }
}





// 아래 백팩클래스에 final붙이면 최종본이라는 의미로 더이상 확장하지마! (상속불가)
// 그래서 위에 스마트백팩에 백팩 상속하면 빨간줄나옴
 class BagPack {
    // 속성(필드)
    int size; // 가방크기 (1~10)
    String brand; // 브랜드

    // 생성자
    public BagPack(int size, String brand) {
        this.size = size;
        this.brand = brand;
    }

    // 기능(메서드)
    final void putItem() {
        System.out.println("가방에 물건을 넣습니다.");
    }
    void  getItem() {

    }


}
public class Person {
    String name; // 이름
    final String ssn; // 주민번호
    // final 붙이면 초기화해줘야 함!
    // 아래 생성자 보면 초기화 된 것!

//    static final String nation= "대한민국"; // 국적
    // 필드는 직접 초기화하지 않는다~
    static final String nation;// 국적
    final BagPack bagPack; //가방

    static {
        nation = "대한민국";
    }








    public Person(final String name, final String ssn, BagPack bagPack) {

//        this.name = "박영희";
        // 이런식으로 내부에서 값을 바꾸는 걸 방지하도록 파라미터에 final 붙임
        // 파이널 걸려 있어서 원래 함수에서 주는 값대로만 사용하게 하도록 (안전함)
        // 지역변수(파라미터)를 안에서 조정하지 못하도록 final을 붙임
        // 이론상 붙이는게 좋은데, 귀찮아서 잘 안붙임

        this.name = name;
        this.ssn = ssn;
//        this.nation = nation; // 54번라인에 static final로 상수가 되었으니까, 생성자에 초기화 시키면 안됨.
        this.bagPack = bagPack;
    }
}
