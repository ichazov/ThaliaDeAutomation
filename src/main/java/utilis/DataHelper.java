package utilis;

import org.apache.commons.lang3.*;

import java.util.*;

public class DataHelper {

    private static final Random RANDOM = new Random();

    private DataHelper() {
    }

    public static String generateEmailAddress(int length) {
        return RandomStringUtils.randomAlphanumeric(length)
                .concat("@mailsac.com")
                .toLowerCase();
    }

    public static String generatePassword(int length) {
        return RandomStringUtils.randomAlphanumeric(length - 1)
                .concat("!");
    }

    private static String randomIntGenerator(int origin, int bound) {
        return RANDOM.ints(origin, bound)
                .findFirst()
                .toString();
    }

    public static String generateRandomDay() {
       return randomIntGenerator(1, 28);
    }

    public static String generateRandomMonth() {
       return randomIntGenerator(1, 12);
    }

    public static String generateRandomYear() {
       return randomIntGenerator(1950, 2007);
    }
}
