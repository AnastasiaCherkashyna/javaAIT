package lesson14;

import java.util.Scanner;

public class HobbyHomework {
    public static void main(String[] args) {
        // First Array
        String[] hobbies = new String[4];
        hobbies[0] = "traveling";
        hobbies[1] = "reading books";
        hobbies[2] = "swimming";
        hobbies[3] = "playing piano";

        String[] hobbiesNew = new String[10];
        //hobbiesNew[0] = "Cooking";
        //hobbiesNew[1] = "Guitar";

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
        scanner.next();
        newHobbies(hobbies, hobbiesNew);
    }
        public static String [] newHobbies (String [] oldHobby, String [] newHobby) {

        String [] newHobbies = new String[oldHobby.length + newHobby.length];
        System.arraycopy(oldHobby, 0, newHobby, oldHobby.length, newHobby.length);
        return newHobbies;


    }

}
