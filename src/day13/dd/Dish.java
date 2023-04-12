package day13.dd;

public class Dish {

    // final 불변값 -> 초기화 필요 (생성자를 통해서)
    // static final -> 상수 (유일성 + 불변성)
    // final만 붙이면 모든 요리이름은 다를 수 있지만, 요리이름(값)이 정해지면 바꿀 수 없음 (불변성)
    // static만 붙이면 모든 요리이름이 같아짐 (유일성)
    // 일반적으로 필드에 final 붙임 (단, 속력 같은건 계속 바뀌니까 붙이면 안됨)
    // final 붙으면 세터를 못 만듦!

    private final String name; // 요리이름
    private final boolean vegeterian; // 채식주의 여부
    private final int calories; // 킬로리
    private final Type type; // 요리 카테고리

    public enum Type {
        MEAT, FISH, OTHER
    }

    public Dish(String name, boolean vegeterian, int calories, Type type) {
        this.name = name;
        this.vegeterian = vegeterian;
        this.calories = calories;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public boolean isVegeterian() {
        return vegeterian;
    }

    public int getCalories() {
        return calories;
    }

    public Type getType() {
        return type;
    }


    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                ", vegeterian=" + vegeterian +
                ", calories=" + calories +
                ", type=" + type +
                '}';
    }
}
