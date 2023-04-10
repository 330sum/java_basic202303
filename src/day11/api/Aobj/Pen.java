package day11.api.Aobj;

import java.util.Objects;
// lang패키지 안에 있는 것들은 import 안해도 됨

public class Pen extends Object {

    Company company; // 제조회사

    long serial; // 시리얼 번호
//    Long serial;
    String color; // 색상
    int price; // 가격
//    Integer price;

    public Pen(long serial, String color, int price) {
        this.serial = serial;
        this.color = color;
        this.price = price;
    }

    public Pen(Company company, long serial, String color, int price) {
        this.company = company;
        this.serial = serial;
        this.color = color;
        this.price = price;
    }

    // 객체의 필드데이터를 빠르게 확인해볼때
//    @Override
//    public String toString() {
//        return "이것은 펜이다";
//    }

    // 시리얼 번호가 같으면 같은 객체로 보고 싶다
    // 비교를 하려면 p1(Pen)과 p2(Obj)를 동등한 기준으로 맞추기. obj를 다운캐스팅해서!
    // equals를 오버라이딩하면 반드시 hashCode도 같이 오버라이딩 해야함!
    @Override
    public boolean equals(Pen this, Object obj) {

        if (obj instanceof Pen) { // obj 너 Pen 맞아? 맞으면
            Pen target = (Pen) obj; // Pen으로 다운캐스팅해
            return this.serial == target.serial
                    && this.color.equals(target.color);
        }
        return false;
    }

    @Override
    public String toString() {
        return "Pen[" +
                "company: " + company +
                ", serial: " + serial +
                ", color:' " + color + '\'' +
                ", price: " + price +
                ']';
    }

    @Override
    public int hashCode() {
        return Objects.hash(serial, color);
    }

}
