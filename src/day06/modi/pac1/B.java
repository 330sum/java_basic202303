package day06.modi.pac1;

class B { // defalut 제한 : 클래스에는 public과 default만 사용가능
    // 아무도 접근 못하게 하려면 public 때면 됨

    public int x1;
    int x2;
    private int x3;




    void test() {
        A a = new A(); // public
        new A(10); // default
//        new A("zzz"); // private

        a.f1 = 1; // public
        a.f2 = 2; // default (동일한 패키지 안에서 접근 허용)
//        a.f3 = 3; // private

        a.m1(); // public
        a.m2(); // default
//        a.m3(); // private


    }
}
