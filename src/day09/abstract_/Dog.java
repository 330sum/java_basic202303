package day09.abstract_;

public class Dog extends Pet{

    // 추상클래스 상속 받으면
    // ctrl + o 해서
    // 추상클래스의 필드들 생성자로 생성하고
    // 필수 오버라이딩 메서드 추가
    public Dog(String name, String kind, int age) {
        super(name, kind, age);
    }

    public void eat() {
        System.out.println("강아지가 사료를 먹어요~");
    }
    public void takeNap() {
        System.out.println("강아지는 마당에서 낮잠을 자요~");
    }

    @Override
    public void walk() {
        super.walk();
        System.out.println("강아지는 산책하는 걸 좋아해용");
    }
}
