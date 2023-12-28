
import java.util.Arrays;
import java.util.Scanner;

public class ReverseEachWord {
	
    public static String[] rev(String s) {
        String[] arr = s.split(" ");
        
        for(int i = 0; i < arr.length; i++) {
            String ele = arr[i];
            String n = "";
            for(int j = 0; j < ele.length(); j++) {
                n = ele.charAt(j) + n;
            }
            arr[i] = n;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String[] reversedWords = rev(input);
        System.out.println(Arrays.toString(reversedWords));
    }
}
