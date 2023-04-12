package day12.lambda.day12.inner;

public class Main {

    // 내부 클래스 (inner class)
    private static class SubCalculator implements Calculator {

        @Override
        public int operate(int n1, int n2) {
            return n1 - n2;
        }
    }



    public static void main(String[] args) {

        // 덧셈 계산을 하는 계산기를 만들어서 쓰고 싶다.
        Calculator addCal = new AddCalculator();
        System.out.println(addCal.operate(30, 50));


        // 뺄셈 계산을 하는 계산기가 필요 (내부 클래스)
        SubCalculator sub1 = new SubCalculator();
        SubCalculator sub2 = new SubCalculator();
        SubCalculator sub3 = new SubCalculator();
        System.out.println(sub1.operate(100, 20));


        // 곱셈 계산을 하는 계산기가 필요 (익명 클래스) -> alt+Enter 람다식으로 바꾸기 가능
        // 내가 이해한 것 -> 익명클래스는 객체를 생성 없음. 객체 선언 = 인터페이스() {구현};
        Calculator multiCal = new Calculator() {

            // 필드 선언 가능
            private String name;

            // 익명클래스는 이름이 없기 때문에, 생성자를 만들어도 부를 수 없음
            @Override
            public int operate(int n1, int n2) {
                return n1 * n2;
            }
        };

        System.out.println(multiCal.operate(5,7));


        // 나눗셈을 하는 계산기 (람다) - 함수가 아니고 클래스의 객체임
        // 람다식은 인터페이스의 추상메서드가 딱 1개일때만 사용 가능
        Calculator divCal = (n1, n2) -> n1 / n2;

        System.out.println(divCal.operate(50, 10));


        // ============================================================================

        // 1회용 강아지 (애견카페) - dog클래스 만들기 귀찮아서 익명클래스로 구현함
        // 인터페이스 Pet에 메서드가 2개이기 때문에 람다식으로 구현 불가
        Pet dog = new Pet() {

            @Override
            public void eat() {
                System.out.println("강아지는 개사료를 먹어요");
            }

            @Override
            public void play() {
                System.out.println("강아지는 마당에서 놀아요");
            }
        };


    }

}
