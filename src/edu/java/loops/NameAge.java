package src.edu.java.loops;
import java.util.Scanner;
/*
Faça um programa que leia conjuntos de dois valores,
o primeiro representando o nome do aluno e o segundo representando a sua idade.
(Pare o programa inserindo o valor 0 no campo nome)
*/
public class NameAge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name;
        int age;

        do {
            System.out.println("What is your name ?");
            name = input.nextLine();
            System.out.println("How old are you ?");
            age = input.nextInt();
            input.nextLine();
        } while (!name.equals("0"));
        input.close();

    }
}
