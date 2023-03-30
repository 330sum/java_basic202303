package day04;

import java.util.Scanner;

public class GStringCompare {

    public static void main(String[] args) {

//        new ADancer();
        Scanner sc = new Scanner(System.in); //() 안에서 ctrl+p하면

//        String myName = new String(new char[]{'홍', '길', '동'})
//        String myName = new String("홍길동");
        String myName = "홍길동";

        String inputName = sc.nextLine();

        System.out.println("myName = " + myName);
        System.out.println("inputName = " + inputName);


        if (myName.equals(inputName)) {
            System.out.println("두 이름이 일치함");
        } else {
            System.out.println("두 이름이 일치하지 않음");
        }


    }
}
