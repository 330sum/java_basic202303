package day09.final_;

public class Main {

    public static void main(String[] args) {
        Person kim = new Person("김철수",
                "0001111-31231234",
//                "대한민국",
                new BagPack(5, "샘소나이트")
        );


        kim.name = "김출수";
//        kim.ssn = "021111-22222222";
//        kim.bagPack = new BagPack(10, "샤넬");
        // 주민번호랑 백팩에 final 걸려있어서 평생 못 바꿈


        // 그래서 final이 상수인가? 아님.
        // 상수는 불변성, 유일성을 모두 만족해야 함
        // final로 불변성을 챙길 수 있지만, 유일성은 못 챙김
        // 주민번호 같은 경우, 한 사람에게 지정되면 주민번호가 불변성을 띄지만, 사람마다 다 다름 (유일성 없음)

        // 불변성(final)과 유일성(static)을 모두 만족시키려면 static final 사용하면 됨

        //상수가 값이 중요하지 않고, 이름만 중요하면 enum 사용!


    }


}
