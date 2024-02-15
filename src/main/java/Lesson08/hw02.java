package Lesson08;

import java.util.Scanner;


public class hw02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = 1;//change
        int b;//stable

        System.out.println("Введие второй множитель:");
        b = scanner.nextInt();
        while (a <= 10) {
            int res = a * b;
            System.out.println((a + " * " + b) + " = " + res);
            a++;
        }
        scanner.close();

    }
}

