import java.util.Scanner;

public class MaxWithoutComparison {

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

        int a = sc.nextInt();
        int b = sc.nextInt();

        int diff = subtract(a, b);

        int sign = diff >>> 31;   
        int max = (a & ~sign) | (b & sign);

        System.out.println("Max = " + max);
    }
}
