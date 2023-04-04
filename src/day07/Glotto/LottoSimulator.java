package day07.Glotto;

import java.util.Arrays;
import java.util.Scanner;

public class LottoSimulator {

    static int[] selectNumbers;
    static int selectNumber;
    private static Scanner sc = new Scanner(System.in);

    static void run() {
        Lotto.information();
        selectNumbers = new int[6];
        System.out.println("구매번호를 6개 차례대로 입력하세요.");
        for (int i = 0; i < 6; i++) {
            selectNumber = Integer.parseInt(input(String.format("%d번째 번호 >> ", i + 1)));
            selectNumbers[i] = selectNumber;
//            System.out.println("selectNumber = " + selectNumber);
//            System.out.println(Arrays.toString(selectNumbers));
        }
        Arrays.sort(selectNumbers);
        buyLotto(selectNumbers);


    }


    static void buyLotto(int[] selectNumbers) {
//        Lotto.information();
        int count = 1;
        while (true) {
            if (Lotto.numbers == selectNumbers) {
                System.out.printf("\n%d장만에 1등에 당첨되었습니다. ㅊㅋㅊㅋ", count);
                break;
            } else {
                System.out.printf("\n%d장째 구매중... ㅠㅠ", count);
            }
            count++;
        }
    }


//    public static void check() {
//        for (int i = 0; i < 6; i++) {
//            if (selectNumbers[i] == selectNumber) {
//                System.out.println("# 중복번호입니다.");
//                return;
//            }
//        }

//        for (int number : selectNumbers) {
//            if (number == selectNumber) {
//                System.out.println("# 중복번호입니다.");
//            }
//        }
//
//    }


    public static String input(String message) {
        System.out.print(message);
        return sc.nextLine();
    }


}
