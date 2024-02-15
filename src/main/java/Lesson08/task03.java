package Lesson08;

import java.util.Scanner;


public class task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        do {
            System.out.println(" add natur number");
            n = scanner.nextInt();
        } while (n <= 0);
        System.out.println("Thank you!");
        scanner.close();
    }
}
