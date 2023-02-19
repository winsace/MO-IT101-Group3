import java.util.Scanner;

public class PagibigContribution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter monthly rate: ");
        double monthlyRate = scanner.nextDouble();
        double contribution;
        if (monthlyRate >= 1000 && monthlyRate <= 1500) {
            contribution = monthlyRate * 0.01;
        } else if (monthlyRate > 1500) {
            contribution = monthlyRate * 0.02;
        } else {
            System.out.println("Invalid monthly rate. Must be at least 1000.");
            return;
        }
        System.out.println("Contribution: " + contribution);
    }
}
