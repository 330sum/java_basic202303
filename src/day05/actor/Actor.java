package day05.actor;

public class Actor {
    int actorId;
    String email;
    String password;
    String name;
    Gender gender;
    int age;

    public Actor(int actorId, String email, String password, String name, String gender, int age) {
    }

    public Actor(int actorId, String email, String password, String name, Gender gender, int age) {
        this.actorId = actorId;
        this.email = email;
        this.password = password;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    String inform() {
    return String.format("%d, %s, %s, %s, %s, %d",
            this.actorId, this.email, this.password, this.name, this.gender, this.age );
    }

}
