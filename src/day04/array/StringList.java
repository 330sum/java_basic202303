package day04.array;

import java.util.Arrays;

// 스트링배열을 제어하는 설계도
public class StringList {

    // 필드
    String[] sArr;

    // 생성자
    StringList() {
        sArr = new String[0];
//        System.out.println("생성자 끌려옴");
    }

    StringList(String... initData) {
        sArr = new String[initData.length];
//        for (String datum : initData) {
//            push(datum);
//        }
        for (int i = 0; i < sArr.length; i++) {
            sArr[i] = initData[i];
        }
    }

    // 메서드
    // 배열에 저장된 데이터 수를 알려주는 기능
    int size() {
        return sArr.length;
    }



    // 배열에 맨 끝에 데이터를 추가하는 기능 (push)
    void push(String newData) {
        String[] temp = new String[sArr.length + 1];
        for (int i = 0; i < sArr.length; i++) {
            temp[i] = sArr[i];
        }
        temp[temp.length - 1] = newData;
        sArr = temp;
//        temp = null; // temp는 지역변수이기 때문에, 메서드 호출이 끝나면 알아서 살아짐. 그래서 null 필요없음
    }



    // 배열 맨 끝 데이터 삭제하는 기능 (pop)
    String pop() {
        String deleteTarget = sArr[sArr.length - 1];
        String[] temp = new String[sArr.length - 1];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = sArr[i];
        }
        sArr = temp;
        return deleteTarget;
    }



    // 배열 내부데이터 출력
    public String toString() {
        return Arrays.toString(sArr);
    }



    // 배열이 텅텅비었는지 확인 (isEmpty)
    boolean isEmpty() {
        return sArr.length == 0;
    }



    // 배열 데이터 전체삭제 (clear)
    void clear() {
        sArr = new String[0];
    }




    // 인덱스 탐색 (indexOf)
    int indexOf(String target) {
        for (int i = 0; i < sArr.length; i++) {
            if (target.equals(sArr[i])) {
                return i;
            }
        }
        return -1;
    }

    // 자료 유무 확인 (includes)
    boolean includes(String target) {
        return indexOf(target) != -1;
    }

    // 중간 삭제 (remove) : 인덱스로 삭제
    String remove(int index) {
        if (index < 0 || index > sArr.length - 1) return null;

        String targetData = sArr[index];
        for (int i = index; i < sArr.length - 1; i++) {
            sArr[i] = sArr[i + 1];
        }
        pop();
        return targetData;
    }
    // 중간 삭제 (remove) : 값으로 삭제
    String remove(String target) {
        return remove(indexOf(target));
    }

    // 중간 삽입 (insert)
    void insert(int index, String newData) {

        if (index < 0 || index > sArr.length - 1) return;
        if (index == sArr.length - 1) push(newData);

        String[] temp = new String[sArr.length + 1];
        for (int i = 0; i < sArr.length; i++) {
            temp[i] = sArr[i];
        }
        for (int i = temp.length - 1; i > index; i--) {
            temp[i] = temp[i-1];
        }
        temp[index] = newData;
        sArr = temp;
    }



}
