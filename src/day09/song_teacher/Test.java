package day09.song_teacher;

import day04.array.StringList;

public class  Test {

    public static void main(String[] args) {

        // 가수 객체 생성
        Artist artist1 = new Artist(); // 깡통객체 생성
        artist1.setName("송민호"); // 이름 넣고
        artist1.setSongList(new StringList()); // StringList를 줘야하니까 new해서 객체 생성하는데, 빈배열임

        // 노래를 넣어주려면, 그 빈배열리스트를 꺼내와야함(get), 그리고 push로 넣어줌
        StringList songList = artist1.getSongList();
        songList.push("아낙네");

        System.out.println(artist1.getName());
        System.out.println(artist1.getSongList());


        // 위 과정을 한방에 하려면
        Artist artist2 = new Artist("동방신기",new StringList("hug","rising sun"));


        // 내가 넣은 것들 볼 수 있는 방법은? 설계도가 다 데이터 가지고 있으니까, 설계도에서 메서드 만들기
        artist2.info();


        // 객체 생성 이후에 노래 추가 하고 싶어
        // 가수노래 목록 접근해서 노래 추가
        StringList songList2 = artist2.getSongList(); // 노래목록 가져오기(get)
        songList2.push("mirotic"); // 추가하기
        artist2.info();





        ArtistRepository ar = new ArtistRepository();
        ar.addNewArtist("아이유", "분홍신");
        ar.addNewArtist("동방신기", "롱넘버");

        ArtistRepository.artistList[0].info();
        ArtistRepository.artistList[1].info();


        Artist foundArtist = ar.findArtistByName("아이유");
        System.out.println(foundArtist);



    }

}
