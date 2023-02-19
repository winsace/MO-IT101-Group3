import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


//please replace monthly_rate.txt with the file available including directory to pull.
//note change to backslash as getting error for escape code

public class Seed {
  public static void main(String[] args) throws IOException {
    BufferedReader input = null;
    try {
      input = new BufferedReader(new FileReader("C:/Users/wlao/Desktop/javalab/New folder/netpaywithseed/monthly_rate.txt"));
      double monthlyRate = Double.parseDouble(input.readLine());
      System.out.println("Monthly rate: " + monthlyRate);
      System.out.println("__________________");
      System.out.println("GOVERNMENT DEDUCTIONS");

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
    }else if (monthlyRate >= 5250 && monthlyRate <= 5749.99) {
      sssContribution = 247.50;
    } else if (monthlyRate >= 5750 && monthlyRate <= 6249.99) {
      sssContribution = 270.00;
    } else if (monthlyRate >= 6250 && monthlyRate <= 6749.99) {
      sssContribution = 292.50;
    } else if (monthlyRate >= 6750 && monthlyRate <= 7249.99) {
      sssContribution = 315.00;
    } else if (monthlyRate >= 7250 && monthlyRate <= 7749.99) {
      sssContribution = 337.50;
    } else if (monthlyRate >= 7750 && monthlyRate <= 8249.99) {
      sssContribution = 360.00;
    } else if (monthlyRate >= 8250 && monthlyRate <= 8749.99) {
      sssContribution = 382.50;
    } else if (monthlyRate >= 8750 && monthlyRate <= 9249.99) {
      sssContribution = 405.00;
    } else if (monthlyRate >= 9250 && monthlyRate <= 9749.99) {
      sssContribution = 427.50;
    } else if (monthlyRate >= 9750 && monthlyRate <= 10249.99) {
      sssContribution = 450.00;
    } else if (monthlyRate >= 10250 && monthlyRate <= 10749.99) {
      sssContribution = 472.50;
    } else if (monthlyRate >= 10750 && monthlyRate <= 11249.99) {
      sssContribution = 495.00;
    } else if (monthlyRate >= 11250 && monthlyRate <= 11749.99) {
      sssContribution = 517.50;
    } else if (monthlyRate >= 11750 && monthlyRate <= 12250.99) {
      sssContribution = 540.00;
    } else if (monthlyRate >= 12250 && monthlyRate <= 12749.99) {
      sssContribution = 562.50;
    } else if (monthlyRate >= 12750 && monthlyRate <= 13249.99) {
      sssContribution = 585.00;
    } else if (monthlyRate >= 13250 && monthlyRate <= 13749.99) {
      sssContribution = 607.50;
    } else if (monthlyRate >= 13750 && monthlyRate <= 14249.99) {
      sssContribution = 630.00;
    } else if (monthlyRate >= 14250 && monthlyRate <= 14749.99) {
      sssContribution = 652.50;
    } else if (monthlyRate >= 14750 && monthlyRate <= 15249.99) {
      sssContribution = 675.00;
    } else if (monthlyRate >= 15250 && monthlyRate <= 15749.99) {
      sssContribution = 697.50;
    } else if (monthlyRate >= 15750 && monthlyRate <= 16249.99) {
      sssContribution = 720.00;
    } else if (monthlyRate >= 16250 && monthlyRate <= 16749.99) {
      sssContribution = 742.50;
    } else if (monthlyRate >= 16750 && monthlyRate <= 17249.99) {
      sssContribution = 765.00;
    } else if (monthlyRate >= 17250 && monthlyRate <= 17749.99) {
      sssContribution = 787.50;
    } else if (monthlyRate >= 17750 && monthlyRate <= 18249.99) {
      sssContribution = 810.00;
    } else if (monthlyRate >= 18250 && monthlyRate <= 18749.99) {
      sssContribution = 832.50;
    } else if (monthlyRate >= 18750 && monthlyRate <= 19249.99) {
      sssContribution = 855.00;
    } else if (monthlyRate >= 19250 && monthlyRate <= 19749.99) {
      sssContribution = 877.50;
    } else if (monthlyRate >= 19750 && monthlyRate <= 20249.99) {
      sssContribution = 900.00;
    } else if (monthlyRate >= 20250 && monthlyRate <= 20749.99) {
      sssContribution = 922.50;
    } else if (monthlyRate >= 20750 && monthlyRate <= 21249.99) {
      sssContribution = 945.00;
    } else if (monthlyRate >= 21250 && monthlyRate <= 21749.99) {
      sssContribution = 967.50;
    } else if (monthlyRate >= 21750 && monthlyRate <= 22249.99) {
      sssContribution = 990.0;
    } else if (monthlyRate >= 22250 && monthlyRate <= 22749.99) {
      sssContribution = 1023.50;
    } else if (monthlyRate >= 22750 && monthlyRate <= 23249.99) {
      sssContribution = 1035.00;
    } else if (monthlyRate >= 23250 && monthlyRate <= 23749.99) {
      sssContribution = 1057.50;
    } else if (monthlyRate >= 23750 && monthlyRate <= 24249.99) {
      sssContribution = 1080.00;
    } else if (monthlyRate >= 24250 && monthlyRate <= 24749.99) {
      sssContribution = 1102.50;
    } else if (monthlyRate >= 24750 && monthlyRate <= 9999999) {
      sssContribution = 1125.00;
    } else {
      sssContribution = 0;
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
System.out.println("__________________");
System.out.println("Net Pay = Taxable Income - Withholding Tax");

    double taxableIncome = monthlyRate - totalDeduction;
    System.out.println("Taxable Income: " + taxableIncome);

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

    double netPay = taxableIncome - withholdingTax;

    System.out.println("Net Pay: " + netPay);
} catch (Exception e) {
      e.printStackTrace();
    }

  }
}
