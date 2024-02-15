package Lesson08;

import java.util.Scanner;

public class HW01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int odd = 0;

        while (odd <20) {
            if (odd % 2 == 0) {
            System.out.println(odd);
        }
            odd+=2;
            scanner.close();
    }}}
