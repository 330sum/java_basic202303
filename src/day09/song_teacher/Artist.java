package day09.song_teacher;

import day04.array.StringList;

public class Artist {
    private String name;
    public StringList songList;

    public Artist() {

    }

    public Artist(String name, StringList songList) {
        this.name = name;
        this.songList = songList;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StringList getSongList() {
        return songList;
    }

    public void setSongList(StringList songList) {
        this.songList = songList;
    }


    // 가수의 정보를 출력하는 기능
    public void info() {
        System.out.println("가수명 : " + this.name);
        System.out.println("노래목록 : " + this.songList);
    }

}
