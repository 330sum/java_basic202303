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

    @Override
    public String toString() {
        return "Pen[" +
                "company: " + company +
                ", serial: " + serial +
                ", color:' " + color + '\'' +
                ", price: " + price +
                ']';
    }

    // 시리얼 번호가 같으면 같은 객체로 보고 싶다
    // equals를 오버라이딩하면 반드시 hashCode도 같이 오버라이딩 해야함!
    @Override
    public boolean equals(Pen this, Object obj) {

        if (obj instanceof Pen) {
            Pen target = (Pen) obj;
            return this.serial == target.serial
                    && this.color.equals(target.color);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(serial, color);
    }
}
