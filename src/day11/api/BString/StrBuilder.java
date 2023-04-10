package day11.api.BString;

public class StrBuilder {

    private static void makeString() {
        long start = System.currentTimeMillis();
        String s = "";
        for (int i = 0; i < 500000; i++) {
            s += "A";
        }
        long end = System.currentTimeMillis();

        System.out.println("스트링 총 소요시간: " + (end - start) + " 밀리초");
        System.out.println("스트링 총 소요시간: " + (end - start) / 1000 + " 초");
    }


    private static void makeStringBuilder() {
        long start = System.currentTimeMillis();
        StringBuilder s = new StringBuilder("");
        for (int i = 0; i < 500000; i++) {
            s.append("A");
        }
        long end = System.currentTimeMillis();

        System.out.println("빌더 총 소요시간: " + (end - start) + " 밀리초");
        System.out.println("빌더 총 소요시간: " + (end - start) / 1000 + " 초");
    }


    public static void main(String[] args) {

        makeStringBuilder();
        makeString();


    }

}
