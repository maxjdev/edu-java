package src.edu.java.exercises.loops;
import java.util.Scanner;
/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/
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
       input.close();
        average = (average / 5);

        System.out.println("Bigger: " + bigger);
        System.out.println("Average: " + average);


    }
}
