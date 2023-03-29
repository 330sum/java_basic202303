package day03;

public class GMethodBasic {

    // 함수 : 코드블록의 기능적 표현
    // ex ) add(10, 20)
    // 메서드 : 객체의 동작 표현
    // ex ) 샤프계산기.add(10, 20)
    //      카시오계산기.add(10, 20)

    // 자바는 모든 것을 객체로 표현하고, 함수 마저도 모두 메서드로 처리한다.
    // 자바의 메서드는 클래스 내부에서만 선언 가능
    // 다른 메서드 안에서 선언할 수 없음. (중첩함수 같은 것 없음)

    // 2개의 정수를 더해서 리턴하는 메서드
    // JS는 동적변화스크립트 언어여서 매개변수에 따로 안적어도 되지만, 자바는 적어야함
    static int add(int n1, int n2) {
        return n1 + n2;
    }

    // 리턴 값이 없는 함수
    static void makeLine() {
        System.out.println("========================");
    }

    // 여러값을 리턴하고 싶은 경우
    // 2개의 정수를 전달하면 덧셈, 뺄셈, 곱셈 결과 리턴 -> 배열에 묶어서 리턴! (리턴값은 언제나 하나!)
    static int[] operateAll(int number1, int n2) { // 선언부에서(type있는곳) shift+F6 동일한 변수 다 잡아와서 수정 가능
        int[] results = {
                number1 + n2,
                number1 - n2,
                number1 * n2
        };
        return results; // 빨리 퇴근하는 방법: results 위에서 ctrl + alt + n
    }


    static int[] operateAll2(int n1, int n2) {

        return new int[]{ // 빨리 퇴근하는 방법: int 위에서 ctrl + alt + v
                n1 + n2,
                n1 - n2,
                n1 * n2
        };
    }


    // n개의 정수를 전달받아(배열에 담아라~) 총합을 리턴하기
    static int addAll(int[] numbers) {
        int total = 0;
        for (int n : numbers) {
            total += n;
        }
        return total;
    }

    // ... 은 알아서 1차원 배열로 만들어 줌 (2차원배열은 꼭 대괄호 사용)
    static int addAll2(int... numbers) {
        int total = 0;
        for (int n : numbers) {
            total += n;
        }
        return total;
    }

    // 2개의 정수배열을 전달받아 들어있는 숫자의 개수가 더 많은 배열을 리턴하는 메서드
    static int[] compareNumbers (int[] arr1, int[] arr2) {
        if(arr1.length > arr2.length) {
            return arr1;
        }else {
            return arr2;
        }
    }
    // if 위에서 alt+Enter -> 삼항연사자로 바꾸기



    public static void main(String[] args) {

        int result = add(10, 20);
        System.out.println("result = " + result);

        // void는 변수에 담을수 없음. 리턴값이 없기 때문에. 그래서 단독호출만 가능
        makeLine();

        // ctrl + alt + v (addAll 위에서 변수만들기,
        // ctrl + alt + n
        int r1 = addAll(new int[]{10, 20, 30});
        System.out.println("r1 = " + r1);

    }

}
