package day13.lambda8;

// 요리 정보 중에 이름과 칼로리만 관리하는 객체
public class SimpleDish {

    private final String name;
    private final String calories;
    // String으로 한 이유는 뒤에 kcal 붙이려고


    public SimpleDish(Dish dish) {
        this.name = dish.getName();
        this.calories = dish.getCalories() + "kacl";
    }

    public SimpleDish(String name, String calories) {
        this.name = name;
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public String getCalories() {
        return calories;
    }

    @Override
    public String toString() {
        return "SimpleDish{" +
                "name='" + name + '\'' +
                ", calories='" + calories + '\'' +
                '}';
    }
}
