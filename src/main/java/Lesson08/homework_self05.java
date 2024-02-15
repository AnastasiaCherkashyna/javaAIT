package Lesson08;

public class homework_self05 {
    public static void main(String[] args) {

        String star = "";
        String next = "";
        for (int i = 1; i <= 5; i++) {

            star += "*";
            next += star + "\n";

            System.out.println(next);

        }
    }
}
