/* public class NumberTotext {
    private static final String[] units = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
    private static final String[] teens = {"", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private static final String[] tens = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

    public static String convertToWords(int num) {
        if (num == 0) {
            return "Zero";
        }
        return convertToWordsHelper(num);
    }

    private static String convertToWordsHelper(int num) {
        if (num < 10) {
            return units[num];
        } else if (num < 20) {
            return teens[num - 10];
        } else if (num < 100) {
            return tens[num / 10] + " " + convertToWordsHelper(num % 10);
        } else if (num < 1000) {
            return units[num / 100] + " Hundred " + convertToWordsHelper(num % 100);
        } else if (num < 1000000) {
            return convertToWordsHelper(num / 1000) + " Thousand " + convertToWordsHelper(num % 1000);
        } else if (num < 1000000000) {
            return convertToWordsHelper(num / 1000000) + " Million " + convertToWordsHelper(num % 1000000);
        } else {
            return convertToWordsHelper(num / 1000000000) + " Billion " + convertToWordsHelper(num % 1000000000);
        }
    }

    public static void main(String[] args) {
        int number = 12345;
        String words = convertToWords(number);
        System.out.println(number + " in words: " + words);
    }
}
 */


public class NumbertoText {
    public static void main(String[] args) {
        String nums[] = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
        String teens[] = {"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String tens[] = {"", "", "twenty", "thirty"};

        int n = 1219; // Replace with your actual number
        String d = Integer.toString(n);
        System.out.println(d);

        String date = d.substring(0, d.length() / 2);
        String mon = d.substring(d.length() / 2, d.length());
        System.out.println(date);
        System.out.println(mon);

        int dat = Integer.parseInt(date);
        int mo = Integer.parseInt(mon);

        // Check if the date and month are within valid ranges
        if (dat >= 1 && dat <= 31 && mo >= 1 && mo <= 12) {
            // Convert dat to words
            String dateInWords = convertToWords(dat, nums, teens, tens);
            System.out.println("Date in words: " + dateInWords);

            // Convert mo to words
            String monthInWords = convertToWords(mo, nums, teens, tens);
            System.out.println("Month in words: " + monthInWords);
        } else {
            System.out.println("Invalid date or month");
        }
    }

    private static String convertToWords(int num, String[] nums, String[] teens, String[] tens) {
        if (num >= 1 && num <= 10) {
            return nums[num];
        } else if (num >= 11 && num <= 19) {
            return teens[num - 11];
        } else if (num >= 20 && num <= 99) {
            int tensDigit = num / 10;
            int unitsDigit = num % 10;
            return tens[tensDigit] + (unitsDigit > 0 ? " " + nums[unitsDigit] : "");
        } else {
            return ""; // You can add handling for larger numbers if needed
        }
    }
}
