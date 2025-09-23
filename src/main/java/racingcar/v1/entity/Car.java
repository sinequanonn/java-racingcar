package racingcar.v1.entity;

public class Car {
    private String name;
    private int move;

    public Car(String name) {
        this.name = name;
        this.move = 0;
    }

    public void addMove() {
        this.move += 1;
    }

    public void setMove(int move) {
        this.move = move;
    }

    public String getName() {
        return name;
    }

    public Integer getMove() {
        return move;
    }

    public void printMove() {
        System.out.print(name + " : ");
        System.out.println("-".repeat(this.move));
    }
}
