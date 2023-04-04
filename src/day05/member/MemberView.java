package day05.member;

import java.util.Scanner;

import static day05.member.Gender.*;

// 역할: 회원관리 앱의 입출력을 담당
public class MemberView {

    Scanner sc; // 필드에서 직접초기화 하지말고, 생성자 안에서 초기화 할것.
    MemberRepository mr; // 협력관계 (의존관계)

    public MemberView() { // 필드는 항상 this 붙일것
        this.sc = new Scanner(System.in);
        this.mr = new MemberRepository();
    }

    /**
     * 초기 메인 화면을 출력
     */
    void mainView() {
        System.out.println("\n##### 회원 관리 시스템 #####");
        System.out.println(" * 1. 회원 정보 등록하기");
        System.out.println(" * 2. 개별회원 정보 조회하기");
        System.out.println(" * 3. 전체회원 정보 조회하기");
        System.out.println(" * 4. 회원 정보 수정하기");
        if (!mr.isEmpty())
            System.out.println(" * 5. 회원 정보 삭제하기");
        System.out.println(" * 6. 프로그램 끝내기");
        System.out.println("===============================");
    }

    /**
     * 프로그램 화면 흐름을 제어하는 기능
     */
    void viewProcess() {

        while (true) {
            mainView();
            String menuNum = input(">> ");

            switch (menuNum) {
                case "1":
                    signUp();
                    break;
                case "2":
                    showDetailMember();
//                    stop();
                    break;
                case "3":
                    mr.showMembers();
                    stop();
                    break;
                case "4":
                    changePasswordViewProcess();
                    break;
                case "5":
                    if (mr.isEmpty())
//                        return;
                        continue;
                    removeMemberViewProcess();
                    break;
                case "6":
                    String answer = input("# 정말로 종료합니까? [y/n] : ");
                    if (answer.toLowerCase().charAt(0) == 'y') {
                        System.out.println("# 프로그램을 종료합니다");
                        System.exit(0);
                    } else {
                        continue;
                    }
                    break;
                default:
                    System.out.println("\n# 메뉴 번호를 다시 입력하세요");

            }

        }
    }


    String input(String message) {
        System.out.printf(message);
        return sc.nextLine();
    }

    // 엔터를 누르기 전까지 멈추는 기능
    void stop() {
        System.out.println("\n ====== 엔터를 눌러서 계속 ... ======= ");
        sc.nextLine();
    }


    // 회원 등록 입력 처리
    void signUp() {
        System.out.println("\n# 회원 등록을 시작합니다!");


        String email;
        while (true) {
            email = input("# 이메일:");
            if (!mr.isDuplicateEmail(email)) {
                break;
            }
            System.out.println("# 중복된 이메일입니다 ㅋㅋ");
        }
        String name = input("# 이름: ");
        String password = input("# 패스워드: ");


        Gender gender;
        checkGender:
        while (true) {
            String inputGender = input("# 성별[M/F]: ");
            switch (inputGender.toUpperCase().charAt(0)) {
                case 'M':
                    gender = MALE;
                    // alt + Enter 해서 import static
                    break checkGender;
                case 'F':
                    gender = FEMALE;
                    break checkGender;
                default:
                    System.out.println("# 성별을 M/F로 정확히 입력하세요");
            }
        }

        int age = Integer.parseInt(input("# 나이:"));

        // 실제 저장 명령
        Member newMember = new Member(mr.getLastMemberId() + 1, email, password, name, gender, age);
        mr.addMember(newMember);

        System.out.println("\n 회원 가입 성공");
        stop();
    }


    // 회원 개별조회를 위한 입출력 처리 (내답)
//    void showDetailMember() {
//        // 이메일 입력하세요!
//        System.out.println("# 찾는 이메일을 입력하세요.");
//        String email = input("# 이메일: ");
//
//        // 찾은 회원의 정보
//        if (mr.findByEmail(email)==null) {
//            System.out.println("\n# 조회된 회원이 없습니다");
//        } else {
//            System.out.println("======= 조회 결과 =======");
//            System.out.println("# 이름: "+mr.findByEmail(email).memberName);
//            System.out.println("# 비밀번호: "+mr.findByEmail(email).password);
//            System.out.println("# 성별: "+mr.findByEmail(email).gender);
//            System.out.println("# 나이: "+mr.findByEmail(email).age);
//        }
//    }

    // 회원 개별조회를 위한 입출력 처리 (쌤답)
    void showDetailMember() {
        // 이메일 입력하세요!
        String inputEmail = input("# 조회를 시작합니다!\n# 이메일: ");
        Member foundMember = mr.findByEmail(inputEmail);
        // 찾은 회원의 정보 ~~~~~~
        if (foundMember != null) {
            System.out.println("\n========= 조회 결과 =========");
            System.out.printf("# 이름: %s\n", foundMember.memberName);
            System.out.printf("# 비밀번호: %s\n", foundMember.password);
            System.out.printf("# 성별: %s\n", (foundMember.gender == MALE) ? "남성" : "여성");
            System.out.printf("# 나이: %d세\n", foundMember.age);
        } else {
            System.out.println("\n# 조회된 회원이 없습니다.");
        }
        stop();
    }


    // 비밀번호 변경 입출력 처리
    void changePasswordViewProcess() {
        String email = input("# 수정할 대상의 이메일 : ");

        // 대상 탐색
        Member foundMember = mr.findByEmail(email);
        if (foundMember != null) {
            // 수정 진행
            System.out.printf("%s님의 비밀번호를 변경합니다.\n", foundMember.memberName);
            // 기존 비밀번호와 같으면 변경 취소
            String newPassword = input("# 새로운 비밀번호 :");
            if (foundMember.password.equals(newPassword)) {
                System.out.println("# 기존 비밀번호와 같습니다!");
                return;
            }
            mr.changePassword(email, newPassword);
            System.out.println("\n# 비밀번호가 성공적으로 수정되었습니다.");

        } else {
            System.out.println("\n# 조회 결과가 없습니다.");
        }
        stop();
    }


    // 삭제 (내답)
//    void removeMemberViewProcess() {
//        // 삭제대상 이메일 입력받기
//        String delEmail = input("# 삭제할 대상의 이메일 : ");
//
//        // 존재하는지 확인 후 삭제 처리 위임
//        Member targetMember = mr.findByEmail(delEmail);
//        if (targetMember != null) {
//            System.out.printf("%s님을 삭제하시겠습니까? \n", targetMember.memberName);
//            String answer = input("[y/n]");
//            // -> 한번 더 y/n으로 삭제여부 묻기
//            if (answer.toLowerCase().charAt(0) == 'y') {
//                String confirmAnswer = input("정말 삭제하시겠습니까? [y/n]");
//                mr.removeMember(delEmail);
//            }else {
//                System.out.println("삭제를 취소합니다.");
//                return;
//            }
//        } else {
//            System.out.println("\n# 삭제할 대상이 없습니다.");
//        }
//        stop();
//    }


    // 삭제 (쌤답)
    void removeMemberViewProcess() {

        // 삭제대상 이메일 입력받기
        String targetEmail
                = input("# 삭제할 회원의 이메일: ");

        // 존재하는지 확인 후 삭제 처리 위임
        Member foundMember = mr.findByEmail(targetEmail);
        if (foundMember != null) {
            // -> 한번 더 y/n으로 삭제여부 묻기
            String answer = input(String.format("# %s님의 정보를 정말 삭제합니까?? [y/n] : ", foundMember.memberName));
            switch (answer.toUpperCase().charAt(0)) {
                case 'Y':
                    mr.removeMember(targetEmail);
                    System.out.println("\n# 회원 정보 삭제 성공!!");
                    break;
                default:
                    System.out.println("\n# 삭제를 취소합니다.");
            }
        } else {
            System.out.println("\n# 조회 결과가 없습니다.");
        }
        stop();


    }


}
