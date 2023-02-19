import java.util.Scanner;

public class WithholdingTaxCalculator {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter taxable income: ");
    double taxableIncome = input.nextDouble();

    double withholdingTax = 0;
    if (taxableIncome <= 20832) {
      withholdingTax = 0;
      System.out.println("Withholding tax: " + withholdingTax);
    } else if (taxableIncome <= 33332) {
      withholdingTax = 0.2 * (taxableIncome - 20833);
      System.out.println("Withholding tax: " + withholdingTax);
    } else if (taxableIncome <= 66666) {
      withholdingTax = 2500 + 0.25 * (taxableIncome - 33333);
      System.out.println("Withholding tax: " + withholdingTax);
    } else if (taxableIncome <= 166666) {
      withholdingTax = 10833 + 0.3 * (taxableIncome - 66667);
      System.out.println("Withholding tax: " + withholdingTax);
    } else if (taxableIncome <= 666666) {
      withholdingTax = 40833.33 + 0.32 * (taxableIncome - 166667);
      System.out.println("Withholding tax: " + withholdingTax);
    } else if (taxableIncome > 666666) {
      withholdingTax = 200833.33 + 0.35 * (taxableIncome - 666667);
      System.out.println("Withholding tax: " + withholdingTax);
    }
  }
}
