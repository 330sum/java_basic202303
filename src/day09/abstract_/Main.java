package day09.abstract_;

public class Main {

    public static void main(String[] args) {

        Pet[] pets = {
                new Dog("해피", "푸들", 2),
                new Dog("초코", "시츄", 3),
                new Dog("최강", "불독", 4),
                new Cat("꾸꾸까까", "러시안블루", 2),
                new GoldFish("금쪽이", "금붕어", 10)
                // 빨간 줄 이유? 생성자가 없어서
                // Pet에서 private 필드들은 접근 못함. 상속해도 private는 상속안됨
                // 그래서 Pet에서 생성자 만들고 초기화하면 외부Cat Dog에서 생성자 만들어서 super로 접근 가능

        };

        // 1. (부모클래스)pet 타입만 묶으려고 (큰 틀안에 묶으려고 - 다중모음구조)
        // 2. (부모클래스)pet의 껍데기 메서드
        // 3. 밥먹기eat은 pet의 필수 메서드임. 필수로 오버라이딩 하라고 알려줘야함
        // -> abstract 추상화 사용

//        new Pet("그냥동물", "그냥종", 1);
        // Pet은 구체화(인스턴스화) 시킬 수 없음


        GoldFish goldFish = new GoldFish("금쪽이", "금붕어", 10);



        for (Pet pet : pets) {
            pet.eat();
            pet.takeNap();
        }







    }
}
