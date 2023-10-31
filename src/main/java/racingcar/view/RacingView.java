package racingcar.view;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static camp.nextstep.edu.missionutils.Console.readLine;
import static racingcar.constant.Limits.MAX_NAME_SIZE;

public class RacingView {

    public List<String> gameStart() throws IOException {
        List<String> resultList = new ArrayList<>();

        try {
//            입력값 받기: 자동차 이름, 플레이 횟수
            String nameLine = readLine();
            String[] userCar = nameLine.split(",");
            String tryNumber = readLine();

//            Error Handler
            nameHandler(userCar);
            trialHandler(tryNumber);

//            controller에 넘길 반환값 설정하기
            resultList.add(tryNumber);
            for (String carName : userCar) {
                resultList.add(carName);
            }

//            index-0: 플레이 횟수, index-1,2,...:자동차 이름
            return resultList;

        } catch (Exception e) {
            throw new IllegalArgumentException("유효하지 않은 데이터입니다.");
        }
    }

    public void showLoad(List<String> name, List<String> location, int theNumOfCar) {
//        자동차 별 진척 상황 시각화
        for (int i = 0; i < theNumOfCar; i++) {
            System.out.println(name.get(i) + " : " + location.get(i));
        }
    }

    public void nameHandler(String[] car) {
        for (String name : car) {
            if (name.length() > MAX_NAME_SIZE) {
                throw new IllegalArgumentException("사용 가능한 최대 글자수는 5 입니다.");
            }
        }
    }

    public void trialHandler(String numString) {
        if (numString.equals("")) {
            throw new IllegalArgumentException("플레이 횟수를 기입하지 않았습니다.");
        }
    }
}