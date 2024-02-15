package Lesson08;

import java.util.Scanner;

public class hw03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int res = 0;

        System.out.println("Введите число");
        number = scanner.nextInt();
        while (number != 0) {
            res += number;
            number--;
        }
        System.out.println("Ответ: " + res);
        scanner.close();

    }
}
