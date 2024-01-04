import java.util.Scanner;

public class NoofCharDigitSpecialChars {

    public static void count(String s)
    {
        int d=0;
        int sp=0;
        int al=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(Character.isAlphabetic(ch))
            {
                al++;
            }
            else if(Character.isDigit(ch))
            {
                d++;
            }
            else
            {
                sp++;
            }
        }

        System.out.println(al);
        System.out.println(sp);
        System.out.println(d);
    }
    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        count(str);
        
    }
}
