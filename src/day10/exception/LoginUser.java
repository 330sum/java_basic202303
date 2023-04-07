package day10.exception;

public class LoginUser {

    String userAccount; // 가입된 계정명
    String userPassword; // 가입시 설정한 패스워드

    public LoginUser(String userAccount, String userPassword) {
        this.userAccount = userAccount;
        this.userPassword = userPassword;
    }


    // 로그인 검증
    public String loginValidate(String inputAccount, String inputPassword)
            throws LoginValidateException {

        // 회원 계정이 존재하는가?
        if (userAccount.equals(inputAccount)) {
            // 패스워드가 일치하는가?
            if (userPassword.equals(inputPassword)) {
                // 로그인 성공
                return "SUCCESS";
            } else {
                // 패스워드가 틀림.
                // throw 에러를 사용해서 일부러 error를 유발시키는 것 (예시. 통장 5천원 1만원 출금)
                // 근데 이건 내가 에러를 터트리려는게 아니라 경고장인거임. 그러니까 try-catch 필요
                // throw 새로운 에러를 발생시키다 ("에러내용")
                throw new LoginValidateException("비밀번호 똑바로 치세요!");
                // 예외에 메시지를 넣도록 만들어 줬기 때문에
                // 디테일 처리를 위해 만들어 둠
            }
        } else {
            // 계정정보가 틀림
            throw new LoginValidateException("회원가입부터 하세요!");
        }
    }

}