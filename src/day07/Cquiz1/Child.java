package day07.Cquiz1;

public class Child extends Parent{

    public Child(String name) {
//        super();가 항상 숨어있음 // Parnet() Parnet의 기본생성자 호출
        super(name);
        this.name = name;
    }
}
