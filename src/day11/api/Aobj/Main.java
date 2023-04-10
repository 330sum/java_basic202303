package day11.api.Aobj;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Pen p1 = new Pen(123, "빨강", 1000);
        p1.company = new Company("모나미", "서울");


        Pen p2 = new Pen(123, "빨강", 1000);

        Pen p3 = new Pen(new Company("모나미", "서울"),123, "빨강", 1000);


        System.out.println(p1.toString()); // 주소값 // toString 오버라이딩하기
        System.out.println(p2);

        System.out.println(p1 == p2); // false
        // 이 p1,p2,를 set에 넣으면 주소값이 다르기 때문에 다른 두개의 객체로 보고 저장할 수 있음.

        System.out.println(p1.equals(p2)); // true
        // Pen에서 equals오버라이딩 하면서 hashCode도 오버라이딩 함

        // =========================================
        Set<Pen> penSet = new HashSet<>();
        penSet.add(p1);
        penSet.add(p2);
        System.out.println(penSet.size());

        System.out.println(Integer.toHexString(p1.hashCode()));
        System.out.println(Integer.toHexString(p2.hashCode()));



    }


}
