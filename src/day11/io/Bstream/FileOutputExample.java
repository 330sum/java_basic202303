package day11.io.Bstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutputExample {

    public static void main(String[] args) {

        String msg = "멍멍이는~~ 왈왈~\n 하하호호";


        // 데이터를 외부로 내보낼 때, 출력스트림 (OutputStream 추상클래스 -> 객체생성불가, 자식이용해서 객체생성)
//        OutputStream fos = null; // 지역변수는 값 꼭 초기화 해줄 것 (필드는 자동 초기화됨)
        // 객체교환성 생각해서 객체 선언부분에는 부모타입할지, 자식타입할지 정하기~
        try (OutputStream fos = new FileOutputStream("D:/exercise/dog.txt");) {


            fos.write(msg.getBytes());
            // write에 커서 올리면 오버로딩(byte나 int)되어있음
            // (String은 없음. 그래서 String을 Byte화 하는 메서드 사용 -> getByte()) 근데, 이거 안쓰니까 그냥 보기만해..
            System.out.println("파일 저장에 성공!");

        } catch (FileNotFoundException e) {
            System.out.println("파일 저장 처리에 실패했습니다.");
            e.getStackTrace();

        } catch (IOException e) {
            System.out.println("출력시스템에 문제가 생겼습니다");
            e.getStackTrace();
        }

        /*finally {
            try {
                if (fos != null) fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/

        // try-with-resource 문법
        // close를 알아서 해주는 문법 -> try () {
        // 소괄호안에 스트림 넣어주면 따로 close 안해도됨


    }

}
