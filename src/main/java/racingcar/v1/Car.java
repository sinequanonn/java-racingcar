package racingcar.v1;

import camp.nextstep.edu.missionutils.Randoms;

public class Car implements Vehicle {
    private String name;
    private int move;

    public Car(String name) {
        validate(name);
        this.name = name;
        this.move = 0;
    }

    @Override
    public void playRandomMove() {
        int random = Randoms.pickNumberInRange(0, 9);

        if (random >= 4) {
            this.move += 1;
        }
    }

    private void validate(String name) {
        if (name.length() > 5) {
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
