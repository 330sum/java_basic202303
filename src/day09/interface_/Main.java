package day09.interface_;

public class Main {

    public static void main(String[] args) {
        BullDog bullDog = new BullDog();

        bullDog.hunt();
        bullDog.violent();

        Duck duck = new Duck();
        duck.eat();

        // 인터페이스는 상속에서 사용하던 다형성을 구현할 수 있음
        // 부모클래스로 묶을 수 있음
        Pet[] pets = {
          bullDog, duck, new Rabbit()
        };

        //
        for (Pet pet : pets) {
            pet.eat();
        }

        BadAnimal shark = new Shark();
        shark.hunt();


    }
}
