package day04;

// 댄서의 설계도
// 설계도에는 main을 만들지 않는다
// 설계도는 클래스 내부에 속성과 기능을 설계한다
// 속성(필드) - 변수만 설정 (값을 명시하면 안됨) 여기서 필드라고 부르기 (자바에서는 필드랑 변수는 다름)
// 기능(메서드) : static을 붙이지 말기!
// 생성자 : 필드와 메서드 사이에 작성
public class ADancer {
    // 속성 (필드)
    String dancerName; // 댄서이름
    String crewName; // 크루이름
    String genre; // 춤 장르
    CDanceLevel level; // 춤수준(0: 초보자, 1: 중수, 2: 고수)


    // 생성자: 스카우터, 개발자(공돌이), 기술자
    // 생성자도 함수개념, 리턴타입이 주소값타입으로 고정
    // 리턴값은 생성한 객체의 주소값을 리턴
    // 객체 생성시 필요한 데이터를 셋팅
    ADancer() {
        dancerName = "갑돌이";
        crewName = "돌아이들";
        genre = "아이돌댄스";
        level = CDanceLevel.AMATUER;
    }

    // 생성자 오버로딩
    ADancer(String dgenre) {
        dancerName = "관종킹";
        crewName = "써커스왕";
        genre = dgenre;
        level = CDanceLevel.BEGINNER;
    }

    ADancer(String dName, String dGenre, CDanceLevel dLevel) {
        dancerName = dName;
        crewName = "하하호호";
        genre = dGenre;
        level = dLevel;
    }


    // 기능 (메서드) : static을 붙이지 말기!
    // 춤추는 기능
    void dance(ADancer this) {
        System.out.println(this.genre + "춤을 열정적으로 춥니다.");
    }
// 원래 this 써줘야하는데, 당연한거니까 생략가능


    //스트레칭을 하는 기능
    void stretch() {
        System.out.println("몸을 유연하게 풉니다");
    }

    // 자기소개 기능
    String introduce() {
        return String.format("내 이름은 %s이고, %s팀에 소속되어 있습니다.", dancerName, crewName);
        // printf는 리턴이 안되기 때문에 format으로 사용
    }
}
