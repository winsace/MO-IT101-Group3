import java.time.LocalDate;

//This is my task to print out motorph requirement.
//This will print with format Employee Number, Employee Name and Date of Birth

public class Employee {
  private int employeeNumber;
  private String employeeName;
  private LocalDate dateOfBirth;
  
  public Employee(int employeeNumber, String employeeName, LocalDate dateOfBirth) {
    this.employeeNumber = employeeNumber;
    this.employeeName = employeeName;
    this.dateOfBirth = dateOfBirth;
  }
  
  public int getEmployeeNumber() {
    return employeeNumber;
  }
  
  public String getEmployeeName() {
    return employeeName;
  }
  
  public LocalDate getDateOfBirth() {
    return dateOfBirth;
  }
  
  public static void main(String[] args) {
    Employee emp1 = new Employee(10001, "Jose Crisostomo", LocalDate.of(1988, 2, 14));

//date format year month day

    System.out.println("Employee Number: " + emp1.getEmployeeNumber());
    System.out.println("Employee Name: " + emp1.getEmployeeName());
    System.out.println("Date of Birth: " + emp1.getDateOfBirth());
  }
}