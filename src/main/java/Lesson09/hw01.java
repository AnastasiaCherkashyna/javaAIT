package Lesson09;

import java.util.Scanner;

public class hw01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean repeat;
        String operation = "";

        while (repeat = true) {
            System.out.println("Введите тип операции: +, -, /, *.");
            operation = scanner.next();
            System.out.println("Введите первое число:");
            double numberOne = scanner.nextDouble();
            System.out.println("Введите второе число:");
            double numberTwo = scanner.nextDouble();
            double result;

            if (operation.equals("+")) {
                result = numberOne + numberTwo;
                System.out.println("Результат: " + result);
            } else if (operation.equals("-")) {
                result = numberOne - numberTwo;
                System.out.println("Результат: " + result);
            } else if (operation.equals("*")) {
                result = numberOne * numberTwo;
                System.out.println("Результат: " + result);
            } else if (operation.equals("/")) {
                if (numberTwo == 0) {
                    System.out.println("На ноль делить нельзя! Ошибка.");
                } else {
                    result = numberOne / numberTwo;
                    System.out.println("Результат: " + result);
                }
            }

            System.out.println("Хотите еще что-то посчитать? Да (1) или нет (0).");
            int answer;
            answer = scanner.nextInt();
            if (answer == 0) {
                repeat = false;
                System.out.println("Всем спасибо! Все свободны!");
                break;
            } else {
                repeat= true;
            }
            }
        }
        }



