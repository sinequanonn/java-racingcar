package racingcar.v1;

import java.util.List;

public class ViewRound {

    public static void printOneRoundResult(List<Car> cars) {
        for (Car car : cars) {
            car.printRound();
        }
        System.out.println();
    }
}
