package day09.abstract_;

public class GoldFish extends Pet{

    public GoldFish(String name, String kind, int age) {
        super(name, kind, age);
    }

    @Override
    public void eat() {
        System.out.println("뻐끔뻐끔, 냠냠냠");

    }

    @Override
    public void takeNap() {

    }

}
