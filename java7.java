import java.util.Scanner;
public class DigitAnalysis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        int reverse = 0;
        int sum = 0;
        int count = 0;

        while (num != 0) {
            int digit = num % 10;   

            reverse = reverse * 10 + digit;  
            sum = sum + digit;          
            count++;                    

            num = num / 10;             
        }
        
        System.out.println("Reversed Number : " + reverse);
        System.out.println("Sum of Digits   : " + sum);
        System.out.println("Count of Digits : " + count);

        sc.close();
    }
}