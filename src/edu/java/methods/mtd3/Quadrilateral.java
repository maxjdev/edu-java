package src.edu.java.methods.mtd3;

public class Quadrilateral {
    public static void area (double side){
        System.out.println("The area of square is: " + side * side);
    }
    public static void area (double side1, double side2){
        System.out.println("The area of the rectangle is: " + side1 * side2);
    }
    public static void area (double baseBig, double baseMin, double height){
        System.out.println("The area of the trapezoid is: " + ((baseBig + baseMin) * height) /2 );
    }
    public static void area (float diagonal1, float diagonal2) {
        System.out.println("The area of the lozenge is: " + (diagonal1 * diagonal2) / 2);
    }
}
