package Lesson08;

import java.util.Scanner;

public class task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextDouble();

        System.out.println(number % 2 == 0 ? "Четное" : "Нечетное");
        System.out.println(number % 1 == 0 ? "Целое" : "Дробное");
        System.out.println(number > 0 ? "Positiv" : (number < 0 ? "Negativ" : "Null"));
        System.out.println(number >= 0 && number <= 9 && number % 1 == 0  ? "Цифра" : "Число");
        scanner.close();
        }

    }

