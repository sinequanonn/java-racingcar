package racingcar.v2.util;

import camp.nextstep.edu.missionutils.Console;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import racingcar.v2.Car;

import java.io.ByteArrayInputStream;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class InputUtilTest {

    InputUtil inputUtil = new InputUtil();

    @BeforeEach
    @AfterEach
    public void set() {
        Console.close();
    }

    @Test
    void 자동차_리스트_생성() {
        // given
        String input = "pobi, jun, won\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        // when
        List<String> carNames = inputUtil.getCarNames();

        // then
        assertThat(carNames).hasSize(3);
        assertThat(carNames.get(0)).isEqualTo("pobi");
        assertThat(carNames.get(1)).isEqualTo("jun");
        assertThat(carNames.get(2)).isEqualTo("won");
    }

    @Test
    void 자동차_이름_예외처리() {
        // given
        String input = "123456, jun, won\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        // when
        assertThatThrownBy(() -> inputUtil.getCarNames())
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("자동차 이름은 5글자 이하이어야 합니다.");
    }


}
