package lesson14;

import java.util.Scanner;

public class HobbyHomework {

    private static String[] hobbies = {"traveling", "reading", "swiming", "playing piano"};
    private static int[] ratings = {1, 2, 4, 3};


    public static void main(String[] args) {

        // Task 01
        for (String hobby : hobbies) {
            System.out.println(hobby);
        }
        System.out.println("----------2----------");
        // Task 02
        for (int i = 0; i < hobbies.length; i++) {
            if (hobbies[i].equals("swimming")) {
                System.out.println(hobbies[i]);
            }
        }
        System.out.println("-----------3----------");
        // Task 03
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер любимого хобби от 1 до 4");
        int number = scanner.nextInt();

        if (number < 1 || number > 4) {
            System.out.println("Вы ввели неверное число. Повторите еще раз:");
            scanner.nextInt();
        } else {
            System.out.println("Выбранное хобби: " + hobbies[number - 1]);
        }

        System.out.println("---------4-------------");


        // Task 04
        System.out.println("Введите новое хобби: ");
        String newHobby = scanner.next();
        addHobby(newHobby);
        System.out.println(hobbies);
        scanner.close();

        // Task05 Raiting
        addHobby("Flying");
        showRating();

    }

    public static void addHobby(String newHobby) {
        String[] hobbiesNew = new String[hobbies.length + 1];
        System.arraycopy(hobbies, 0, hobbiesNew, 0, hobbies.length);
        hobbiesNew[hobbiesNew.length - 1] = newHobby;
        hobbies = hobbiesNew;
    }

    public static void showRating() {
        if (hobbies.length != ratings.length) {
            System.out.println("Error!");
        } else {
            for (int i = 0; i < hobbies.length; i++) {
                String hobby = hobbies[i];
                int raiting = ratings[i];
                System.out.println(String.format("Hobby %s rating %d", hobby, raiting));
            }
        }
    }
}





