package Lesson08;

import java.util.Scanner;

public class task02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.println("Введите сколь угодно чисел, чтобы посчитать сумму (ноль для остановки)");
        int n = scanner.nextInt();

        while (n != 0) {
        sum += n;
        n = scanner.nextInt(); // этим кодом показываем, что цикл готов принимать еще и еще новые числа.
        } System.out.println("Ответ " + sum);
        scanner.close();
    }

    }

