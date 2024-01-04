import java.util.Scanner;

/**
 * NoOfChars
 */
public class NoOfChars {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        // count(str, str.length());
       System.out.println(counts(str)); 
       System.out.println(count(str, str.length()));
        int co=0;
        for(int i=0;i<str.length();i++)
        {
            char c=str.charAt(i);
            if(Character.isAlphabetic(c))
            {
                co++;
            }
        }
        System.out.println(co);
        
    }

    public static int count(String s,int n)
    {
        int c=0;
        int i=0;
        if(n<-1)
        {
            return c;
        }
        char ch=s.charAt(i);
        if(Character.isAlphabetic(ch))
        {
            c++;
        }
        i++;
        count(s, n-1);

        return c;


    } 

    public static int counts(String s)
    {
        int n=s.length();
        int c=0;                                                                                                                                                                                                                                    count(str)                                                                                                 
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
            {
                c++;
            }
        }
        return c;
    }
}