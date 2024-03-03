package lesson12;

public class Homework01 {
    public static void main(String[] args) {
        double area = calculateArea(0, 7.6);
        System.out.println("Area is " + area);
        double perimeter = calculatePerimeter(0, 9);
        System.out.println("Perimeter is " + perimeter);

    }
    public static double calculateArea(double numberOne, double numberTwo) {
        if (numberOne <= 0 || numberTwo <= 0) {
            System.out.println("ERROR!");
            return  -1;
        }
        return numberOne * numberTwo;
    }
    public static double calculatePerimeter(double numberOne, double numberTwo) {
        if (numberOne <= 0 || numberTwo <= 0) {
            System.out.println("ERROR!");
            return  -1; }
        return (numberOne + numberTwo) * 2;
    }
}

