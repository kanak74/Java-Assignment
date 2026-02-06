import java.util.Scanner;

public class MultiplyBySeven {

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

        int x = sc.nextInt();

        int times8 = x << 3;
        int times7 = subtract(times8, x);

        System.out.println("Result = " + times7);
    }
}

