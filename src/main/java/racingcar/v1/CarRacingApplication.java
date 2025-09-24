package racingcar.v1;

public class CarRacingApplication {

    private Cars cars;

    public CarRacingApplication(Cars cars) {
        this.cars = cars;
    }

    public void start() {
        cars.playRace();
    }

}
