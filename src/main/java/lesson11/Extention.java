package lesson11;

import java.util.Scanner;

public class Extention {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите тип расширения:");
        String extention = scanner.next().toLowerCase().trim();

    String fileTyp = switch (extention) {
        case "pdf" -> "Документ";
        case " jpeg" -> "Изображение";
        case "excel" -> "Таблица";
        case "docs" -> "Текст";
        default -> "неверный формат";
    };
        System.out.println("Расширение: " + extention + " Тип файла: " + fileTyp);
scanner.close();
    }
}
