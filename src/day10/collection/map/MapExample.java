package day10.collection.map;

import day04.array.StringList;
import day07.util.Utility;
import day09.song_teacher.Artist;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {

        // 키값, 벨류값
        Map<String, Object> map = new HashMap<>();
//        Map<String, List<Artist>> map = new HashMap<>();


        // put(K, Y) : 데이터 추가
        map.put("지갑잔액", 5000);
        map.put("좋아하는 가수", new Artist("동방신기", null));
        map.put("저녁메뉴", "볶음밥");


        // 엔터리(키+벨류)가 몇개인지 세줌
        System.out.println(map.size()); // 3


        // get(key) : 데이터 참조
        // 상위캐스팅으로 오니까 다운캐스팅 생각해야함! 항상!
        String dinner = (String) map.get("저녁메뉴");
        System.out.println("dinner = " + dinner);

        Artist artist = (Artist) map.get("좋아하는 가수");
        artist.info();

        System.out.println(map);

        map.put("저녁메뉴", "짬뽕");
        System.out.println(map);

        // remove는 키를 가지고 지우기
        map.remove("좋아하는 가수");
        System.out.println(map);

        // =================================================================
        Utility.makeLine();

        // 반복문 처리
        // 인덱스가 없어서 반복문(fori) 사용 불가
        // 그럼 땡땡이 for문(foreach)은? (인터페이스 iterable이 없어서 안됨)
        // 자바스크립트에서 쓰던 for in!
        for (Object key : map.keySet()) {
            System.out.println("key = " + key);
            System.out.println("value = " + map.get(key));
            Utility.makeLine();
        }



    }
}
