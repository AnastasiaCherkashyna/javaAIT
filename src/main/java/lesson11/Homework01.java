package lesson11;

public class Homework01 {
    public static void main(String[] args) {
        double area = calculateArea(5.9, 7.6);
        System.out.println("Area is " + area);
        double perimeter = calculatePerimeter(3, 9);
        System.out.println("Perimeter is " + perimeter);

    }
    public static double calculateArea(double numberOne, double numberTwo) {
        return numberOne * numberTwo;
    }
    public static double calculatePerimeter(double numberOne, double numberTwo) {
        return (numberOne + numberTwo) * 2;
    }
}

