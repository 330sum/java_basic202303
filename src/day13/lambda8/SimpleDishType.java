package day13.lambda8;

public class SimpleDishType {

    private final String name;
    private final Dish.Type type;


    public SimpleDishType(Dish dish) {
        this.name = dish.getName();
        this.type = dish.getType();
    }


    public String getName() {
        return name;
    }

    public Dish.Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return "SimpleDishType{" +
                "name='" + name + '\'' +
                ", type=" + type +
                '}';
    }
}
