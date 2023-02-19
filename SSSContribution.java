import java.util.Scanner;

public class SSSContribution {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter monthly rate: ");
    double monthlyRate = scanner.nextDouble();

    System.out.println("Monthly rate: " + monthlyRate);
    
    double sssContribution;

//We use the SSS table for contibution based on conditional statement
//We use scanner in order for the user to input the monthlyRate on the console
    
    if (monthlyRate < 3250) {
      sssContribution = 135.00;
    } else if (monthlyRate >= 3250 && monthlyRate <= 3749.99) {
      sssContribution = 157.50;
    } else if (monthlyRate >= 3750 && monthlyRate <= 4249.99) {
      sssContribution = 180.00;
    } else if (monthlyRate >= 4250 && monthlyRate <= 4749.99) {
      sssContribution = 202.50;
    } else if (monthlyRate >= 4750 && monthlyRate <= 5249.99) {
      sssContribution = 225.00;
    } else if (monthlyRate >= 5250 && monthlyRate <= 5749.99) {
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
  }
}
