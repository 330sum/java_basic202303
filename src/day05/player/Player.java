package day05.player;

public class Player {

    // 필드
    String nickName; // 캐릭터닉네임
    int level; //레벨
    int hp; // 체력

    // 생성자
    // alt + insert -> alt + n
    public Player() {
        this("이름없음"); // this(나)의 또 다른 생성자를 불러줘 (this는 생성자 본문의 맨 첫줄에 적어야함)
        System.out.println("1번 생성자(기본생성자) 호출");
//        this.nickName = "이름없음";
//        this.level = 1;
//        this.hp = 50;
    }


//    Player(String inputName) {
//        nickName = inputName;
//        level = 1;
//        hp = 50;
//    }
    public Player(String nickName) {
        this(nickName, 1,50);
        System.out.println("2번 생성자 호출");
//        this.nickName = nickName;
//        this.level = 1;
//        this.hp = 50;
    }
    // 필드라는 것을 확인시켜주기 위해서 this를 붙이기!



//  alt + insert -> ctrl + a
    public Player(String nickName, int level, int hp) {
        System.out.println("3번 생성자 호출");
        this.nickName = nickName;
        this.level = level;
        this.hp = hp;
    }



    // 기능 - 메서드
    void levelUp(Player this) {

    }

    void attack(Player this, Player target) {

        if (this == target) return;

        System.out.println("target의 주소 : " + target);
        System.out.println("this의 주소 : " + this);

        // 맞은 녀석의 체력을 10~15 랜덤으로 감소 시킬거임
        int damage = (int) (Math.random() * 6 + 10);
        target.hp -= damage;

        // 전투로그를 출력할거임
        // "가해자가 피해자를 공격해서 xxx의 피해를 입힘"
        System.out.printf("%s님이 %s님을 공격해서 %d의 피해를 입힘!\n", this.nickName, target.nickName, damage);


    }


}


