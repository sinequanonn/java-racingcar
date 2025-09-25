package racingcar.v1;

public class Race {
    private final Vehicles vehicles;

    public Race() {
        this.vehicles = new Cars();
    }

    public void playRace() {
        vehicles.makeVehiclesReady();
        vehicles.enterRace();
    }
}
