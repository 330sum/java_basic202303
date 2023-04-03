package day06.modi.pac2;

import day06.modi.pac1.A;

public class C {

    void test() {
        A a = new A(); // 패키지가 달라지니까 import 해야함 // public
//        new A(11); // default
//        new A("zzzz") // private


        a.f1 = 10; // public
//        a.f2 = 20; // default
//        a.f3 = 30; // private


        a.m1(); // public
//        a.m2(); // default
//        a.m3(); // private


        // 클래스B가 default 이기 때문에 접근 불가
//        B b = new B();
//        b.x1 = 1;

    }
}
