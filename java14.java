import java.util.Scanner;
public class QuotientWithoutDivision {
    public static int add(int x, int y) {
        while (y != 0) {
            int carry = x & y;
            x = x ^ y;
            y = carry << 1;
        }
        return x;
    }
    public static int subtract(int a, int b) {
        int negB = add(~b, 1); 
        return add(a, negB);  
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter dividend: ");
        int dividend = sc.nextInt();

        System.out.print("Enter divisor: ");
        int divisor = sc.nextInt();

        int quotient = 0;
        int sign = 1;

        if (dividend < 0) {
            dividend = add(~dividend, 1);  
            sign = -sign;
        }
        if (divisor < 0) {
            divisor = add(~divisor, 1); 
            sign = -sign;
        }
        for (int i = 31; i >= 0; i--) {

            if ((dividend >> i) >= divisor) {
                int shifted = divisor << i;
                dividend = subtract(dividend, shifted);
                quotient = quotient | (1 << i);
            }
        }
        if (sign < 0) {
            quotient = add(~quotient, 1);
        }

        System.out.println("Quotient = " + quotient);
    }
}
