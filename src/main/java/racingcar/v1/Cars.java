package racingcar.v1;

import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.List;

public class Cars implements Vehicles {
    private List<Car> cars = new ArrayList<>();

    @Override
    public void makeVehiclesReady() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉽표(,) 기준으로 구분)");
        String carInput = Console.readLine();
        List<String> carNames = getCarNames(carInput);
        for (String carName : carNames) {
            cars.add(new Car(carName));
        }
    }

    @Override
    public void enterRace() {
        Rounds round = new Rounds();
        round.roundAllPlay(cars);
    }

    private List<String> getCarNames(String input) {
        List<String> carNames = new ArrayList<>();
        String[] splitInput = input.split(", ");

        for (String name : splitInput) {
            carNames.add(name);
        }
        return carNames;
    }

    public List<Car> getCars() {
        return cars;
    }
}
