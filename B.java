import java.util.Scanner;

public class B {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = s.nextInt();
        String b = "";

        if (check(n)) {
            b = convertBin(n);
            System.out.println("Binary representation: " + b);
        } else {
            int dec = convertDec(Integer.toString(n));
            System.out.println("Converted back to decimal: " + dec);
        }
    }

    public static boolean check(int n) {
        String b = Integer.toString(n);
        for (char i : b.toCharArray()) {
            if (i != '0' && i != '1') {
                return false;
            }
        }
        return true;
    }

    public static String convertBin(int n) {
        int temp = n;
        StringBuilder binary = new StringBuilder();
        while (temp != 0) {
            int r = temp % 2;
            binary.insert(0, r);
            temp /= 2;
        }
        return binary.toString();
    }

    public static int convertDec(String bin) {
        int t = Integer.parseInt(bin);
        int decimal = 0;
        int i = 0;
        while (t != 0) {
            int r = t % 10;
            decimal += r * Math.pow(2, i);
            t /= 10;
            i++;
        }

        return decimal;
    }
}
