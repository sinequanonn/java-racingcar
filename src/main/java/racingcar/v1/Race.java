package racingcar.v1;

public class Race {
    private Cars cars;

    public Race() {
        this.cars = new Cars();
    }

    public void playRace() {
        cars.makeCarsReady();
        cars.enterRace();
    }
}
