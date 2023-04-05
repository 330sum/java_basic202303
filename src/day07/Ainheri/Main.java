package day07.Ainheri;

public class Main {

    public static void main(String[] args) {

        AWarrior w = new AWarrior("주차왕파킹");
        BMage m = new BMage("충격왕쇼킹");
        CHunter h = new CHunter("욕설왕퍼킹");

//        w.showStatus();
//        m.showStatus();
//        h.showStatus();

        DPlayer[] players = {
                w, m, h,
                new AWarrior("토끼곤듀"),
                new AWarrior("딸긔곤듀")
        };

        m.thunderBolt(
                w, h,
                new AWarrior("토끼곤듀"),
                new AWarrior("딸긔곤듀")
        );









    }
}
