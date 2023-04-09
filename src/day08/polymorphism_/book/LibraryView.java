package day08.polymorphism_.book;

import day05.member.Gender;

import static day05.member.Gender.FEMALE;
import static day05.member.Gender.MALE;
import static day07.util.Utility.input;

public class LibraryView {
    // 필드
//    private static Scanner sc;
    private static LibraryRepository repository;

    // static 데이터는 생성자에서 초기화하면 안됨
    // static은 객체 생성없이 사용 가능하니까 생성자 자체를 사용하지 않을 가능성이 높음
    // static 필드의 초기화는 static initializer 를 사용
    // 따로 new 안불러도 알아서 됨

    static {
        System.out.println("지금! 정적 초기화자 호출!");
//        sc = new Scanner(System.in);
        repository = new LibraryRepository();
    }


    // 메서드
    // 회원 정보 입력처리
    private static void makeNewBookUser() {
        System.out.println("\n # 회원 정보를 입력해주세요.");
        String name = input("# 이름: "); //import static
        int age = Integer.parseInt(input("# 나이: ")); //import static
        Gender gender = inputGender();

        // 입력받은 데이터 객체로 포장
        BookUser userInfo = new BookUser();
//        userInfo.name; // private이기 때문에 게터세터로 접근해야함
        userInfo.setName(name);
        userInfo.setAge(age); // 나중에 setter로 나이제한 주는 것도 가능
        userInfo.setGender(gender);

        // 입력 받은 유저객체를 저장소 보내기
        // 근데, 현재 저장소로 보내려고 했는데, 저장소가 private로 막혀있어서 메서드를 이용해서 저장소로 보내기!
        repository.register(userInfo);

    }

    // 정확하게 성별을 입력할 때까지 반복 입력되는 메서드
    private static Gender inputGender() {
        while (true) {
            String inputGender = input("# 성별(M/F) : ");
            Gender gender;
            switch (inputGender.toUpperCase().charAt(0)) {
                case 'M':
                    return MALE; //import static
                case 'F':
                    return FEMALE; //import static

                default:
                    System.out.println("\n# 설병을 잘못 입력했습니다.");
            }
        }
    }

    // 화면 처리
    public static void start() {

        makeNewBookUser();

        // 메인 메뉴 띄우기
        while (true) {
            showMainScreen();
            selectMenu();
            showBookList();

        }

    }

    // 도서 전체목록
    private static void showBookList() {

    }


    // 메뉴번호를 입력받고 분기를 나눠주는 메서드
    public static void selectMenu() {
        String menuNum = input(" - 메뉴 번호: ");


        switch (menuNum) {
            case "1":
                // 마이페이지: 가입한 회원정보 출력
                BookUser user = repository.findBookUser();
                System.out.println("\n ********* 회원님 정보 ********");
                System.out.println("# 회원명: " + user.getName());
                System.out.println("# 나이: " + user.getAge());
                System.out.println("# 성별: " + user.getGenderToString());
                System.out.println("# 쿠폰개수: " + user.getCouponCount());
                break;
            case "2":
                String[] infoList = repository.getBookInfoList();
                System.out.println("\n ========== 모든 도서 정보========== ");
                for (String info : infoList) {
                    System.out.println(info);
                }
                break;
            case "3":
                // 사용자에게 검색어를 입력받는다.
                String keyword = input("# 검색어 : ");
                // 저장소에게 해당 검색어를 주고, 걸린 책 정보를 내놓으라고 하기
                String[] bookInfoList = repository.searchBookInfoList(keyword);
                if (bookInfoList.length > 0) {
                    System.out.printf("\n======== [%s] 검색 결과 =========\n", keyword);
                    for (String info : bookInfoList) {
                        System.out.println(info);
                    }
                } else {
                    System.out.println("\n# 검색 결과가 없습니다.");
                }

                break;
            case "4":
                // 대여가능한 책의 목록을 번호와 함께 출력
                String[] rentalList = repository.getBookInfoList();
                System.out.println("\n ========== 대여가능한 도서 정보========== ");
                int bookNum = 1;
                for (String info : rentalList) {
                    System.out.printf("%d. %s\n", bookNum++, info);
                }
                String rentNum = input("- 대여할 도서 번호 입력: ");
                RentStatus rentStatus = repository.rentBook(Integer.parseInt(rentNum));
                if (rentStatus == RentStatus.RENT_SUCCESS_WITH_COUPON) {
                    System.out.println("# 성공적으로 요리책이 쿠폰발급과 함께 대여되었습니다.");
                } else if (rentStatus == RentStatus.RENT_SUCCESS) {
                    System.out.println("# 도서가 성공적적으로 대여 되었습니다");
                } else {
                    System.out.println("#도서 대여에 실패하였습니다.");
                }


                break;
            case "5":
                // 사용자에게 저자이름 입력받기
                String author = input("저자이름으로 검색: ");
                // 저장소에 저자이름 주고, 걸린 책의 정보들 나열해서 달라고 하기
                String[] bookDetail = repository.searchAuthor(author);
                break;
            case "9":
                String answer = input("정말 종료하시겠습니까? [y/n] ");
                if (answer.toLowerCase().charAt(0) == 'y') {
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0);
                }
                break;
            default:
                System.out.println("\n메뉴 번호를 다시 입력하세요.");
        }


    }


    // 메인 메뉴창을 출력하는 메서드
    private static void showMainScreen() {

        System.out.println("\n=============== 도서 메뉴 ===============");
        System.out.println(" # 1. 마이페이지");
        System.out.println(" # 2. 도서 전체 조회");
        System.out.println(" # 3. 도서 검색");
        System.out.println(" # 4. 도서 대여하기");
        System.out.println(" # 5. 도서 저자이름으로 검색");
        System.out.println(" # 9. 프로그램 종료하기");

    }


}
