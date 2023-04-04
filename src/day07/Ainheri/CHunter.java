package day07.Ainheri;

public class CHunter extends DPlayer {

    int concentration; // 헌터 고유 속성 : 집중력

    public CHunter(String nickName) {
        super(nickName);
        this.concentration = 100;
    }


    public void summonBeast () {

    }

    @Override
    public void showStatus() {
        super.showStatus();
        System.out.println("# concentration = " + this.concentration);
    }
}
