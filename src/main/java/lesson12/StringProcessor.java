package lesson12;

/*
Разработайте класс StringProcessor, который будет предоставлять статические методы для работы со строками:

Метод reverseString, который принимает строку и возвращает её в перевёрнутом виде.
Метод isPalindrome, который проверяет, является ли переданное слово палиндромом
(читается одинаково в обоих направлениях). Метод должен возвращать булево значение.
 */

public class StringProcessor {
    public static void main(String[] args) {
        String line = reverseString("Sehr geehrte Damen und Herren");
        boolean isPal = isPalindrome("abcba");
        System.out.println(isPal);
    }

    public static String reverseString(String text) {
        StringBuilder sb = new StringBuilder(text);
        sb.reverse();
        String reverseLine = sb.toString();
        System.out.println(reverseLine);
        return reverseLine;

    }

    public static boolean isPalindrome(String word) {
        int i = 0;
        int j = word.length() - 1;
        while (i < j) {
            if (word.charAt(i) != word.charAt(j)) {
                System.out.println("Это не палиндром.");
                return false;
            } else {
                break;
            }
        }
        return true;
    }
}
