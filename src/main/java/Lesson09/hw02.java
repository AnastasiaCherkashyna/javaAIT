package Lesson09;

import java.util.Scanner;

public class hw02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = (int) (1 + Math.random()*99);
        int attempt = 2 ;
        int variant=0;

        System.out.println("Мы загадали число от 1 до 100. Угадаете какое? Поехали!");
        while (variant != number) {
        variant = scanner.nextInt();

            if (variant < number) {
                System.out.println("Недобор. \uD83E\uDD37 Попытка " + attempt + ". Введите число:");
            } else if (variant > number) {
                System.out.println("Перебор. \uD83E\uDD37 Попытка " + attempt + ". Введите число:");
            } else {
                System.out.println("Поздравляем! \uD83C\uDF89 Вы угадали с попытки номер " + attempt);
            }
            attempt++;

        }
        }

    }

