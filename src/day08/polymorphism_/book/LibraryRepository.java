package day08.polymorphism_.book;

import day04.array.StringList;

// 도서관리 시스템 데이터 처리 (데이터베이스)
public class LibraryRepository {

    // 필드
    private static BookUser bookUser; // 회원 1명임
    //    private static BookUser[] bookUser; // 만약, 여러명이면 배열로 만들기
    private static Book[] booklist; // 도서관이 가진 모든 책들의 정보


    static {
        booklist = new Book[]{
                new CookBook("기적의 집밥책", "김해진", "청림라이프", true),
                new CartoonBook("떨어지면 끝장맨", "스에노부게이코", "대원씨아이", 18),
                new CookBook("삐뽀삐뽀 119 이유식", "하정훈", "유니책방", false),
                new CartoonBook("원펀맨", "One", "대원씨아이", 15),
                new CookBook("오늘은 아무래도 덥밥", "이마이 료", "참돌", true),
                new CartoonBook("이세계로 전이했으니 치트를 살려 마법검사가 되기로 했다", "홍순구", "대원씨아이", 13),
        };
    }

    // static 필드이기 때문에 생성자에서 초기화하면 안됨...
    // 생성자
//    public LibraryRepository() {
//        booklist = new Book[5];
//        booklist[0] = new Book("백종원의 집밥", "백종원", "tvN");
//        booklist[1] = new Book("한번 더 해요", "미티", "원모어");
//        booklist[2] = new Book("루피의 원피스", "루피", "japan");
//        booklist[3] = new Book("이혜정의 얼마나 맛있게요", "이혜정", "문학");
//        booklist[4] = new Book("최현석 날 따라해봐", "최현석", "소금책");
//    }


    //메서드

    // 유저를 등록하는 기능
    public void register(BookUser userInfo) {
        bookUser = userInfo;
        // 입출력과 데이터베이스는 따로 관리
        // this를 못쓰는 이유, static이기 때문에
    }


    // 마이페이지 기능

    /**
     * 여기에 있는 bookUser 정보 리턴
     */
    BookUser findBookUser() {
        return bookUser;
    }


    // 모든 책의 정보들을 알려주는 메서드
    public String[] getBookInfoList() {
        String[] infoList = new String[booklist.length];
        for (int i = 0; i < infoList.length; i++) {
            infoList[i] = booklist[i].info();
        }
        return infoList;

    }


    // 검색어를 받으면 해당 검색어를 포함하는 제목을 가진 책 정보들을 반환
    public String[] searchBookInfoList(String keyword) {
        //String[] infoList = {};
        StringList list = new StringList();

        // bookList를 뒤지기
        for (Book book : booklist) {
            String title = book.getTitle(); // 책 제목
            if (title.contains(keyword)) {
                // 검색어에 걸린 책 제목.책의 정보문자열
                String info = book.info();
                list.push(info);
            }
        }
        return list.getsArr();
    }




    // 도서 대여 처리
    public RentStatus rentBook(int rentNum) {
        // 대여를 원하는 책 추출
        Book wishBook = booklist[rentNum - 1];

        // 책의 분류에 따라 다른 처리 (쿠폰, 연령)
        if (wishBook instanceof CookBook) {
            // 쿠폰 유무 확인
            // 현재 wishBook이 (91번라인) Book 타입이기 때문에
            // CookBook의 고유한 쿠폰속성을 위해서 다운캐스팅 필요함
            CookBook cookBook = (CookBook) wishBook;
            if(cookBook.isCoupon()){
                bookUser.setCouponCount(bookUser.getCouponCount()+1);
                return RentStatus.RENT_SUCCESS_WITH_COUPON; // alt + Enter로 import static 처리 가능
            }else {
                return RentStatus.RENT_SUCCESS;
            }


        } else if (wishBook instanceof CartoonBook) {
            // 연령 제한 확인
            // 다운캐스팅
            CartoonBook cartoonBook = (CartoonBook) wishBook;
            if(bookUser.getAge() >= cartoonBook.getAccessAge()) {
                // 빌릴 수 있는 경우
                return RentStatus.RENT_SUCCESS;

            }else {
                return RentStatus.RENT_FAIL;
            }
        }
            return  RentStatus.RENT_FAIL;
    }





    // 저자를 받으면 저자에 관련된 책 디테일 정보들을 반환
    public String[] searchAuthor(String author) {

        StringList list = new StringList();

        // 저자들 뒤지기
        for (Book book : booklist) {
            String authorFullName = book.getAuthor();// 책 저자
            if (authorFullName.contains(author)) {
                String bookAuthor = book.authorInfo();
                list.push(bookAuthor);
            }

        }

        return list.getsArr();
    }


}
