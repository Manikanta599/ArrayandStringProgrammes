import java.io.StringReader;

public class Datetotext {

    public static void text(int n)
    {
       
        String nums[]={"","one","two","three","four","five","six","seven","eight","nine","ten"};
        String teens[]={"eleven","tweleve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
        String tens[]={"","","twenty","thirty"};

        String d=Integer.toString(n);
        System.out.println(d);

        String date=d.substring(0,d.length()/2);
        String mon=d.substring(d.length()/2, d.length());
        System.out.println(date);
        System.out.println(mon);

        int dat=Integer.parseInt(date);
        int mo=Integer.parseInt(mon);

       String fdate="";

       if(dat>=1&&dat<=10)
       {
            fdate+=nums[dat];
       }
       else if(dat>=11&&dat<=19)
       {
            fdate+=teens[dat];
       }
       else if(dat>=20 && dat<=31)
       {
            if(dat/10==2)
            {
                fdate+=tens[dat/10]+nums[dat%10];
            }
            else if(dat/10==3)
            {
                fdate+=tens[dat/10]+nums[dat%10];
            }
       }



    }


    public static void main(String[] args) {
        text(1218);
    }
    
}



public class NumberToWordsConversion {
    public static void main(String[] args) {
        String nums[] = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
        String teens[] = {"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String tens[] = {"", "", "twenty", "thirty"};

        int n = 25; // Replace with your actual number
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
