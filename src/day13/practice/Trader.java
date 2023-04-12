package day13.practice;

public class Trader {

    private final String name; // 이름
    private final String city; // 거래하는 곳

    public Trader(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return String.format("Trader: %s in %s", name, city);
    }
}