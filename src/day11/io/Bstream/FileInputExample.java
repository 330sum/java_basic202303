package day11.io.Bstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputExample {

    public static void main(String[] args) {

        String path = "D:\\java_basic202303\\src\\day01\\Scope.java";
        try (FileInputStream fis = new FileInputStream(path)) {

//            int data = fis.read();
//            System.out.println("data = " + (char)data);
//
//            data = fis.read();
//            System.out.println("data = " + (char)data);

            int data = 0;
            while (data != -1) {
                data = fis.read();
                System.out.write(data); // 아스키를 문자로 추력
            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
