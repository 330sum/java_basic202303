package day11.io.rw;

import java.io.FileWriter;
import java.io.IOException;

// 문자 전용 출력
public class FileWriterExample {

    public static void main(String[] args) {

        try (FileWriter fw = new FileWriter("D:/exercise/메롱.txt")) {

            String s = "메롱메로메롱\n약오르짘ㅋㅋㅋㅋ케케케";
            fw.write(s);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}
