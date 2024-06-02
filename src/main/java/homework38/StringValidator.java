package homework38;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StringValidator {
    private static final Logger LOGGER = LoggerFactory.getLogger(StringValidator.class);

    public void validateStringLength(String input) throws InvalidStringLengthException {
        LOGGER.info("Input is {}", input);
        if (input.length() < 5) {
            LOGGER.error("Length < 5");
            throw new InvalidStringLengthException("Length < 5");
        } else {
            LOGGER.info("Program is ended.");
        }
    }
}
