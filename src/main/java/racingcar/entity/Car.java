package racingcar.entity;

public class Car {
    private String name;
    private Integer move;

    public Car(String name, Integer move) {
        this.name = name;
        this.move = move;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMove(Integer move) {
        this.move = move;
    }

    public String getName() {
        return name;
    }

    public Integer getMove() {
        return move;
    }
}
