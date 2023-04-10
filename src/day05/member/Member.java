package day05.member;

// 이 클래스의 존재 이유(역할) : 1명의 회원정보를 묶어주는 역할
// Java Bean (value object)

import java.time.LocalDate;

// 여러명의 회원정보를 담아놓는 저장소역할을 하는 클래스가 필요함! -> MemberRepository
public class Member {

    // 회원정보: 회원식별번호, 이메일, 비밀번호, 이름, 성별, 나이
    int memberId; // 회원이 900경 가입할 거 같으면 타입long으로 하기 ㅋㅋㅋ
    String email;
    String password;
    String memberName;
    Gender gender; // 정해져 있는 경우 열거체(enum)로 만들기! Gender위에서 alt + Enter
    int age;

    // 회원가입일
    LocalDate regDate; // 회원가입할때, 지금 날짜 읽어서 넣어주기!

    public Member(int memberId, String email, String password, String memberName, Gender gender, int age) {
        this.memberId = memberId;
        this.email = email;
        this.password = password;
        this.memberName = memberName;
        this.gender = gender;
        this.age = age;
    }

    // 회원정보를 문자열로 만들어서 리턴하는 메서드
    public String inform() {
        String convertGender = (gender == Gender.MALE) ? "남성" : "여성";
        return String.format("# %d번 | %s | %s | %s | %d세", this.memberId, this.email, this.memberName, convertGender, this.age);
    }


}
