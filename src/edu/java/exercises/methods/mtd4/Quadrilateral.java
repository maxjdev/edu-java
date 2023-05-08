package src.edu.java.exercises.methods.mtd4;

public class Quadrilateral {
    public static double area (double side) {
        return side * side;
    }
    public static double area (double side1, double side2){
        return side1 * side2;
    }
    public static double area (double baseBig, double baseMin, double height){
        return ((baseBig + baseMin) * height) / 2;
    }
}
