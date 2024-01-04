import java.util.Scanner;

public class ConvertEventoOdd {

    // even index --> uppercase, odd index --> lowercase
    public static String convert(String s) {
        String ns = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (i % 2 == 0) {
                if (ch >= 'a' && ch <= 'z') {
                    ns += (char) (ch - ('a' - 'A')); // Convert to uppercase
                } else {
                    ns += ch;
                }
            } else {
                if (ch >= 'A' && ch <= 'Z') {
                    ns += (char) (ch + ('a' - 'A')); // Convert to lowercase
                } else {
                    ns += ch;
                }
            }
        }

        return ns;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.next();

        System.out.println("Converted String: " + convert(str));

        // Closing the scanner to prevent resource leak
        scanner.close();
    }
}
