package day03;

// 배열 검색 및 수정 함수
public class BArraySearchMethod {

    public static String[] foods = {"삼겹살", "족발", "피자", "햄버거"};

    public static int indexOf(String target) {
//        int index = -1; // 배열안에 없을 수 도 있기 때문에 -1로 초기값 지정
        for (int i = 0; i < foods.length; i++) {
            if (target.equals(foods[i])) {
//                index = i;
//                break;
                return i;
            }

        }
//        return index;
        return -1;
    }

    public static void main(String[] args) {
        int index = indexOf("족발");
        System.out.println("찾은 인덱스: " + index);


    }
}
