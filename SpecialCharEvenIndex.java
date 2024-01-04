import java.util.Scanner;

public class SpecialCharEvenIndex {
    public static void evenInd(String s)
    {
        for(int i=0;i<s.length();i++)
        {
            if(i%2==0)
            {
                char ch=s.charAt(i);
                if(!Character.isLetterOrDigit(ch))
                {
                    System.out.println(ch);
                }
            }
        }
    }

    
    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        evenInd(str);
    }
}
