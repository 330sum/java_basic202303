package day09.abstract_;

public class Cat extends Pet{

    public Cat(String name, String kind, int age) {
        super(name, kind, age);
    }

    public void eat() {
        System.out.println("고양이가 사료를 먹어옹~");
    }
    public void takeNap() {
        System.out.println("고양이가 캣타워에서 낮잠을 자요~");
    }
}
