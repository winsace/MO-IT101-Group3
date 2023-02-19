import java.util.Scanner;

public class PhilHealthContribution {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter monthly rate: ");
    double monthlyRate = input.nextDouble();
    double contribution;

//double as monthly rate can have cent value
//contribution is conditional
//contribution is 3% of monthly rate
    
    if (monthlyRate <= 10000) {
      contribution = monthlyRate * 0.03;
    } else if (monthlyRate <= 59999.99) {
      contribution = monthlyRate * 0.03;
    } else {
      contribution = 1800;
    }
    
    System.out.println("Your PhilHealth contribution is: " + contribution);
  }
}
