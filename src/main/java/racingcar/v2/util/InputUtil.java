package racingcar.v2.util;


import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.List;

public class InputUtil {

    public List<String> getCarNames() {
        String input = Console.readLine();
        List<String> cars = new ArrayList<>();

        String[] carNames = input.split(",");
        for (String carName : carNames) {
            carName = carName.trim();
            ValidateUtil.validate(carName);
            cars.add(carName);
        }
        return cars;
    }

    public int getRound() {
        String input = Console.readLine();

        int round = Integer.parseInt(input);
        ValidateUtil.validate(round);
        return round;
    }
}
