package day03;
// 배열 검색 및 수정
public class AAraaySearch {
    public static void main(String[] args) {
        String[] foods = {"삼겹살", "족발", "피자", "햄버거"};
//       foods[0] = foods[1];
        // l-value(영역) = r-value(값)
        foods[2] = "치킨";

        // 인덱스 탐색 알고리즘 (JS-indexOf)
        // 이진탐색 - updown게임 비슷 (시간복잡도 logN)
        // 선형탐색 - 순차방향, 역박향으로 한개씩 탐색 (시간복잡도 N)
        int index = -1; // 배열안에 없을 수 도 있기 때문에 -1로 초기값 지정
        String target = "치킨";
        for (int i = 0; i < foods.length; i++) {
            if (target.equals(foods[i])) {
                index = i;
                break;
            }
        }
        System.out.println(target +"의 인덱스: " + index);


    }
}
