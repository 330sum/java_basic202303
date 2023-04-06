package day09.final_;

public class Main {

    public static void main(String[] args) {
        Person kim = new Person("김철수",
                "0001111-31231234",
                "대한민국",
                new BagPack(5, "샘소나이트")
        );


        kim.name = "김출수";
//        kim.ssn = "021111-22222222";
//        kim.bagPack = new BagPack(10, "샤넬");
        // 주민번호랑 백팩에 final 걸려있어서 평생 못 바꿈





    }


}
