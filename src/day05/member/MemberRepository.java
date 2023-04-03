package day05.member;

// 역할: 회원 저장소 역할
public class MemberRepository {

    // 필드
    public static final int NOT_FOUND = -1;

    // 가입된 회원 배열
    Member[] memberList;

    // 삭제된 회원 배열 (휴지통 같은곳)
    Member[] removeMembers;

    // 숙제
    // 10명이상 되면 더 이상 가입 못하도록 1번메뉴 안보이게 하기


    public MemberRepository() {
        this.memberList = new Member[0]; // 3명 선가입시켜놓고 테스트 해보기
//        memberList[0] = new Member(1, "abc@def.com", "1234", "덮밥왕", Gender.MALE, 28);
//        memberList[1] = new Member(2, "ddd@fff.com", "5678", "짜장왕", Gender.MALE, 29);
//        memberList[2] = new Member(3, "ccc@vvv.com", "1254", "카레왕", Gender.MALE, 27);
    }

    // 메서드 (기능)

    /**
     * 모든 회원 정보를 출력해주는 메서드
     */
    void showMembers() {
        System.out.printf("=============== 현재 회원정보 (총 %d명) ======================= \n", memberList.length);
        for (Member m : memberList) {
            System.out.println(m.inform());

        }
    }

    /**
     * 회원 가입 기능 (push기능)
     *
     * @return : 회원가입 성공 여부 (성공시 true, 이메일이 중복되어 실패시 false)
     * @param1 - newMember: 새롭게 회원가입하는 회원의 정보
     */
    boolean addMember(Member newMember) {

        // 이메일이 중복인가?
        if (isDuplicateEmail(newMember.email)) return false;

        // 실제로 멤버를 추가하는 코드
        Member[] temp = new Member[memberList.length + 1];
        for (int i = 0; i < memberList.length; i++) {
            temp[i] = memberList[i];
        }
        temp[temp.length - 1] = newMember;
        memberList = temp;

        return true;
    }

    /**
     * 이메일의 중복여부를 확인하는 기능
     *
     * @return : 중복되었을 시 true, 사용가능할 시 false
     * @param1 targetEmail : 검사 대상 이메일
     */
    boolean isDuplicateEmail(String targetEmail) {
        for (Member m : memberList) {
            if (targetEmail.equals(m.email)) {
                return true;
            }
        }
        return false;
    }

    // 마지막 회원의 번호를 알려주는 기능
    int getLastMemberId() {
        if (!isEmpty()) {
            return memberList[memberList.length - 1].memberId;
        } else {
            return 0;
        }
//        return !isEmpty()? memberList[memberList.length - 1].memberId: 0;

    }


    /**
     * 이메일을 통해 특정 회원 객체를 찾아서 반환하는 기능
     *
     * @return : 찾은 회원의 객체정보, 못찾으면 null 반환
     * @param1 email : 찾고싶은 회원의 이메일
     */

    Member findByEmail(String email) {
        for (Member m : memberList) {
            if (email.equals(m.email)) {
                return m;
            }
        }
        return null;
    }


    /**
     * 이메일을 통해 저장된 회원의 인덱스값을 알아내는 메서드
     *
     * @param email - 탐색 대상의 이메일
     * @return : 찾아낸 인덱스, 못찾으면 -1 리턴 (-1보다 상수로 표현하는 것이 좋음 psf)
     */
    int findIndexByEmail(String email) {
        for (int i = 0; i < memberList.length; i++) {
            if (memberList[i].email.equals(email))
                return i;
        }
        return NOT_FOUND;
    }


// 시그니처와 파라미터가 다 있는경우, /** + Enter 치면 @param 작성할 수 있도록 됨
    /**
     * 비밀번호를 수정하는 기능
     * @param email       : 수정 대상의 이메일
     * @param newPassword : 변경할 새로운 비밀번호
     */
    boolean changePassword(String email, String newPassword) {

        // 인덱스 탐색
        int index = findIndexByEmail(email);

        // 수정진행
        if (index == NOT_FOUND) return false;

        memberList[index].password = newPassword;
        return true;

    }

    /**
     * 회원 삭제하는 기능
     * @param : 삭제할 대상의 이메일
     */
    void removeMember(String email) {
        // 인덱스 찾기
        int delIndex = findIndexByEmail(email);


        // 배열 앞으로 한칸씩 땡기기
        for (int i = delIndex; i < memberList.length - 1; i++) {
            memberList[i] = memberList[i + 1];
        }

        // 배열 마지막 칸 없애기(pop)
        Member[] temp = new Member[memberList.length - 1];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = memberList[i];
        }
        memberList = temp;
//        temp = null;
    }


    // 멤버가 비었는지 확인
    boolean isEmpty() {
        return memberList.length == 0;
    }


}
