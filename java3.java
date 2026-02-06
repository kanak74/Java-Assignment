import java.util.Scanner;
public class NumberClassification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any integer: ");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("The number is positive");
        } else if (num < 0) {
            System.out.println("The number is negative");
        } else {
            System.out.println("The number is zero");
        }

        if (num % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }

        if (num % 5 == 0 && num % 7 == 0) {
            System.out.println("The number is divisible by both 5 and 7");
        } else {
            System.out.println("The number is not divisible by both 5 and 7");
        }
    }
}