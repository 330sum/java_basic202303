package day10.generic;

public class Main {

    public static void main(String[] args) {

        AppleBasket ab = new AppleBasket();
        ab.setApple(new Apple());
        Apple apple = ab.getApple();

        BananaBasket bb = new BananaBasket();
        bb.setBanana(new Banana());

        Basket apples1 = new Basket();
        apples1.setFruit(new Apple());
        apples1.setFruit(new Banana());

        // =================================================================

        // 제네릭사용하면 바구니에 이름붙여서 각각 사용할 수 있음

        Basket<Apple> apples = new Basket<>();
        apples.setFruit(new Apple());
//        apples.setFruit(new Banana());

        Apple fruit = apples.getFruit();


        Basket<Banana> bananas = new Basket<>();
//        bananas.setFruit(new Apple());
        bananas.setFruit(new Banana());

        Banana fruit1 = bananas.getFruit();


        // ===============================================================


//        ArrayList<Integer> objects = new ArrayList<>();

        MyList<String> sl = new MyList<>();
        sl.push("짬뽕");
        sl.push("짜장면");
        sl.push("탕수육");

        System.out.println(sl);


        MyList<Integer> numbers = new MyList<>();
        numbers.push(10);
        numbers.push(20);
        numbers.push(30);

        System.out.println(numbers);

//        MyList<Artist>






    }
}
