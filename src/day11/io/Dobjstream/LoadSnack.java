package day11.io.Dobjstream;

import day11.io.Path;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class LoadSnack {
    private static List<Snack> snackList = new ArrayList<>();

    public static void main(String[] args) {

        loadFile();

        for (Snack s : snackList) {
            System.out.println(s);
        }
    }

    private static void loadFile() {

        try (FileInputStream fis = new FileInputStream(Path.ROOT_PATH + "/snack.sav")) {

            // 객체 불러올 보조스트림
            ObjectInputStream ois = new ObjectInputStream(fis);
            List<Snack> object = (List<Snack>) ois.readObject();
            snackList = object;
            // 리턴 받으면 Object로 떨어짐. 근데, 우리가 저장한 데이터는 List이기 때문에, List로 다운 캐스팅!
            // 세이브한 파일(ois.readObject())에서 읽은 객체를 snakList로 읽어주는 것

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


}
