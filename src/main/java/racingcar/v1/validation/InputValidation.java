package racingcar.v1.validation;

public class InputValidation {

    public static void validateCarName(String carName) {
        if (carName.length() > 5) {
            throw new IllegalArgumentException("자동차 이름은 5글자 이하이어야 합니다.");
        }
    }

    public static void validateCount(int count) {
        if (count < 0) {
            throw new IllegalArgumentException("양수이어야 합니다.");
        }
    }
}
