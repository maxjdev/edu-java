package src.edu.java.arrays;
import java.util.Random;
/*
*Faça um Programa que leia 20 números inteiros (entre 0 e 100) armazene-os num vetor.
*Ao final mostre os números e seus sucessores.
*/
public class RandomNumbers {
    public static void main(String[] args) {
        Random random = new Random();

        int[] randNumbers = new int[20];

        for (int i = 0; i < randNumbers.length; i++) {
            int number = random.nextInt(100);
            randNumbers[i] = number;
        }

        System.out.print("Random numbers: ");
        for (int number : randNumbers) {
            System.out.print(number + " ");
        }

        System.out.print("\nSuccessors of random numbers: ");
        for (int number : randNumbers) {
            System.out.print((number+1) + " ");
        }

        System.out.print("\nPredecessors of random numbers: ");
        for (int number : randNumbers) {
            System.out.print((number-1) + " ");
        }

    }
}
