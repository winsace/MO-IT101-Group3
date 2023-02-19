public class EmployeePay {


//Calculate number of work hours multiple by hourly pay
//First value work hours..Second value next day work hours

  public static void main(String[] args) {
    double[] workHours = {9.0, 9.0, 9.0, 9.0, 9.0};
    double hourlyPay = 373.04;
    double totalPay = 0;
    for (int i = 0; i < workHours.length; i++) {
      totalPay += workHours[i] * hourlyPay;
    }
    System.out.println("Total pay: Php " + totalPay);
  }
}