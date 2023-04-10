package day11.io.rw;

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


            // 버퍼스트림
            BufferedReader br = new BufferedReader(fr);
            String s = br.readLine();// 한줄한줄 버퍼에 쌓으면서 읽음
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
