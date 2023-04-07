package day10.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

// throws
// - 꺅 벌레다! 네가 잡아!라고 던지는 것
// - 사용하는 쪽에서(호출부에서) 잡아라고 하는 것
// - 던져놓고 한 곳에서 예외처리 다함
public class ThrowsExample {

    // 정수를 입력박아서 리턴하는 메서드
    public int inputNumber() throws InputMismatchException, NullPointerException {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        return num;
    }

    // 문자열을 정수로 변환하는 기능
    public int convert(String s) throws NumberFormatException {
        int n = Integer.parseInt(s);
        return n;
    }

    public void convertAndInput() {
        try {
            int n = inputNumber();
            int m = convert("100");
        } catch (InputMismatchException e) {
            System.out.println("정수입력 잘해라");
        } catch (NumberFormatException e) {
            System.out.println("숫자변환 못함 GG");
        }
    }




}
