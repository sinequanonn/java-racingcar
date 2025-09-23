package racingcar.v1.util;

import camp.nextstep.edu.missionutils.Console;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import racingcar.v1.entity.Car;

import java.io.ByteArrayInputStream;
import java.util.List;

import static org.assertj.core.api.Assertions.*;


class InputUtilTest {

    private final InputUtil inputUtil = new InputUtil();

    @BeforeEach
    @AfterEach
    void setUp() {
        Console.close();
    }
    @Test
    void 자동차_이름_정상입력() {
        // given
        String input = "pobi, jun, won\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        // when
        List<Car> cars = inputUtil.getCarNames();

        // then
        assertThat(cars).hasSize(3);
        assertThat(cars.get(0).getName()).isEqualTo("pobi");
        assertThat(cars.get(1).getName()).isEqualTo("jun");
        assertThat(cars.get(2).getName()).isEqualTo("won");
    }

    @Test
    void 자동차_이름_비정상입력() {
        // given
        String input = "pobi, jun, wonwon\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        assertThatThrownBy(() -> inputUtil.getCarNames())
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("자동차 이름은 5글자 이하이어야 합니다.");
    }

    @Test
    void 횟수_정상입력() {
        //given
        String input = "5\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        // when
        int count = inputUtil.getCount();

        // then
        assertThat(count).isEqualTo(5);
    }

}
