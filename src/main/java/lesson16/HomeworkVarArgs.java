package lesson16;

public class HomeworkVarArgs {
    public static void main(String[] args) {
        sum(50, 30, 50, 20);
        statistic(80, 30.5, 20,5);

    }

    public static double sum(int... number) {
        int sumElement = 0;
        for (int i = 0; i < number.length; i++) {
            if (number[i] < 0) {
                System.out.println("Введено отрицательное значение!");
            } else {
                sumElement += number[i];
            }
        }
        System.out.println("Сумма всех элементов: " + sumElement);
        return 0;
    }

    public static void statistic (double... number) {
        double maxNumber = number[0];
        double minNumber = number[0];
        for (double num : number) {
            if (num > maxNumber) {
                maxNumber = num;
            } else if (num < minNumber){
                minNumber = num;
            }
        }
        double average = sum(number) / number.length;
        System.out.println("Среднее значение: " + average);
        System.out.println("Максимальное значение: " + maxNumber);
        System.out.println("Минимальное значение: " + minNumber);
    }

    public static double sum (double... number) {
        double sumElement = 0;
        for (double element : number) {
            if (element < 0) {
                System.out.println("Введено отрицательное значение!");
            } else {
                sumElement += element;
            }
        }
        return sumElement;
    }
}

