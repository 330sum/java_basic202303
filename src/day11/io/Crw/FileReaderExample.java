package day11.io.Crw;

import day05.member.Gender;
import day05.member.Member;
import day11.io.Path;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class FileReaderExample {

    public static void main(String[] args) {

        try(FileReader fr = new FileReader(Path.ROOT_PATH+"/member.txt")) {

//            int read = fr.read();
//            System.out.println((char)read);
            // 또 한글자씩 읽음... 그래서 우리가 보조스트림(Buffered, ObjectStream)을 사용함!
            // 메인스트림(is,os,r,w)


            // 버퍼스트림
            BufferedReader br = new BufferedReader(fr); // 생성자안에 메인스트림(fr)을 넣어줌
            String s = br.readLine();// 한줄한줄 버퍼에 쌓아서 줌. 한줄씩 받을 수 있음
            System.out.println("s = " + s);

            String[] split = s.split(",");
            System.out.println(Arrays.toString(split));

            Member member = new Member(Integer.parseInt(split[0]), split[1], split[2], split[3], Gender.valueOf(split[4]), Integer.parseInt(split[5]));
            System.out.println(member.inform());


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
