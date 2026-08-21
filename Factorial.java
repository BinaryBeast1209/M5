import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int result = findFactorial(number);

        System.out.println("Factorial of " + number + " is: " + result);
    }

    public static int findFactorial(int number) {

        if (number <= 1) {
            return 1;
        }

        return number * findFactorial(number - 1);
    }
}
