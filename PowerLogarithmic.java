import java.util.Scanner;

public class PowerLogarithmic {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base: ");
        int base = sc.nextInt();

        System.out.print("Enter exponent: ");
        int exponent = sc.nextInt();

        int answer = calculatePower(base, exponent);

        System.out.println("Result: " + answer);
    }

    public static int calculatePower(int base, int exponent) {

        if (exponent == 0) {
            return 1;
        }

        int halfPower = calculatePower(base, exponent / 2);

        int result = halfPower * halfPower;

        if (exponent % 2 != 0) {
            result = result * base;
        }

        return result;
    }
}
