package day08.polymorphism_.car;

public class Mustang extends Car {

    public void accelerate() {
        System.out.println("머스탱이 달립니다.");
    }

    // 머스탱만의 고유기능
    public void powerSound() {
        System.out.println("폭풍같은 배기소리가 납니다. 퐈바바바방");
    }

}
