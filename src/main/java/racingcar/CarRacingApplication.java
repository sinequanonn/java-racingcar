package racingcar;

import racingcar.entity.Car;
import racingcar.util.CarRaceUtil;
import racingcar.util.InputUtil;
import racingcar.util.MessageUtil;

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
