package homework38;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class NumberChecker {
    private static final Logger LOGGER = LoggerFactory.getLogger(NumberChecker.class);

    public static void checkNumber(String number) {
        LOGGER.info("Get number {}", number);
        try {
            int result = Integer.parseInt(number);
            LOGGER.info("Result {}", result);
        } catch (NumberFormatException exception) {
            LOGGER.error(exception.getLocalizedMessage());
            throw new NumberFormatException("Wrong input");
        }
        finally {
            LOGGER.info("Program is ended");
        }
    }
}
