package day12.lambda.day12.lambda;

import java.util.ArrayList;
import java.util.List;

// 사과 중에 원하는 필드들만 추출해서 새로운 리스트로 만들기
public class MappingApple {

    // 사과의 색상만 추출
//    public static List<Color> mappingAppleByColor(List<Apple> basket) {
//        List<Color> colorList = new ArrayList<>();
//        for (Apple apple : basket) {
//            colorList.add(apple.getColor());
//        }
//        return colorList;
//    }

    // 무게는? List<Integer> , apple.getWeight()
    // 원산지는? 추출대상 필요

    public static List<Color> mappingAppleByColor(List<Apple> basket) {
        List<Color> colorList = new ArrayList<>();
        for (Apple apple : basket) {
            Color color = apple.getColor();
            colorList.add(color);
        }
        return colorList;
    }



    public static List<Color> map (List<Apple> basket, GenericFunction<Apple, Color> mapper) {
        List<Color> colorList = new ArrayList<>();
        for (Apple apple : basket) {
            Color color = mapper.apply(apple);
            colorList.add(color);
        }
        return colorList;
    }

    public static <X, Y> List<Y> map (
            List<X> basket
            , GenericFunction<X, Y> mapper
    ) {

        List<Y> mappedList = new ArrayList<>();
        for (X x : basket) {
            Y y = mapper.apply(x);
            mappedList.add(y);
        }
        return mappedList;

    }





}
