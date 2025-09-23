package racingcar.v1;

import racingcar.v1.entity.Car;
import racingcar.v1.util.CarRaceUtil;
import racingcar.v1.util.InputUtil;
import racingcar.v1.util.MessageUtil;

import java.util.List;

public class CarRacingApplication {

    private final InputUtil inputUtil = new InputUtil();
    private final CarRaceUtil carRaceUtil = new CarRaceUtil();

    public CarRacingApplication() {
    }

    public void start() {
        MessageUtil.printInitMessage();
        List<Car> cars = inputUtil.getCarNames();
        MessageUtil.printInputMessage();
        int count = inputUtil.getCount();

        carRaceUtil.carRace(cars, count);
    }
}
