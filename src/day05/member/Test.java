package day05.member;

public class Test {

    public static void main(String[] args) {
//        Member m1 = new Member(1, "abc@def.com", "1234", "콩벌레", Gender.MALE, 29);
//        Member m2 = new Member(2, "zzz@ddd.com", "5678", "팥죽이", Gender.FEMALE, 25);
        // ()안에서 ctrl + p 누르면 매개변수로 뭐뭐 넣어야하는지 보여줌

//        System.out.println(m1.inform());
//        System.out.println(m2.inform());


    MemberRepository mr = new MemberRepository();
//        mr.showMembers();


        Member thief = new Member(4, "qqq@bbb.com", "4444", "밥도둑", Gender.MALE, 22);
        mr.addMember(thief);
        mr.addMember(thief);

        mr.showMembers();
        
        boolean flag = mr.isDuplicateEmail("ddd@fff.com");
        System.out.println("flag = " + flag); // 중복이면 true, 다르면 false (가입가능)




    }




}
