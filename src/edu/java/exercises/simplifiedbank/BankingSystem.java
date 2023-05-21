package src.edu.java.exercises.simplifiedbank;

public class BankingSystem {
    static double balance = 300;

    public static double seeBalance () {
        //Visualizar saldo

        return balance;
    }
    public static double deposit (double value) {
        //Soma valor de depósito ao saldo

        balance = (balance + value);
        return balance;
    }
    public static double withdraw (double value) {
        //Subtrai valor de saque do saldo

        balance = (balance - value);
        return balance;
    }
}