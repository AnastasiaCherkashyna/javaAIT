package Lesson08;

import java.util.Scanner;

public class hw04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число:");
        int number = scanner.nextInt();
        int sum = 0;
        char heart = '♥';
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        System.out.println("Сумма цифр числа: " + sum + heart);
        scanner.close();

        System.out.println("---------2--------");
        System.out.println("Введите число");
        int inputNumber= scanner.nextInt();
        sum =0;
        int numberLength = String.valueOf(inputNumber).length();
        for(int i=numberLength-1; i>=0;i--){
            int digit = inputNumber/(int)Math.pow(10,i) % 10;
            System.out.print(digit);
            if(i!=0){
                System.out.print(" + ");
            }
            sum+=digit;
        }
        System.out.println(" = " + sum);

        System.out.println("---------3-------");
        System.out.println("Введите число ");
        inputNumber= scanner.nextInt();
        String numberString = String.valueOf(inputNumber);
        int result =  0;
        for (int i=0; i < numberString.length(); i ++){
            String digitString = String.valueOf(numberString.charAt(i));
            int digitInt = Integer.parseInt(digitString);
            result = result + digitInt;
        }
        System.out.println("Result = " + result);
    }

}

