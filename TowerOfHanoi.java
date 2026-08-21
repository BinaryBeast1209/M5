import java.util.Scanner;

public class TowerOfHanoi {

    public static void solve(int disks, int source, int destination, int helper) {

        // Base case
        if (disks == 0) {
            return;
        }

        // Move the top disks to the helper tower
        solve(disks - 1, source, helper, destination);

        // Move the largest disk to the destination
        System.out.println(
            "Move disk " + disks +
            " from Tower " + source +
            " to Tower " + destination
        );

        // Move the remaining disks to the destination
        solve(disks - 1, helper, destination, source);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of disks: ");
        int n = sc.nextInt();

        System.out.print("Enter source tower: ");
        int source = sc.nextInt();

        System.out.print("Enter destination tower: ");
        int destination = sc.nextInt();

        System.out.print("Enter helper tower: ");
        int helper = sc.nextInt();

        solve(n, source, destination, helper);
    }
}
