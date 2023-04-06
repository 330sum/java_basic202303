package day08.polymorphism_;

class A {}
class B extends A {}
class C extends A {}
class D extends B {}
class E extends C {}
public class Basic {

    // 자식객체는 상속관계에 있는 상위타입을 사용할 수 있다
    Object x1 = new A();
    A x2 = new B();
    A x3 = new C();
    A x4 = new D();
    A x5 = new E();

    void test() {
        int a = 10;
        double b = a; // 업캐스팅

        B x = new B();
        A z = x;
//        C y = (C) z; // 다운캐스팅 - 객체에서 한 형변화과 같은 원리임


    }



}
