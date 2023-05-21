package src.edu.java.methods.mtd2;

public class Loan {
    public static int get2x () {return 2;}
    public static int get3x () {return 3;}
    public static double getRate2x () {return 0.3;}
    public static double getRate3x () {return 0.45;}
    public static void calculateRate (double value, int installments) {
        if (installments == 2) {
            double endValue = value + (value * getRate2x());
            System.out.println("Final loan amount for 2 installments: $ " + endValue);
        }
        else if (installments == 3) {
            double endValue = value + (value * getRate3x());
            System.out.println("Final loan amount for 3 installments: $ " + endValue);
        }
        else {
            System.out.println("Number of installments not accepted !");
        }
    }
}
