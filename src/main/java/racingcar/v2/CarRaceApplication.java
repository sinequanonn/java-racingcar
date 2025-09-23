package racingcar.v2;

import racingcar.v2.util.OutputUtil;

import java.util.List;

public class CarRaceApplication {
    private Cars car;
    private int totalRound;

    public CarRaceApplication(List<String> carNames, int totalRound) {
        this.car = new Cars(carNames);
        this.totalRound = totalRound;
    }

    public void startRace() {

    }
}
