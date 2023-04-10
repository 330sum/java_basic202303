package day11.io.Dobjstream;

import day11.io.Path;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class SaveSnack {

    private static List<Snack> snackList = new ArrayList<>();

    public static void main(String[] args) {

        snackList.add(new Snack("콘칲", 1970, 1500, Snack.Taste.GOOD));
        snackList.add(new Snack("사브레", 1980, 2500, Snack.Taste.BAD));
        snackList.add(new Snack("오징어집", 1985, 1800, Snack.Taste.SOSO));

//        saveTextFile();

        saveFile();
        // 했는데 오류 남. 왜? 직렬화가 안되어있다고 뜸 (NotSerializable)

        // 스트림을 타고 일렬로 세워서 보내야함.
        // 문자열, 배열은 일렬 데이터임
        // 그러나 객체는 일렬 데이터가 아님. (객체는 덩어리임) 그 때 필요한 것이 직렬화! (객체를 한줄로 줄 세우기)
        // 현재 List는 직렬화(Serializable) 되어있는데, (List는 인터페이스 Serializable를 상속받고 있음)
        // List안에 있는 Snack은 우리가 만든 거여서 직렬화 상속이 안되어 있음 -> Snack 직렬화 필요
        // 객체를 직렬화해야 바이트스트림을 통과할 수 있음.
        // 스트링은 왜 된거? String도 Serializable (직렬화) 되어있음
        // Snack은 직접 만든 객체여서 직렬화 안되어 있음! Snack 클래스에 가서 implements Serializable 붙여줘야함!


    }


    // 객체를 통채로 파일에 저장
    private static void saveFile() {

        try (FileOutputStream fos = new FileOutputStream(Path.ROOT_PATH + "/snack.sav")) {

            // 객체 저장을 위한 보조스트림
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(snackList);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }




    // 텍스트 파일로 리스트 데이터 저장
    private static void saveTextFile() {

        try (FileWriter fw = new FileWriter(Path.ROOT_PATH + "/snack.txt")) {

            for (Snack s : snackList) {
                fw.write(String.format("%s, %d, %d, %s \r\n",
                        s.getSnackName(), s.getYear(), s.getPrice(), s.getTaste()));
            }

            // \r\n 케리지 엔터 : 줄바꿈


        } catch (IOException e) {
            e.printStackTrace();
        }
    }




}
