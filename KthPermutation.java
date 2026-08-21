import java.util.Scanner;

public class KthPermutation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        boolean[] used = new boolean[n + 1];

        System.out.println("Kth permutation:");

        findPermutation(n, k, "", used);
    }

    public static void findPermutation(int n, int k,
                                       String result, boolean[] used) {

        // Stop when the permutation is complete
        if (result.length() == n) {
            k--;
            if (k == 0) {
                System.out.println(result);
            }
            return;
        }

        // Try every number from 1 to n
        for (int num = 1; num <= n; num++) {

            if (!used[num]) {

                used[num] = true;

                findPermutation(
                    n,
                    k,
                    result + num,
                    used
                );

                used[num] = false;
            }
        }
    }
}
