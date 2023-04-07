package day10.exception;

public class FinallyExample {

    public static void main(String[] args) {

        String[] pets = {"비둘기", "거북이", "앵무새"};

        for (int i = 0; i < 4; i++) { // 런타임오류는 빨간줄도 안나옴! 알고있어야함 -> 예외처리
            try {
                System.out.println(pets[i] + " 키울래요~");
            } catch (Exception e) {
                System.out.println("애완동물 정보가 없습니다.");
            } finally {
                // 예외와 상관없이 항상 실행할 코드
                System.out.println("조아용~");

                // 보통 finally에 작성하는 건?
                // 데이터베이스 접속 후, 다음 접속을 위해 (접속실패 -> 종료 -> 다음접속) (접속성공 -> 종료 -> 다음접속)
                // 데이터베이스 연결을 종료시켜야 할 경우,
                // 메모리 누수방지코드, 메모리 연결해지 코드


            }
        }

        System.out.println("프로그램 정상 종료!");


    }


}
