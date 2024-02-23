package lesson11;

import java.util.Scanner;

public class CarDataHomework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите марку авто из предлагаемых: bmw, toyota, audi");
        String carBrand = scanner.next().toLowerCase().trim();
        String countryOfOrigin = "";
        String carInfo = "";
        System.out.println("Введите 4х значный год выпуска авто");

        while (!scanner.hasNextInt()) {
                System.out.println("Введите число корректно!");
                scanner.next();
            }
            int year = scanner.nextInt();
            switch (carBrand.toLowerCase().trim()) {
                    case "bmw":
                        countryOfOrigin = "Germany";
                        if (year > 2000) {
                            carInfo = "BMW обновили дизайн";
                        } else {
                            carInfo = "До 2000 года выпускались ретро-модели с большим потрбелением топлива.";
                        }
                        break;
                    case "toyota":
                        countryOfOrigin = "Japan";
                        if (year > 2012) {
                            carInfo = "Обновленный модельный ряд. Высокая надежность";
                        } else {
                            carInfo = "Старые модели с дорогими запяастями.";
                        }
                        break;
                    case "audi":
                        countryOfOrigin = "Germany";
                        if (year >= 2018) {
                            carInfo = "Появилося первый Audi E-tron. Началась эпоха электроавто.";
                        } else {
                            carInfo = "Представлены только дизельные и бензиновые авто.";
                        }
                        break;
                    default:
                        countryOfOrigin = "Неизвестно";
                        carInfo = "не найдено";
                        break;
                }
                carDataPrint(countryOfOrigin, carInfo);
            scanner.close();
        }
        public static void carDataPrint (String country, String info) {
        System.out.println("Страна производитель: " + country);
       System.out.println("Инфо о марке авто: " + info);
    }}

