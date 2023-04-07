package day10.exception;

public class UserMain {

    public static void main(String[] args) {

        LoginUser user = new LoginUser("abc123", "1234");

        try {
            user.loginValidate("abc124", "1111");
        } catch (LoginValidateException e) {
            // e.getMessage() : 에러원인 메시지를 리턴받아옴. throw에 작성해둔 메시지
            System.out.println(e.getMessage());
        }


    }
}
