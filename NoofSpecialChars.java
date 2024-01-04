import java.util.Scanner;

public class NoofSpecialChars {
    public static int count(String s)
    {
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(!Character.isLetterOrDigit(ch))
            {
                c++;
            }
        }
        return c;
    }


    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        System.out.println(count(str)); 
    }
    
}
