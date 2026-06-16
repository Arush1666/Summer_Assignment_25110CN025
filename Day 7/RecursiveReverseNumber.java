import java.util.Scanner;

public class RecursiveReverseNumber {

    static int reverse = 0;

    static void rev(int n) {

        if (n == 0) {
            return;
        }

        reverse = reverse * 10 + n % 10;

        rev(n / 10);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        rev(n);

        System.out.println("Reverse = " + reverse);
    }
}