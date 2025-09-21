package racingcar.util;

import racingcar.entity.Car;

import java.util.ArrayList;
import java.util.List;
import camp.nextstep.edu.missionutils.Console;

public class InputUtil {

    public List<Car> getCarNames() {
        String line = Console.readLine();
        String[] carNames = line.split("\\s*, \\s*");

        List<Car> cars = new ArrayList<>();

        for (String car : carNames) {
            String trimmedCar = car.trim();

            cars.add(new Car(trimmedCar));
        }
        return cars;
    }

    public int getCount() {
        int count = Integer.parseInt(Console.readLine());

        return count;
    }
}
