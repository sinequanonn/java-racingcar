package racingcar.v2.util;

public class ValidateUtil {

    public static void validate(String s) {
        if (s.length() > 5) {
            throw new IllegalArgumentException("자동차 이름은 5글자 이하이어야 합니다.");
        }
    }

    public static void validate(int round) {
        if (round < 0) {
            throw new IllegalArgumentException("양수이어야 합니다.");
        }
    }
}
