package day04;

// * 은 클래스 자리에만 사용 가능
// 패키지는 소문자 작성
// 클래스는 대문자 첫글자

public class HPackagePractice {

    public static void main(String[] args) {
        new juice.Apple();
        new fruit.Apple();

        new fruit.Banana();
        new fruit.Grape();
        new day04.ADancer();
    }
}
