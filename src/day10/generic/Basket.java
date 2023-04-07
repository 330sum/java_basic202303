package day10.generic;

// 제네릭에서 <>은 관례상 한글자로 표시
// -> 왜? 현재는 아무의미없고, 나중에 정해질꺼니까. 복제타입이라고 인식할 수 있도록
public class Basket<F> {

    private F fruit;

    public F getFruit() {
        return fruit;
    }

    public void setFruit(F fruit) {
        this.fruit = fruit;
    }
}
