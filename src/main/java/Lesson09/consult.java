package Lesson09;
/* проверка на символы, например введены ли только цифры или цифры + буквы
это можно делать тольок в STRING!!! Поэтому переводим int в String. И дальше отщипываем от числа
по кусочку и проверяем цифра это или нет.
 */

import java.util.Scanner;

public class consult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean validInput = false;
        int number;

        while (!validInput) {

            System.out.println("Введите целое число от 0 до 100: ");
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                validInput = true;
            } else {
                System.out.println("Ошибка: Введено не верное значение.");
                scanner.next();
            }

        }// Закрытие контроля ввода 1
    }

}
