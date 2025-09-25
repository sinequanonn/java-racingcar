package racingcar.v1;

import camp.nextstep.edu.missionutils.Console;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class CarsTest {

    Cars cars = new Cars();

    @BeforeEach
    @AfterEach
    void set() {
        Console.close();
    }

    @Test
    void 자동차_리스트_생성() {
        // given
        String input = "pobi, jun, won\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        List<Car> cars1 = cars.getCars();
        cars.makeCarsReady();
        assertThat(cars1.get(0).getName()).isEqualTo("pobi");
        assertThat(cars1.get(1).getName()).isEqualTo("jun");
        assertThat(cars1.get(2).getName()).isEqualTo("won");
    }

    @Test
    void 자동차_리스트_생성_예외처리() {
        String input = "pobi123, jun, won\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        List<Car> cars1 = cars.getCars();
        assertThatThrownBy(() -> cars.makeCarsReady())
                .isInstanceOf(IllegalArgumentException.class);
    }


}
