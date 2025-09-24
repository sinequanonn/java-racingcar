package racingcar.v1;

import camp.nextstep.edu.missionutils.Randoms;

public class Car {
    private String name;
    private int move;

    public Car(String name) {
        validate(name);
        this.name = name;
        this.move = 0;
    }

    public void playRandomMove() {
        int random = Randoms.pickNumberInRange(0, 9);

        if (random >= 4) {
            this.move += 1;
        }
    }

    public void printRound() {
        System.out.println(this.name + " : " + "-".repeat(move));
    }

    private void validate(String name) {
        if (name.length() >= 5) {
            throw new IllegalArgumentException();
        }
    }

    public String getName() {
        return name;
    }

    public boolean isMaxMove(int move) {
        return this.move == move;
    }

    public int getMove() {
        return move;
    }
}
