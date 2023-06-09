package day08.polymorphism_.book;

public class CookBook extends Book {

    private boolean coupon; // 요리학원 쿠폰유무

    public CookBook() {
    }

    public CookBook(String title, String author, String publisher, boolean coupon) {
        super(title, author, publisher);
        this.coupon = coupon;
    }

    // boolean 타입의 getter명은 is필드명(카멜케이스)로 사용하는 것이 관례
    public boolean isCoupon() {
        return coupon;
    }

    public void setCoupon(boolean coupon) {
        this.coupon = coupon;
    }

    @Override
    public String info() {
        return String.format("#분류: 요리책, %s, 쿠폰유무: %s", super.info(), this.coupon ? "있음" : "없음");
    }
}
