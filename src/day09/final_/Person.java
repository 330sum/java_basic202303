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





// final은 최종본이라는 의미로 더이상 확장불가
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
    // 필드에서 초기화하면 안됨~
    static final String nation;// 국적
    final BagPack bagPack; //가방

    static {
        nation = "대한민국";
    }




    // 상수는 불변성, 유일성을 모두 만족해야 함
    // final로 불변성을 챙길 수 있지만, 유일성은 못 챙김
    // 주민번호 같은 경우, 한 사람에게 지정되면 주민번호가 불변성을 띄지만, 사람마다 다 다름 (유일성 없음)

    // 불변성(final)과 유일성(static)을 모두 만족시키려면 static final 사용하면 됨





    public Person(final String name, final String ssn, final String nation, BagPack bagPack) {

//        this.name = "박영희";
        // 이런식으로 내부에서 값을 바꾸는 걸 방지하도록 파라미터에 final 붙임
        // 파이널 걸려 있어서 원래 함수에서 주는 값대로만 사용하게 하도록 (안전함)

        this.name = name;
        this.ssn = ssn;
//        this.nation = nation;
        this.bagPack = bagPack;
    }
}
