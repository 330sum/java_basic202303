package day04;

// 실행용 클래스
// 이 곳에는 설계를 하지 않고, main 메서드 작성
public class BDancerMain {

    public static void main(String[] args) {
        ADancer kim = new ADancer();
//        kim.dancerName = "김관종";
//        kim.crewName = "서커스크루";
//        ADancer park = new ADancer();
        ADancer park = new ADancer("스트릿댄스");
        ADancer jang = new ADancer("장동견", "목각댄스", CDanceLevel.PRO);

        DSinger song = new DSinger();


//        System.out.println(kim);
//        System.out.println(park);

        System.out.println(kim.introduce());
        System.out.println(park.introduce());
        System.out.println(jang.introduce());

        kim.dance();
        park.dance();
        jang.dance();


    }
}
