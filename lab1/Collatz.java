/** Class that prints the Collatz sequence starting from a given number.
 *  @author YOUR NAME HERE
 */
public class Collatz {

    /** Corrected implementation of nextNumber. */
    public static int nextNumber(int n) {
        if (n % 2 == 0) { // If n is even
            return n / 2;
        } else { // If n is odd
            return 3 * n + 1;
        }
    }

    public static void main(String[] args) {
        int n = 7;
        System.out.print(n + " ");
        while (n != 1) {
            n = nextNumber(n);
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
