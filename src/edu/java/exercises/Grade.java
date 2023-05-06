package src.edu.java.exercises;
import java.util.Scanner;
/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido
e continue pedindo
até que o usuário informe um valor válido.
*/
public class Grade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int grade;

        System.out.println("Enter your grade");
        grade = input.nextInt();

        while (grade < 0 || grade > 10) {
            System.out.println("Invalid note");
            grade = input.nextInt();
        }
    }
}
