import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int count = sc.nextInt();

        if (count <= 0) {
            return;
        }

        int first = 0;
        int second = 1;

        System.out.print(first + " ");

        if (count > 1) {
            System.out.print(second + " ");
            printFibonacci(count - 2, first, second);
        }
    }

    public static void printFibonacci(int remaining, int first, int second) {

        if (remaining == 0) {
            return;
        }

        int next = first + second;

        System.out.print(next + " ");

        printFibonacci(remaining - 1, second, next);
    }
}
