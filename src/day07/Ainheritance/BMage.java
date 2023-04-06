package day07.Ainheritance;

public class BMage extends DPlayer {

    int mana; // 마력게이지 (마법사의 고유속성)

    public BMage(String nickName) {
        super(nickName);
        this.mana = 100;
    }


    // 썬더볼트
    // 챙겨1 : 스프레드 문법 ... 으로 배열 받을 수 있음
    // 챙겨2 : 매개변수로는 BMerge this 가 숨겨져 있음 -> 그래서 BMage.super.nickName = this.nickName 인거지!
    // 챙겨3 : printf 사용
//    public void thunderBolt(DPlayer... targets) {
//        System.out.println("# " + BMage.super.nickName + "님 썬더볼트 시전!!!");
//
//        for (DPlayer target : targets) {
//            int damage = (int) (Math.random() * 6 + 10);
//            target.hp -= damage;
//            System.out.printf("%s님이 %s의 피해를 입었습니다. (남은 체력 : %d)\n", target.nickName, damage, hp - damage);
//        }
//    }


    // 썬더볼트
    public void thunderBolt(DPlayer... targets) {
        System.out.printf("# %s님 썬더볼트 시전!!!!\n", this.nickName);
        System.out.println("======================================");


        for (DPlayer p : targets) {
            //맞은 사람이 혹시 나??
            if (p == this) continue;

            //10 ~ 15의 랜덤 피해
            int damage = (int) (Math.random() * 6 + 10);
            //실제 체력에서 차감
            p.hp -= damage;
//            p.setHp(p.getHp() - damage);

            System.out.printf("%s님이 %d의 피해를 입었습니다.(남은 체력: %d)\n"
                    , p.nickName, damage, p.hp);
        }
    }




    @Override
    public void showStatus() {
        super.showStatus();
        System.out.println("# mana = " + this.mana);
    }
}
