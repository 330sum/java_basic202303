package day11.api.Etime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class DateTime {

    public static void main(String[] args) {

        Date date = new Date();

        // Calendar는 추상클래스임
        // 추상클래스는 바로 객체생성불가 -> 메서드를 통해서 접근가능
        Calendar calendar = Calendar.getInstance();
        // Calendar의 치명적 단점 (1월이 0임), 월정보 체크할 때마다 +1 해줘야함


        // 그럼 뭘 쓰냐
        // 현재 날짜 정보 얻기 (연, 월, 일)
        LocalDate nowData = LocalDate.now();
        System.out.println("nowData = " + nowData);

        // 시, 분, 초
        LocalTime nowTime = LocalTime.now();
        System.out.println("nowTime = " + nowTime);

        // 연월일시분초
        LocalDateTime nowDataTime = LocalDateTime.now();
        System.out.println("nowDataTime = " + nowDataTime);

        // 원하는 날짜정보만 얻기
        int year = nowDataTime.getYear();
        System.out.println("year = " + year);

        // 특정 날짜 만들기
        LocalDateTime targetDate = LocalDateTime.of(2023, 5, 5, 9, 0, 0);
        System.out.println("targetDate = " + targetDate);

        // 날짜 연산
        // 도서대여 시스템에서 빌린 날짜라부터 3일 후가 반납일
        LocalDateTime rentalDate = LocalDateTime.now();
        LocalDateTime returnDate = rentalDate.plusDays(3);
        System.out.println("returnDate = " + returnDate);

        LocalDateTime targetDateTime = returnDate
                                        .plusYears(1)
                                        .plusMonths(2)
                                        .plusDays(10)
                                        .plusHours(5);

        // 사이 날짜 구하기
        LocalDate b = LocalDate.of(2019, 12, 28);
        LocalDate d = LocalDate.of(2023, 3, 10);

        long between = ChronoUnit.DAYS.between(b, d);
        System.out.println("between = " + between);

        // 날짜 포맷 바꾸기(시간 예쁘게 포맷팅)
        System.out.println("nowDataTime = " + nowDataTime);
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 E요일 a hh시 mm분");
        String dateString = nowDataTime.format(pattern);
        System.out.println("dateString = " + dateString);



        // 이미 종료된 이벤트입니다. (유효기간이 며칠남았습니다)
        //nowDataTime.isAfter();



    }
}
