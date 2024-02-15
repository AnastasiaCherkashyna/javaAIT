package Lesson08;

import java.util.Scanner;

public class homework_self {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Плохо, что мы дублируем код!!
        System.out.println("Введи 5"); // Плохо, что мы дублируем код!!

        int value = scanner.nextInt();
        while (value !=5) {
            System.out.println("Введи 5"); // Плохо, что мы дублируем код!!
            value = scanner.nextInt(); // Плохо, что мы дублируем код!!
        }
        System.out.println("Вы ввели 5");

        }



}
/*
int value = 0;
        while (value <=2) {
            System.out.println("Hello World!" + value);
            value++;
            int y = 10;

        int x = (y>5 ? (y*2) : (3*y));
        int z = (y == 10)
                ? (x > 5 ? 15 : 44)
                : 33;
                {System.out.println(z);}

 */
