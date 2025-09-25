package racingcar.v1;

public class CarRacingApplication {

    private Race race ;

    public CarRacingApplication() {
        this.race = new Race();
    }

    public void start() {
        race.playRace();
    }

}
