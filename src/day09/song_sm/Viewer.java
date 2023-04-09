package day09.song_sm;

import day07.util.Utility;

import static day07.util.Utility.*;

public class Viewer {

    private Controller ctrl;

    public void start() {

        showMainMenu();
        selectMenu();


    }

    // 메인 메뉴
    private void showMainMenu() {
        System.out.println("\n\n ***** 음악 관리 프로그램 ***** ");
        System.out.printf(" # 현재 등록된 가수 : %d\n", ctrl.count());
        System.out.println(" # 1. 노래 등록하기");
        System.out.println(" # 2. 노래 정보 검색");
        System.out.println(" # 3. 프로그램 종료");
        System.out.println(" # 4. 전체조회");
        makeLine();
    }


    // 메뉴 선택
    private void selectMenu() {

        while (true) {
            String menuNum = input(">> ");

            switch (menuNum) {
                case "1":
                    registerProcess();
                    break;
                case "2":
                    searchProcess();
                    break;
                case "3":
                    bye();
                    break;
                case "4":
                    showList();

                    break;

                default:
                    System.out.println("# 메뉴번호를 다시 입력해주세요.");
                    break;
            }
        }

    }

    private void showList() {
        System.out.println(ctrl.getSingerList());
    }


    /**
     * 1. 노래 등록하는 메서드
     */
    private void registerProcess() {
        System.out.println("# 노래 등록을 시작합니다");
        String singerName = input("- 가수명 : ");
        String songName = input("- 곡명 : ");

        ctrl.addNewSinger(singerName, songName);

    }

    /**
     * 2.노래 정보 검색하는 메서드
     */
    private void searchProcess() {

    }

    private void bye() {
        String answer = input("# 프로그램을 종료하시겠습니까? [Y/N] ");
        if (answer.toUpperCase().charAt(0) == 'Y') {
            System.out.println("# 프로그램을 종료합니다.");
            System.exit(0);
        }
    }


}
