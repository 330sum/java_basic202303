package day07.Ainheri;

public class BMage extends DPlayer {

    int mana; // 마력게이지 (마법사의 고유속성)

    public BMage(String nickName) {
        super(nickName);
        this.mana = 100;
    }


    // 썬더볼트
    public void thunderBolt() {

    }

    @Override
    public void showStatus() {
        super.showStatus();
        System.out.println("# mana = " + this.mana);
    }
}
