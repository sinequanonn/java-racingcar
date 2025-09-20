package racingcar;

import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;
import racingcar.entity.Car;


import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현

        List<Car> cars = new ArrayList<>();

        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉽표(,) 기준으로 구분)");
        String carNames = Console.readLine();
        System.out.println("시도할 횟수는 몇 회인가요?");
        int count = Integer.parseInt(Console.readLine());

        String[] carName = carNames.split(", ");

        for (String s : carName) {
            String name = String.valueOf(s);
            if (name.length() > 5) {
                throw new IllegalArgumentException("자동차 이름이 5자 이하여야 합니다.");
            }
            Car car = new Car(name, 0);
            cars.add(car);
        }

        System.out.println("실행 결과");

        for (int i = 0; i < count; i++) {
            for (Car car : cars) {
                int random = Randoms.pickNumberInRange(0, 9);

                if (random >= 4) {
                    car.setMove(car.getMove() + 1);
                }

                System.out.print(car.getName() + " : ");
                System.out.println("-".repeat(car.getMove()));
            }
            System.out.println();
        }

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

        // 3) 최종 출력
        System.out.println("최종 우승자 : " + String.join(", ", winners));

    }
}
