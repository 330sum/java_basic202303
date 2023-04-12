package day13.lambda8;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import static day13.lambda8.Menu.menuList;

// filter -> return 데이터 추려짐 리턴타입도 바뀜
// map -> return 갯수 동일, 타입 동일

public class Mapping {

    public static void main(String[] args) {

        System.out.println("\n\n========== stream의 map : 리스트에서 원하는 정보만 추출 ==========");
        System.out.println("========== 메뉴 목록에서 요리의 이름들만 목록으로 추출 ==========");

        List<String> dishNames = menuList.stream()
                .map(dish -> dish.getName())
                .collect(Collectors.toList());
        System.out.println("dishNames = " + dishNames);

        System.out.println("========== 메뉴 목록에서 칼로리만 목록으로 추출 ==========");
        List<Integer> collect = menuList.stream()
                .map(dish -> dish.getCalories())
                .collect(Collectors.toList());
        System.out.println("collect = " + collect);


        System.out.println("\n\n========== 아래 리스트의 글자의 개수 추출 ==========");
        List<String> words = List.of(
                "safari", "chrome", "ms edge", "opera", "firefox"
        );

        List<Integer> wordLengths = words.stream()
                .map(w -> w.length())
                .collect(Collectors.toList());
        System.out.println("wordLengths = " + wordLengths); // 6,6,7,5,7

        System.out.println("\n\n========== 메뉴 목록에서 메뉴이름과 칼로리를 추출하는데,\n " +
                "칼로리를 정수가 아닌 문자열로 kcal을 뒤에 붙여서 추출 후,\n" +
                "메뉴이름: xxxkcal로 반복 출력하고 싶음 ==========");

        // 람다식
//        menuList.stream()
//                .map(dish -> {
//                    String name = dish.getName();
//                    int calories = dish.getCalories();
//                })
//                .collect(Collectors.toList());

        // 익명클래스
        List<SimpleDish> simpleDishes = menuList.stream()
                .map(new Function<Dish, SimpleDish>() {
                         @Override
                         public SimpleDish apply(Dish dish) {
                             SimpleDish sd = new SimpleDish(dish.getName(), dish.getCalories() + "kcal");
                             return sd;
                             // 리턴값이 2개 이상이면 객체 묶거나 배열로 묶어서 리턴! -> SimpleDish클래스로 묶음
                             // sd 두개보다는 한줄로 리턴 -> ctrl + alt + n -> 람다식으로 변경
                         }
                     }
                )
                .collect(Collectors.toList());
//        System.out.println("simpleDishes = " + simpleDishes);
        simpleDishes.forEach(sd -> System.out.println("sd = " + sd));


        // 위의 내용 람다식으로 표현
        System.out.println("========== 위의 내용 람다식으로 표현 ==========");
        List<SimpleDish> simpleDishes2 = menuList.stream()
                .map(dish -> new SimpleDish(dish.getName(), dish.getCalories() + "kcal"))
                .collect(Collectors.toList());
        System.out.println("simpleDishes2 = " + simpleDishes2);

        // 필요한 이유?
        // 회원가입에 기입된 내용은 많은데, 마이페이지에는 일부만 보여줘야함.
        // 그 때, 일부만 뜯어서 보여줘야함. 그때 사용하는 것!


        // 생성자한테 getter 주면 엄청 짧아짐!
        System.out.println("========== 생성자한테 getter 주면 엄청 짧아짐! ==========");
        List<SimpleDish> simpleDishes3 = menuList.stream()
                .map(dish -> new SimpleDish(dish))
                .collect(Collectors.toList());
        System.out.println("simpleDishes3 = " + simpleDishes3);


        // 더 간략하게
        System.out.println("========== 더 간략하게 ==========");
        List<SimpleDish> simpleDishes4 = menuList.stream()
                .map(SimpleDish::new)
                .collect(Collectors.toList());
        System.out.println("simpleDishes4 = " + simpleDishes4);


        System.out.println("\n\n========== 메뉴 목록에서 칼로리가 500칼로리보다 큰 음식을 필터링 한 다음에\n" +
                "음식의 이름과 타입만 추출해서 출력해주세요 ==========");
        menuList.stream()
                .filter(dish -> dish.getCalories() > 500)
                .map(dish -> new SimpleDishType(dish))
                .collect(Collectors.toList())
                .forEach(dnt -> System.out.println("dnt = " + dnt));


        System.out.println("\n\n========== 메뉴 목록에 있는 요리들의 총 칼로리수와 평균 구하기 ==========");
        // 총합 - 기존방식
        int sum = 0;
        for (Dish dish : menuList) {
            sum += dish.getCalories();
        }
        System.out.println("sum = " + sum);

        // 총합 - 현재방식
        int sumCal = menuList.stream()
                .mapToInt(d -> d.getCalories())
                .sum();

        NumberFormat formatter = new DecimalFormat("#,###");
        System.out.println("sumCal = " + formatter.format(sumCal) + "칼로리");

        // 평균 - 현재방식
        double averageCal = menuList.stream()
                .mapToInt(d -> d.getCalories())
                .average()
                .getAsDouble();
        // 이거 꼭 필요! (메뉴리스트에 쌓인게 없어서 에러 날까봐 OptionalDouble 된거)
        System.out.println("averageCal = " + averageCal);


        System.out.println("\n\n========== 육류메뉴 평균 칼로리 ==========");

        double meatAverageCal = menuList.stream()
                .filter(d -> d.getType() == Dish.Type.MEAT)
                .mapToInt(d -> d.getCalories())
                .average()
                .getAsDouble();
        System.out.printf("meatAverageCal = %.2f", meatAverageCal);


    }

}
