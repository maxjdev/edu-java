package src.edu.java.exercises;
import java.util.Scanner;
public class MaxAndAverage {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int numb;
       int aux = 0;
       int bigger = 0;
       int average = 0;

       do {
           System.out.println("Number");
           numb = input.nextInt();
            aux++;
            average = (average + numb);
            if (numb > bigger) {
                bigger = numb;
            }

       } while (aux < 5);
        average = (average / 5);

        System.out.println("Bigger: " + bigger);
        System.out.println("Average: " + average);


    }
}
