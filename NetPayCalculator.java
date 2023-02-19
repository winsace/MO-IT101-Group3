import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NetPayCalculator {
  public static void main(String[] args) {
    double monthlyRate = 0;
    try {
      Scanner input = new Scanner(new File("monthly_rate.txt"));
      monthlyRate = input.nextDouble();
    } catch (FileNotFoundException e) {
      System.out.println("Error: File not found");
      System.exit(0);
    }

    System.out.println("Monthly rate: " + monthlyRate);

    double sssContribution = 0;
    if (monthlyRate < 3250) {
      sssContribution = 135.00;
    } else if (monthlyRate >= 3250 && monthlyRate <= 3749) {
      sssContribution = 157.50;
    } else if (monthlyRate >= 3750 && monthlyRate <= 4249) {
      sssContribution = 180.00;
    } else if (monthlyRate >= 4250 && monthlyRate <= 4749) {
      sssContribution = 202.50;
    } else if (monthlyRate >= 4750 && monthlyRate <= 5249) {
      sssContribution = 225.00;
    }
    System.out.println("SSS Contribution: " + sssContribution);

    double philhealthContribution = 0;
    if (monthlyRate <= 10000) {
      philhealthContribution = monthlyRate * 0.03;
    } else if (monthlyRate > 10000 && monthlyRate <= 59999.99) {
      philhealthContribution = monthlyRate * 0.03;
    } else if (monthlyRate >= 60000) {
      philhealthContribution = 1800;
    }
    System.out.println("PhilHealth Contribution: " + philhealthContribution);

    double pagibigContribution = 0;
    if (monthlyRate >= 1000 && monthlyRate <= 1500) {
      pagibigContribution = monthlyRate * 0.01;
    } else if (monthlyRate > 1500) {
      pagibigContribution = monthlyRate * 0.02;
    }
    System.out.println("Pagibig Contribution: " + pagibigContribution);

    double totalDeduction = sssContribution + philhealthContribution + pagibigContribution;
    System.out.println("Total Deduction: " + totalDeduction);

    double taxableIncome = monthlyRate - totalDeduction;
    System.out.println("Taxable Income: " + taxableIncome);

    double withholdingTax = 0;
    if (taxableIncome <= 20833) {
      withholdingTax = 0;
    } else if (taxableIncome > 20833 && taxableIncome <= 33333) {
      withholdingTax = (taxableIncome - 20833) * 0.2;
    }
    System.out.println("Withholding Tax: " + withholdingTax);

    double netPay = taxableIncome - withholdingTax;
    System.out.println("Net Pay: " + netPay);
  }
}

