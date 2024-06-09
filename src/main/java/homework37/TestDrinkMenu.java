package homework37;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Scanner;


public class TestDrinkMenu {
    private static final Logger LOGGER = LoggerFactory.getLogger(TestDrinkMenu.class);

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] drinks = {"Кофе", "Чай", "Сок"};
        System.out.print("Введите номер напитка, который хотите приготовить (1-3): ");

        try {
            int drinkNumber = Integer.parseInt(scanner.nextLine()); // преобразование
            LOGGER.info("Приготовление " + drinks[drinkNumber - 1]);

        } catch (NumberFormatException exception) {
            LOGGER.error("Ошибка: Введено некорректное значение. Пожалуйста, введите целое число.");
            LOGGER.error(exception.getLocalizedMessage());

        } catch (ArrayIndexOutOfBoundsException exception) {
            LOGGER.error("Ошибка: Введенный номер выходит за пределы меню.");
            LOGGER.error(exception.getLocalizedMessage());

        } finally {
            System.out.println("Программа завершена.");
        }
    }
}
