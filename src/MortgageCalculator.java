
import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {

public static void main (String [ ] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Loan Amount:");
        double principal = scanner.nextDouble();

        System.out.print("Anual Interest Rate:");
        double rate = scanner.nextDouble();
        double rateResult = rate / 100.0;
        double rateMonths = rateResult / 12.0;

        System.out.print("Period (Years):");
        int years = scanner.nextInt();
        years = years * 12;


        double payments = (rateMonths * principal) / (1 - Math.pow(1 + rateMonths, -years));
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(payments);
        System.out.println("Monthly Payments:"+ result);


}

        }