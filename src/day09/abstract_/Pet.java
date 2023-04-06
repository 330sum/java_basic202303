package day09.abstract_;

public abstract class Pet {

    // 추상화
    // 1. 객체생성 불가
    // 2. 메서드는 오버라이딩을 위한 껍데기 역할에 국한되도록 제한

    private String name;
    private String kind;
    private int age;

    public Pet(String name, String kind, int age) {
        this.name = name;
        this.kind = kind;
        this.age = age;
    }

    // 오버라이딩을 위한 억까 메서드
    // 클래스가 추상이 아니면 추상메서드 선언 불가
    // 추상메서드 블럭 못가짐 (구체적 내용 기술 불가)
    // 추상메서드는 필수 기능
    public abstract void takeNap();

    public abstract void eat();

    // 일반메서드 작성 가능 - 선택기능
    public void walk() {
        System.out.println("애완동물은 산책을 합니다.");
    }
    // 근데 이 메서드에 final 붙으면, 산책하려면 무조건 이 코스로만 해야한다는 의미임 ㅋㅋㅋ




}
