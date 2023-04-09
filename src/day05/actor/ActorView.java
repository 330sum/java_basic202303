package day05.actor;

import java.util.Scanner;

public class ActorView {

    Scanner sc;
    ActorRepository repository;


    public ActorView() {
        this.sc = new Scanner(System.in);
        this.repository = new ActorRepository();
    }

    void mainView() {
        System.out.println("\n===== 나무엑터스 소속사 =====");
        System.out.println("1: 배우 전체 조회");
        System.out.println("2: 배우 등록");
        System.out.println("3: 배우 개별 정보 조회");
        System.out.println("4: 배우 정보 수정");
        System.out.println("5: 배우 정보 삭제");
        System.out.println("6: 프로그램 끝내기");
        System.out.println(" ====================== ");
    }

    void viewProcess() {

        while (true) {

            mainView();
            System.out.println("\n메뉴번호를 선택해주세요.");
            String menuNum = input(">> ");

            switch (menuNum) {
                case "1":
                    repository.showActor();
                    stop();
                    break;
                case "2":
                    signUp();
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "5":
                    break;
                case "6":
                    System.out.println("프로그램을 종료하시겠습니까? [Y/N]");
                    String answer = input(">> ");
                    if (answer.toUpperCase().charAt(0) == 'Y') {
                        System.out.println("프로그램을 종료하겠습니다.");
                        System.exit(0);
                    }else {
                        continue;
                    }
                    break;
                default:
                    System.out.println("번호를 다시 입력하세요.");
            }
        }


    }

    private void signUp() {
        System.out.println("배우 등록 시작!");
        String email = input(" - 이메일: ");
        String password = input(" - 비밀번호: ");
        String name = input(" - 이름: ");
        String gender = input(" - 성별 [M/F]: ");
        int age = Integer.parseInt(input(" - 나이: "));

        Actor newActor = new Actor(repository.getLastId()+1, email, password, name, gender, age);
        repository.addNewActor(newActor);
    }

    private String input(String message) {
        System.out.print(message);
        return sc.nextLine();
    }

    void stop() {
        System.out.println("\n엔터를 눌러서 계속하기");
        sc.nextLine();
    }


}
