package Lesson08;

import java.util.Scanner;

public class task06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean isPrime = true;

        for (int i = 2; i <= number / 2 + 1; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime) {
            System.out.println("Prime");
        } else {
            System.out.println("not Prime");
        }
        scanner.close();
    }
}
