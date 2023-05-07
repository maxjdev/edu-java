package src.edu.java.exercises.loops;
import java.util.Scanner;
/*
* Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
* Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
*/
public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int multiplication = 1;
        int factorial;

        System.out.println("Factorial: ");
        factorial = input.nextInt();

        System.out.print(factorial +"! = ");
        for(int i = factorial ; i >= 1 ; i --) {
            multiplication = multiplication * i;
        }

        System.out.println(multiplication);
    }
}
