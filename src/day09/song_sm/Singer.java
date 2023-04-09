package day09.song_sm;

public class Singer {
    private String name;
    private String[] songList;

    public Singer() {
    }


    public Singer(String name, String[] songList) {
        this.name = name;
        this.songList = songList;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getSongList() {
        return songList;
    }

    public void setSongList(String[] songList) {
        this.songList = songList;
    }


    public String info() {
        return String.format("%s 가수는 ...%s노래",this.name, this.songList);
    }


}
