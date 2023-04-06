package day09.quiz2;

import java.util.Scanner;

public class SingerView {

    private static Scanner sc;
    private SingerRepository repository;

    static {
        sc = new Scanner(System.in);
    }

    public void mainView() {
        System.out.println(" ***** 음악 관리 프로그램 ***** ");
        System.out.printf(" # 현재 등록된 가수 : %s", repository.singerList.length);
        System.out.println(" # 1. 노래 등록하기");
        System.out.println(" # 2. 노래 정보 검색");
        System.out.println(" # 3. 프로그램 종료");
        System.out.println(" ================================== ");
    }


    public void viewProcess() {
        String menuNum = input(">>");
        while (true) {
            switch (menuNum){
                case "1":
                    songAdd();

                    break;
                case "2":
                    break;
                case "3":
                    String answer = input("프로그램을 종료하시겠습니까? [y/n] ");
                    if (answer.toLowerCase().charAt(0)=='y') {
                        System.out.println("프로그램을 종료하겠습니다");
                        System.exit(0);
                    }
                    break;
                default:
                    System.out.println("\n 메뉴번호를 다시 입력하세요");
                    break;




            }
        }


    }
    String input(String message) {
        System.out.printf(message);
        return sc.nextLine();
    }


    private void songAdd() {

        System.out.println("# 노래 등록을 시작합니다.");
        String inputSinger = input(" - 가수명 : ");
        String inputSong = input(" - 곡명 : ");
        System.out.printf(" # 아티스트 %s님이 등록되었습니다.", inputSinger);

//        Singer singer = new Singer();
//        Singer.setName(singer);
//        Singer.setSongList(new StringList(song));

//        Singer singer1 = new Singer();
//        repository.singerList[0].setName();

//        Singer singer = new Singer(inputSinger, inputSong);
//        singer.setName(inputSinger);
//        singer.setSong(inputSong);


    }







}
