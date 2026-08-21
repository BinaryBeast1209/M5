import java.util.Scanner;

public class PrintDecreasing {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        printNumbers(number);
    }

    public static void printNumbers(int number) {

        if (number <= 0) {
            return;
        }

        System.out.println(number);

        printNumbers(number - 1);
    }
}
