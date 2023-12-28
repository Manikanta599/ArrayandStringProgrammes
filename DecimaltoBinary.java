
import java.util.Scanner;

public class DecimaltoBinary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int n = sc.nextInt();

        // Convert decimal to binary and print each binary digit
        System.out.print("Binary representation: ");
        while (n > 0) {
            int r = n % 2;
            System.out.print(r);
            n /= 2;
        }
        System.out.println();

        // Reset n to the original value for the next part
        n = sc.nextInt();

        int basev = 1;
        int bin = 0;

        // Convert decimal to binary and store in 'bin'
        while (n > 0) {
            int d = n % 2;
            bin = bin + d * basev;
            basev = basev * 10;
            n /= 2;
        }

        System.out.println("Binary representation: " + bin);
    }
}
