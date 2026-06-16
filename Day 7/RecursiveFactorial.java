import java.util.Scanner;

public class RecursiveFactorial {

    static long fact(long n) {

        if (n == 0) {
            return 1;
        }

        return n * fact(n - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        long n = sc.nextLong();

        System.out.println("Factorial = " + fact(n));
    }
}