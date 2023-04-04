package day07.Ainheri;

// 서브 클래스 (자식 클래스)
public class AWarrior extends DPlayer { // is a 관계

    int rage; // 분노게이지 (전사 고유속성(필드))

    public AWarrior() {
        this("이름없음");
    }

    public AWarrior(String nickName) {
        super(nickName);
//        super.nickName = nickName;
//        super.level = 1;
//        super.hp = 50;
        this.rage = 20;
    }

    // 파워슬래시 (전사 고유기능(메서드))
    public void powerSlash() {
        System.out.println("파워슬래시를 시전합니다");
    }

    // 오버라이딩
    // 조건: 부모의 시그니처(리턴타입, 메서드명, 파라미터)를 똑같이 사용
    //       파라미터 이름은 상관없지만, 타입은 같아야함
    //       접근제한자는 무조건 부모보다 public 해야 함.
    // (부모가 default면 자식은 default, protected, public 중 선택 / 부모가 public이면 자식은 무조건 public)
    // 시그니처를 잘 썼는지 검사해주는 기능 @Override
    @Override // 오버라이딩 검사
    public void showStatus() {
        super.showStatus();
        System.out.println("# rage = " + this.rage);
    }


}
