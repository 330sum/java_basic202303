package day13.stream;

import java.util.function.Predicate;

public class VegePredicate implements Predicate<Dish> {

    @Override
    public boolean test(Dish dish) {
        return dish.isVegeterian();
    }



}
