package src.edu.java.exercises.methods.mtd2;

public class Calculator {
    public static void add (double number1, double number2) {
        double result = (number1 + number2);
        System.out.println("The result of the sum of : " + number1 + " + " + number2 + " = " + result);
    }

    public static void subtract (double number1, double number2) {
        double result = (number1 - number2);
        System.out.println("The result of subtracting : " + number1 + " - " + number2 + " = " + result);
    }

    public static void multiplication (double number1, double number2) {
        double result = (number1 * number2);
        System.out.println("The result of multiplying : " + number1 + " * " + number2 + " = " + result);
    }

    public static void division (double number1, double number2) {
        double result = (number1 / number2);
        System.out.println("The result of dividing : " + number1 + " / " + number2 + " = " + result);
    }
}
