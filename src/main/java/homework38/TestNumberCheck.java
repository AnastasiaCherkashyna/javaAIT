package homework38;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class TestNumberCheck {
    private static final Logger LOGGER = LoggerFactory.getLogger(TestNumberCheck.class);

    public static void main(String[] args) {


        NumberChecker numberChecker = new NumberChecker();
        StringValidator stringValidator = new StringValidator();
        ExceptionPropagation exceptionPropagation = new ExceptionPropagation();

        try {
            numberChecker.checkNumber("123e");
            stringValidator.validateStringLength("555555");
            exceptionPropagation.method1();

        } catch (NumberFormatException | InvalidStringLengthException | IOException exception ) {
            LOGGER.error(exception.getMessage());
        } finally {
            LOGGER.info("Happy End");
        }

    }

}
