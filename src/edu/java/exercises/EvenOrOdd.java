package src.edu.java.exercises;
import java.util.Scanner;
/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/
public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int aux = 0, amountEven = 0, amountOdd = 0;
        int numb;
        int amount;

        System.out.println("A Value : ");
        amount = input.nextInt();

        do {
            System.out.println("Number : ");
            numb = input.nextInt();
            aux++;

            if (numb % 2 == 0) {
                amountEven++;
            }
            else {
                amountOdd++;
            }

        } while (aux < amount);

        System.out.println("Odd : " + amountOdd);
        System.out.println("Even : " + amountEven);

    }
}
