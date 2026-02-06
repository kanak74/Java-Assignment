import java.util.Scanner;
public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter basic salary: ");
        double salary = sc.nextDouble();
        double hra, da, pf, netSalary;

        if (salary >= 30000) {
            hra = salary * 0.20; 
            da = salary * 0.15;  
        } else {
            hra = salary * 0.10;  
            da = salary * 0.08;  
        }
        pf = salary * 0.12;
        netSalary = salary + hra + da - pf;
        System.out.println("Net Salary = " + netSalary);
    }
}