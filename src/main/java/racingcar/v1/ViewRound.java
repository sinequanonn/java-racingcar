package racingcar.v1;

import java.util.List;

public class ViewRound {

    public void printOneRoundResult(List<Car> cars) {
        for (Car car : cars) {
            printRound(car);
        }
        System.out.println();
    }

    private void printRound(Car car) {
        System.out.println(car.getName() + " : " + "-".repeat(car.getMove()));
    }

}
