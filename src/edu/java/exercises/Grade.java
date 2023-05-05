package src.edu.java.exercises;
import java.util.Scanner;
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
