package day09.quiz2;

public class SingerRepository {
    Singer[] singerList;


    public Singer[] getSingerList() {
        return singerList;
    }

    public void setSingerList(Singer[] singerList) {
        this.singerList = singerList;
    }

    public SingerRepository() {
        this.singerList = new Singer[0];
//        singerList[0] =  new Singer("동방신기", new String[]{"미로틱", "라이징썬"});
//        singerList[1] =  new Singer("뉴진스", new String[]{"디토", "하입보이"});
//        singerList[2] =  new Singer("아이브", new String[]{"키치키치", "러브다이브"});

    }

}
