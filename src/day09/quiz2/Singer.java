package day09.quiz2;

public class Singer {

    private String name;
    private String song[];




    public Singer(String name, String[] song) {
        this.name = name;
        this.song = song;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getSong() {
        return song;
    }

    public void setSong(String[] song) {
        this.song = song;
    }
}
