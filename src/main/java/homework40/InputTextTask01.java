package homework40;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputTextTask01 {
    private static final Logger LOGGER = LoggerFactory.getLogger(InputTextTask01.class);

    public static void main(String[] args) {

        InputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("text1.txt"); // указываем файл на считывание
            int[] charCount = new int[256]; // массив

            int character;
            while ((character = fileInputStream.read()) != -1) {
                charCount[character]++;
            }
            // перебираем массив и считаем сколько раз встречается тот или иной символ
            LOGGER.info("Количество вхождений символов:");
            for (int i = 0; i < charCount.length; i++) {
                if (charCount[i] > 0) {
                    System.out.println((char) i + "- " + charCount[i]);
                }
            }
            // ловим ошибки
        } catch (FileNotFoundException exception) {
            LOGGER.error(exception.getMessage());
        } catch (IOException exception) {
            LOGGER.error(exception.getMessage());
        }
        // отрабатываем ошибки при закрытии потока в finally
        finally {
            try {
                fileInputStream.close();
            } catch (IOException exception) {
                LOGGER.error(exception.getMessage());
            }
        }
    }
}
