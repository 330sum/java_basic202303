package day09.musicManagement_teacher;

import day04.array.StringList;

public class Test {

    public static void main(String[] args) {

        // 가수 객체 생성
//        Artist artist1 = new Artist();


        Artist artist2 = new Artist("동방신기",new StringList("hug"));
        artist2.info();


        // 객체 생성 이후에 노래 추가 하고 싶어
        // 가수노래 목록 접근해서 노래 추가
        StringList songList = artist2.getSongList(); // 노래목록 뺴오기
        songList.push("미로틱"); // 추가하기

        artist2.info();





        ArtistRepository ar = new ArtistRepository();
        ar.addNewArtist("아이유", "분홍신");
        ar.addNewArtist("동방신기", "롱넘버");

        ArtistRepository.artistList[0].info();


        Artist foundArtist = ar.findArtistByName("아이유");
        System.out.println(foundArtist);



    }

}
