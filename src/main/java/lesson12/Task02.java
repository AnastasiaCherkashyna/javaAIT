package lesson12;

import java.util.Enumeration;

public class Task02 {
    public static void main(String[] args) {
        boolean result = isEven(90);
        System.out.println(result);
        
    }
    public static boolean isEven (int number) {
            return number % 2 == 0;
        }
    }

