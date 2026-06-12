import java.util.Scanner;

public class NthFibonacci {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        int a = 0;
        int b = 1;
        int c = 0;

        for (int i = 1; i < n; i++) {
            c = a + b;
            a = b;
            b = c;
        }

        System.out.println("Nth Fibonacci Term = " + a);
    }
}