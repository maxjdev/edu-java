package src.edu.java.exercises.methods.mtd4;

public class Main {
    public static void main(String[] args) {

        System.out.println("-----------------------");
        System.out.println("Overload + Return exercise");

        double areaSquare = Quadrilateral.area(3);
        System.out.println("Square area: " + areaSquare);

        double areaRectangle = Quadrilateral.area(4d, 3d);
        System.out.println("Rectangle area: " + areaRectangle);

        double areaTrapezoid = Quadrilateral.area(4, 4, 5);
        System.out.println("Trapezoid area: " + areaTrapezoid);

        System.out.println("-----------------------");
    }
}
