import java.util.Scanner;
public class MultiplyWithoutStar {
    public static int add(int x, int y) {
        while (y != 0) {
            int carry = x & y;
            x = x ^ y;
            y = carry << 1;
        }
        return x;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int result = 0;
        int sign = 1;
        if (a < 0) {
            a = add(~a, 1); 
            sign = -sign;
        }
        if (b < 0) {
            b = add(~b, 1);  
            sign = -sign;
        }
        while (b != 0) {
            if ((b & 1) == 1) {
                result = add(result, a);
            }
            a = a << 1;
            b = b >> 1;
        }
        if (sign < 0) {
            result = add(~result, 1); 
        }

        System.out.println("Result = " + result);
    }
}
