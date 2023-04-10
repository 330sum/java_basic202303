package day11.io;

public interface Path {

    // 인터페이스는 필드를 못가짐, 모든 변수가 상수화
    // (자동으로 상수 맨 앞에 psf (public static final) 붙음)
    // 경로나 설정정보, 숨겨야 하는 건 인터페이스에 쓰고, 깃허브 안올림! 로컬이나 서버에서만 관리하도록! (보안관리)
    String ROOT_PATH = "D:/exercise";

    String MEMBER_SAVE_PATH = ROOT_PATH + "/member";


}
