package src.edu.java.exercises;
import java.util.Scanner;
/*
Faça um programa que informe o mes correspondente ao numero
ferias nos meses de janeiro e julho
 */
public class Months {
    static int month;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the month number: ");
        month = scanner.nextInt();
        scanner.close();

        monthsIf();
    }
    public static void monthsIf () {
            if ((month >= 1) && (month <= 12)) {
                if (month == 1){
                    System.out.println("number 1 corresponds to the month of January");
                }
                else if (month == 2){
                    System.out.println("number 2 corresponds to the month of February");
                }
                else if (month == 3){
                    System.out.println("number 3 corresponds to the month of March");
                }
                else if (month == 4){
                    System.out.println("number 4 corresponds to the month of April");
                }
                else if (month == 5){
                    System.out.println("number 5 corresponds to the month of May");
                }
                else if (month == 6){
                    System.out.println("number 6 corresponds to the month of June");
                }
                else if (month == 7){
                    System.out.println("number 7 corresponds to the month of July");
                }
                else if (month == 8){
                    System.out.println("number 8 corresponds to the month of August");
                }
                else if (month == 9){
                    System.out.println("number 9 corresponds to the month of September");
                }
                else if (month == 10){
                    System.out.println("number 10 corresponds to the month of October");
                }
                else if (month == 11){
                    System.out.println("number 11 corresponds to the month of November");
                }
                else {
                    System.out.println("number 12 corresponds to the month of December");
                }
            }
            else {
                System.out.println("Invalid month");
            }
            if ((month == 1) || (month == 7)) {
            System.out.println("Vacation");
            }
    }
}
