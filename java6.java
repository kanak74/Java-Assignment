import java.util.Scanner;
public class ATMSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your account balance: ");
        double balance = sc.nextDouble();
        System.out.print("Enter withdrawal amount: ");
        double withdraw = sc.nextDouble();

        if (withdraw % 100 == 0 && (balance - withdraw) >= 1000) {
            System.out.println("Successful!");
            System.out.println("Remaining Balance: " + (balance - withdraw));
        } else {
            System.out.println(" Failed!");
            
        }

        sc.close();
    }
}
