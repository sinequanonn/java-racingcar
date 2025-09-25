package racingcar.v1;

import camp.nextstep.edu.missionutils.Console;

import java.util.List;

public class Rounds {

    private int round;

    public Rounds() {
        this.round = createRound();
    }

    public void roundAllPlay(List<Car> cars) {
        for (int i = 0; i < this.round; i++) {
            playOneGame(cars);
            ViewRound.printOneRoundResult(cars);
        }

        Winner winner = new Winner();
        winner.isWinner(cars);
    }

    private void playOneGame(List<Car> cars) {
        for (Car car : cars) {
            car.playRandomMove();
        }
    }

    private int createRound() {
        System.out.println("시도할 횟수는 몇 회인가요?");
        String countInput = Console.readLine();
        int round = Integer.parseInt(countInput);
        validate(round);

        return round;
    }

    private void validate(int round) {
        if (round < 0) {
            throw new IllegalArgumentException();
        }
    }
}
