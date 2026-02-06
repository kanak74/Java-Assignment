import java.util.Scanner;
public class LoginSystemNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int user = 1111;    
        int pass = 2222;   
        int attempts = 0;

        while (attempts < 3) {
            System.out.print("Enter username in numbers : ");
            int u = sc.nextInt();

            System.out.print("Enter password in numbers : ");
            int p = sc.nextInt();

            if (u == user && p == pass) {
                System.out.println("Login Successful!");
                return;  
            }

            attempts++;
            System.out.println("Incorrect credentials. Attempts left: " + (3 - attempts));
            System.out.println();
        }

        System.out.println("Account Locked. Too many failed attempts.");
    }
}
