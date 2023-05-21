package src.edu.java.exercises.simplifiedbank;

import java.util.Scanner;

public class User {
    // Exercicio de algoritmo de saldo, deposito e saque usando metodos, condicionais e repetições
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean end = false;
        double aux;


        while (!end) {
            //Loop enquanto end for "false"
            int opt = menu();
            if (opt == 0) {
                end = true;
            }
            else if (opt == 1) {
                //Operação de visualização de saldo
                System.out.println("--------------------------------------------------");
                System.out.println("Your balance is: " + BankingSystem.seeBalance());
            }
            else if (opt == 2) {
                //Operação de deposito
                System.out.println("--------------------------------------------------");
                System.out.println("What amount do you want to deposit ? ");
                aux = input.nextDouble();
                System.out.println("Your new balance is: " + BankingSystem.deposit(aux));
            }
            else if (opt == 3) {
                //Operação de saque
                System.out.println("--------------------------------------------------");
                System.out.println("What amount do you want to withdraw ? ");
                aux = input.nextDouble();
                if (aux <= BankingSystem.balance) {
                    System.out.println("Your new balance is: " + BankingSystem.withdraw(aux));
                }
                else {
                    //Saldo invalido
                    System.out.println("--------------------------------------------------");
                    System.out.println("Insufficient funds");
                }
            }
            else {
                //Exibido caso opção seja invalida
                System.out.println("--------------------------------------------------");
                System.out.println("Error: Invalid option !");
            }


        }
        input.close();
    }

    public static int menu () {
        // Metodo para seleção de opções no menu
        Scanner input = new Scanner(System.in);
        System.out.println("--------------------------------------------------");
        System.out.println(" SC Bank - How can I help you ? ");
        System.out.println("--------------------------------------------------");
        System.out.println("0 - End ");
        System.out.println("1 - Balance ");
        System.out.println("2 - Deposit ");
        System.out.println("3 - Withdraw ");
        System.out.println("--------------------------------------------------");
        System.out.print("");

        return input.nextInt();
    }

}
