
public class AnagramCheck {

    public static void main(String[] args) {
        String s1 = "anagrab";
        String s2 = "margana";

        if (areAnagrams(s1, s2)) {
            System.out.println("yes");
        } else {
            System.out.println("noo");
        }
    }

    private static boolean areAnagrams(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        int[] charCount = new int[256]; // Assuming ASCII characters

        for (int i = 0; i < s1.length(); i++) {
            charCount[s1.charAt(i)]++;
            charCount[s2.charAt(i)]--;
        }

        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
}

