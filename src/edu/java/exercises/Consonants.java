package src.edu.java.exercises;
import java.util.Arrays;
import java.util.Scanner;
public class Consonants {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] consonants = new String[6];
        String letter;
        int i = 0;
        int amountConsonants = 0;

        do {
            System.out.println("Letter: ");
            letter = input.nextLine();

            if (!(letter.equalsIgnoreCase("a") ||
                    letter.equalsIgnoreCase("e") ||
                    letter.equalsIgnoreCase("i") ||
                    letter.equalsIgnoreCase("o") ||
                    letter.equalsIgnoreCase("u"))) {
                consonants[i] = letter;
                amountConsonants++;
            }

            i++;
        } while (i < consonants.length);

        System.out.println("Amount of consoants: " + amountConsonants);
        System.out.println("Consonants: ");
        System.out.print(" | " + Arrays.toString(consonants) + " | ");
        /* solução abordada na aula
        *
        *  for (String consonant : consonants) {
        *    if (consonant != null) {
        *       System.out.println(consonants + " ");
        *    }
        *  }
        */

        input.close();
    }
}
