package day05.actor;

public class ActorRepository {

    Actor[] actorlist;

    public ActorRepository() {
        this.actorlist = new Actor[3];
        actorlist[0] = new Actor(1, "aaa", "111", "한소희", Gender.FEMALE, 28 );
        actorlist[1] = new Actor(2, "bbb", "222", "송강", Gender.MALE, 28 );
        actorlist[2] = new Actor(3, "ccc", "333", "차은우", Gender.MALE, 28 );
    }

    public void showActor() {
        System.out.printf("=== 현재 등록된 배우의 수 (%d) ===\n", actorlist.length);
        for (Actor a : actorlist) {
            System.out.println(a.inform());
        }
    }

    int getLastId() {
        return actorlist[actorlist.length-1].actorId;
    }

    public void addNewActor(Actor newActor) {
        Actor[] temp = new Actor[actorlist.length + 1];
        for (int i = 0; i < actorlist.length; i++) {
            temp[i] = actorlist[i];
        }
        temp[temp.length-1] = newActor;
        actorlist = temp;

    }




}
