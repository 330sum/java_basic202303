package day10.collection.song;

import day04.array.StringList;

import java.io.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ArtistRepository {

    // key: 가수의 이름, value: 가수 객체
    public static Map<String, Artist> artistList; // 가수 배열
    // 가수String(키)으로 아티스트(벨류)를 찾자
    // 키는 중복되면 안됨!!!! -> 그래서 키랑 벨류 정보를 적어두는 것이 좋음

    static {
        artistList = new HashMap<>();
    }

    // 자동 로드 기능
    public static void loadFile() {

        // 세이브파일이 존재한다면
        File f = new File("D:/music.m.sav");

        if (f.exists()) {
            // 로드해라~
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f))) {

                artistList = (Map<String, Artist>) ois.readObject();

            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }

        }


    }

    // 신규 가수를 첫 노래와 함께 배열에 추가하는 기능
    public void addNewArtist(String artistName, String songName) {
//        // 1. 가수 객체 생성 (생성자 1번 이용 -> 깡통임)
//        Artist artist = new Artist();
//        // 2. 생성된 가수 객체에 전달받은 이름 셋팅
//        artist.setName(artistName);
//        // 3. 생성된 가수 객체에 노래 목록 생성해서 셋팅
//        artist.setSongList(new StringList());
//        // 4. 해당 노래목록에 전달받은 노래 추가
//        // 노래목록 가져오기
////        artist.getSongList()
//        // 추가하기
//        artist.getSongList().push(songName);

        // 위의 것 한줄로 (1~4) 생성자 2번째꺼 이용
        Artist artist = new Artist(artistName, new HashSet<>());
        artist.getSongList().add(songName);

        // 5. 가수맵에 해당 가수 객체 추가
        artistList.put(artist.getName(), artist);

        // 6. 세이브 파일 저장
        autoSave();


    }

    // 가수명을 받아서 해당 가수가 등록된 가수인지 확인하는 기능
    public boolean isRegistered(String artistName) {
        return artistList.containsKey(artistName);
    }

    // 가수명을 통해 가수 객체 정보를 반환하는 기능
    public Artist findArtistByName(String artistName) {
        return artistList.get(artistName);
    }

    // 기존 가수 객체에 노래를 추가하는 기능
    public boolean addNewSong(String artistName, String songName) {
        // 1. 기존 가수정보를 불러온다.
        Artist foundArtist = findArtistByName(artistName);
        // 2. 그 가수 객체에서 노래목록을 빼온다(get)
        // 중복검사 필요없음.(add니까)
        boolean flag = foundArtist.getSongList().add(songName);
        if (flag) autoSave();
        return flag;

//        // 2. 그 가수 객체에서 노래목록을 빼온다(get)
//        StringList songList = foundArtist.getSongList();
//        // 3. 그 노래목록에 새노래를 추가한다.
//        // 없는경우에만 새로 추가해
//        if (!songList.includes(songName)) {
//            songList.push(songName);
//            // 추가되고 안되고 2개니까 boolean으로 변경
//            // true면 잘 추가됨
//            return true;
//        }
//        return false;
    }

    // 특정 가수의 노래목록을 반환하는 기능
    public Set<String> getSongList(String artistName) {
        return findArtistByName(artistName).getSongList();
    }

    // 등록된 가수의 수 반환
    public int count() {
        return artistList.size();
    }

    // 자동 세이브 기능
    public void autoSave() {

        // 폴더 없으면 만들어
        File f = new File("D:/music");
        if (!f.exists()) f.mkdir();

        // 세이브 파일 만들어
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:/music/m.sav"))) {

            // 파일안에 맵을 집어넣어라
            oos.writeObject(artistList);

            // 직렬화 되어있는지 확인 (해쉬맵은 직렬화 되있고, String 도 ehldjdlTdma)
            // Artist는 안되어 있으니까 해주기


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


}
