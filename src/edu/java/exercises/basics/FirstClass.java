package src.edu.java.exercises.basics;

public class FirstClass {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("---------------------------------------");

        byte one = 127;
        short two = 32767;
        int three = 2147483647;
        long four = 123456789012345L;
        float five = 3.14159f;
        double six = 1.7976931348623157;
        boolean seven;
        char eight = 'M';

        int addition = one + two;
        System.out.println("The result of the addition is : " + addition);
        System.out.println("------------------------");

        long subtraction = four - three;
        System.out.println("The result of the subtraction is : " + subtraction);
        System.out.println("------------------------");

        double multiplication = five * six;
        System.out.println("The result of the multiplication is : " + multiplication);
        System.out.println("------------------------");

        int division = three / two;
        System.out.println("The result of the division is : " + division);
        System.out.println("------------------------");

        if (three % 2 == 0) {
            seven = true;
        }
        else {
            seven = false;
        }
        System.out.println("Is 2147483647 divided by 2 an even number? R: " + seven);
        System.out.println("------------------------");

        int increment = 0;
        while (increment <= 5 ) {
            System.out.println("Increment = " + increment);
            increment++;
        }
        int decrement = 5;
        while (decrement >= 0) {
            System.out.println("Decrement = " + decrement);
            decrement--;
        }
        int tmp;
        if (increment == 5 && decrement == 0) {
           tmp = decrement;
           decrement = increment;
           increment = tmp;
        }
        System.out.println("------------------------");

        tmp = 4;
        if (tmp < 0 || tmp > 0) {
            if (tmp > 0) {
                System.out.println("This number is positive");
            }
            else {
                System.out.println("This number is negative");
            }
        }
        else {
            System.out.println("This number is 0");
        }
        System.out.println("------------------------");

        if (eight == 'M' || eight == 'F') {
            if (eight == 'M') {
                System.out.println("Gender: Male");
            } else if (eight == 'F') {
                System.out.println("Gender: Female");
            }
        }
        else {
            System.out.println("Error invalid gender");
        }
    }
}
