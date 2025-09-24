package racingcar;

import racingcar.v1.CarRacingApplication;
import racingcar.v1.Cars;
import racingcar.v1.Round;
import racingcar.v1.Winner;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현

        Cars cars = new Cars();

        CarRacingApplication carRacingApplication = new CarRacingApplication(cars);

        carRacingApplication.start();
    }
}
