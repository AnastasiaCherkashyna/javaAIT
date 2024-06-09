package homework40;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputTextTask02 {
    private static final Logger LOGGER = LoggerFactory.getLogger(InputTextTask02.class);

    public static void main(String[] args) {

        // cоздаем стринги и инициализируем текстовые файлы
        String file1Path = "text1.txt";
        String file2Path = "text2.txt";

        try {

            InputStream file1 = new FileInputStream(file1Path);
            InputStream file2 = new FileInputStream(file2Path);

           // создаем переменную типа Char для каждого текстового файла, чтобы сравнить их
            int char1;
            int char2;
            int position = 1; // счетчик позиции. Нужен для идентификации номера позиции расхождения
            boolean areFilesIdentical = true;

            // пока сравнение успешное, цикл продолжается. Как только найдено расхождение - цикл прерывается
            while (true) {
                char1 = file1.read();
                char2 = file2.read();

                if (char1 != char2) {
                    areFilesIdentical = false;
                    break;
                }
                position++;
            }

            file1.close();
            file2.close();

            if (areFilesIdentical) {
                System.out.println("Файлы идентичны.");
            } else {
                System.out.println("Файлы не идентичны. Первое различие на позиции: " + position);
            }

        } catch (FileNotFoundException exception) {
            LOGGER.error(exception.getMessage());
        } catch (IOException exception) {
            LOGGER.error(exception.getMessage());
        }

        finally {
                LOGGER.info("Программа завершена");
            }
        }
    }
