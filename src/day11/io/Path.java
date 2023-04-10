package day11.io;

public interface Path {

    // 인터페이스는 필드를 못가짐, 모든 변수가 상수화
    // 숨길 것 같은 건 여기 쓰고, 깃허브 안올림 로컬에서만 관리하도록! (보안관리)
    String ROOT_PATH = "D:/exercise";

    String MEMBER_SAVE_PATH = ROOT_PATH + "/member";


}
