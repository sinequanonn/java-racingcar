package racingcar;

import racingcar.v2.CarRaceApplication;
import racingcar.v2.util.InputUtil;
import racingcar.v2.util.OutputUtil;

import java.util.List;

public class Application {

    private final static InputUtil inputUtil = new InputUtil();

    public static void main(String[] args) {
        // TODO: 프로그램 구현

        OutputUtil.printInputCarNamesMessage();
        List<String> carNames = inputUtil.getCarNames();
        OutputUtil.printInputCountMessage();
        int round = inputUtil.getRound();

        CarRaceApplication carRaceApplication = new CarRaceApplication(carNames, round);
        carRaceApplication.startRace();
    }
}
