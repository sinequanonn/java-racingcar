package racingcar.v1.util;

import racingcar.v1.entity.Car;

import java.util.ArrayList;
import java.util.List;
import camp.nextstep.edu.missionutils.Console;
import racingcar.v1.validation.InputValidation;

public class InputUtil {

    public List<Car> getCarNames() {
        String line = Console.readLine();
        String[] carNames = line.split("\\s*, \\s*");

        List<Car> cars = new ArrayList<>();

        for (String car : carNames) {
            String trimmedCar = car.trim();
            InputValidation.validateCarName(trimmedCar);
            cars.add(new Car(trimmedCar));
        }
        return cars;
    }

    public int getCount() {
        int count = Integer.parseInt(Console.readLine());

        InputValidation.validateCount(count);

        return count;
    }
}
