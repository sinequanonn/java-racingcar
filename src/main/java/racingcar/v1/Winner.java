package racingcar.v1;

import java.util.ArrayList;
import java.util.List;

public class Winner {

    List<String> winners = new ArrayList<>();

    void isWinner(List<Car> cars) {
        int maxMove = cars.stream()
                .mapToInt(Car::getMove)
                .max()
                .orElse(0);

        for (Car car : cars) {
            if (car.isMaxMove(maxMove)) {
                winners.add(car.getName());
            }
        }
        printWinner();
    }

    void printWinner() {
        System.out.println(String.join(", ", winners));
    }

}
