package day09.song_sm;

public class Controller {

    private static Singer[] singerList;


    /**
     * @return : 가수의 수
     */
//    public static int count() {
//        return singerList.length;
//    }


    /**
     * 가수를 추가하는 메서드
     *
     * @param singerName 추가할 가수
     * @param songName 추가할 음악
     */
    public void addNewSinger(String singerName, String songName) {

        Singer singer = new Singer(singerName, new String[]{songName});

        Singer[] temp = new Singer[singerList.length + 1];
        for (int i = 0; i < singerList.length; i++) {
            temp[i] = singerList[i];
        }
        temp[temp.length-1] = singer;
        singerList = temp;

    }





}
