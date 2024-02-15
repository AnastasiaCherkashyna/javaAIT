package Lesson08;
// ФИБОНАЧЧИ!!!
import java.util.Scanner;

public class task04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt() - 2; // минус два, тк n1 и n2 сразу известны и их не надо учитывать уже
        int n1 = 0;
        int n2 = 1;
        System.out.println(n1);
        System.out.println(n2);

        int counter = 0;
        while (counter < n) {     // Второй варик  for (вместо while) (int counter = 0;counter < n; counter++)
            if (counter % 2 ==0) {
                n1 = n1 + n2;
                System.out.println(n1);
            } else {
                n2 = n1 + n2;
                System.out.println(n2);
            }
            counter++;
            scanner.close();
        }
    }

    // Второй варик  for (int counter = 0;counter < n; counter++)




}
