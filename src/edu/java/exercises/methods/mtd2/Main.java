package src.edu.java.exercises.methods.mtd2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("------------------------------");
        System.out.println("Functions");
        System.out.println("1 -- Calculator");
        System.out.println("2 -- Loan");
        System.out.println("3 -- Message");
        System.out.println("------------------------------");
        int option = input.nextInt();

        while (option >= 1 && option <= 3) {
            if (option == 1) {
                System.out.println("------------------------------");
                System.out.println("Enter the first number: ");
                double number1 = input.nextDouble();
                System.out.println("Enter the second number");
                double number2 = input.nextDouble();
                System.out.println("------------------------------");
                System.out.println("Which operation? ");
                System.out.println("1 - Add");
                System.out.println("2 - Subtract");
                System.out.println("3 - Multiplication");
                System.out.println("4 - Division");
                int newOption = input.nextInt();
                switch (newOption) {
                    case 1:
                        Calculator.add(number1, number2);
                        break;
                    case 2:
                        Calculator.subtract(number1, number2);
                        break;
                    case 3:
                        Calculator.multiplication(number1, number2);
                        break;
                    case 4:
                        Calculator.division(number1, number2);
                        break;
                    default:
                        System.out.println("Invalid option !");
                        break;
                }
                System.out.println("------------------------------");
                System.out.println("Do you want to continue?");
                System.out.println("0 - No");
                System.out.println("1 - Yes");
                int exit = input.nextInt();
                if (exit == 0) {break;}
            }
            else if (option == 2) {
                System.out.println("------------------------------");
                System.out.println("What loan amount ?");
                double value = input.nextDouble();
                System.out.println("What number of installments: 2 or 3 ?");
                int installments = input.nextInt();
                System.out.println("------------------------------");
                Loan.calculateRate(value, installments);
                System.out.println("------------------------------");
                System.out.println("Do you want to continue?");
                System.out.println("0 - No");
                System.out.println("1 - Yes");
                int exit = input.nextInt();
                if (exit == 0) {break;}
            }
            else if (option == 3) {
                System.out.println("What time is it ?");
                int hour = input.nextInt();
                Message.message(hour);
                System.out.println("------------------------------");
                System.out.println("Do you want to continue?");
                System.out.println("0 - No");
                System.out.println("1 - Yes");
                int exit = input.nextInt();
                if (exit == 0) {break;}
            }
            else{
                System.out.println("Invalid option !");
                break;
            }
        }
        input.close();
    }

}

