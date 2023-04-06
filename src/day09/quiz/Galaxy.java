package day09.quiz;


public class Galaxy extends SmartPhone implements Pencil {

    public Galaxy(String model) {
        super(model);
    }

    @Override
    public String information() {
        String information
                = String.format("갤럭시는 %s에서 만들어졌고 제원은 다음과 같다.\n" +
                makeCall() +
                takeCall() +
                takePicture() +
                charge() +
                "블루투스 펜 탑재 여부: " + bluetoothPen(),
                getModel()
        );
        return information;
    }

    @Override
    public String charge() {
        String charge = "고속충전, 고속 무선 충전\n";
        return charge;
    }

    @Override
    public String takePicture() {
        String takePicture = "1300만 듀얼카메라\n";
        return takePicture;
    }

    @Override
    public String makeCall() {
        String makeCall = "번호를 누르고 통화버튼을 누름\n";
        return makeCall;
    }


    @Override
    public String takeCall() {
        String takeCall = "전화받기 버튼을 누름\n";
        return takeCall;
    }

    @Override
    public boolean bluetoothPen() {
        return true;
    }

    @Override
    public String touchDisplay() {
        String touchDisplay = "정전식, 와콤펜 지원";
        return touchDisplay;
    }
}
