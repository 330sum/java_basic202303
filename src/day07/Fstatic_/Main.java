package day07.Fstatic_;

import static day07.Fstatic_.Count.m1;
import static day07.Fstatic_.Count.x;
import static day07.util.Utility.input;
import static day07.util.Utility.makeLine;
import static java.lang.Math.random;
import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {

//        System.out.println(c2.y);
        out.println(x); // 전역변수처럼 생성가능 // class당 1개, 전역변수여서, 객체 생성 없이 바로 다른 곳에서 사용가능
        out.println(random());
        // Math는 첫글자 보니까 클래스인데, ctrl 들어가서 보면 private
        // alt + Enter 쳐서 import static으로 코드 깔끔하게 만들기

        m1(new Count()); // 객체생성 전에 메서드 호출 가능

        Count c1 = new Count();
        Count c2 = new Count();

        c2.m2(); // 무조건 객체 생성 후 호출가능

        out.printf("c1 = x: %d, y: %d\n", c1.x, c1.y);
        out.printf("c2 = x: %d, y: %d\n", c2.x, c2.y);
        out.println("================================");

//        c1.x = 10;
        x = 10;
        c2.y = 20;

//        c2.x++;
        x++;

        out.printf("c1 = x: %d, y: %d\n", c1.x, c1.y);
        out.printf("c2 = x: %d, y: %d\n", c2.x, c2.y);


        Calculator cal1 = new Calculator(); // kim
        Calculator cal2 = new Calculator(); // park

        cal1.color = "빨강";
        cal2.color = "초록";

        out.println("cal1 = " + cal1.color);
        Calculator sharp = new Calculator();
        Calculator.calcAreaCircle(5);

        sharp.paint("노랑");



//        Utility.makeLine();
        makeLine();
        makeLine();
        input("하하호호: ");



    }
}
