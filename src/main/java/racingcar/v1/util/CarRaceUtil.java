package racingcar.v1.util;

import camp.nextstep.edu.missionutils.Randoms;
import racingcar.v1.entity.Car;

import java.util.ArrayList;
import java.util.List;

public class CarRaceUtil {

    public void carRace(List<Car> cars, int count) {
        for (int i = 0; i < count; ++i) {
            for (Car car : cars) {
                getRandomEachCar(car);
                car.printMove();
            }
            System.out.println();
        }
        getWinner(cars);
    }

    void getRandomEachCar(Car car) {
        int random = Randoms.pickNumberInRange(0, 9);

        // 4 이상인 경우 +1
        if (random >= 4) {
            car.addMove();
        }
    }

    void getWinner(List<Car> cars) {
        int maxMove = cars.stream()
                .mapToInt(Car::getMove)
                .max()
                .orElse(0);

        List<String> winners = new ArrayList<>();
        for (Car car : cars) {
            if (car.getMove() == maxMove) {
                winners.add(car.getName());
            }
        }

        System.out.println("최종 우승자 : " + String.join(", ", winners));
    }
}
