package src.edu.java.arrays;
/*
* crie um vetor de 6 posições
* e exiba na ordem reversa
* */
public class ReverseOrder {
    public static void main(String[] args) {
        int[] vector = {-2, -1, 0, 1, 2};
        int i = 0;

        System.out.print("Vector: ");
        while (i <= vector.length -1) {
            System.out.print(" | " + vector[i] + " | ");
            i++;
        }

        System.out.print("\nInverse vector: ");
        for (int i1 = vector.length -1; i1 >= 0; i1--) {
            System.out.print(" | " + vector[i1] + " | ");
        }

    }
}
