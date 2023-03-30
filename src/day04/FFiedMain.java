package day04;

public class FFiedMain {
    public static void main(String[] args) {
        EFieldAndLocal fl = new EFieldAndLocal();
        System.out.println(fl.a);
        System.out.println(fl.d);
        System.out.println(fl.e);

        fl.a = 65;
        fl.mm(100);

    }
}
