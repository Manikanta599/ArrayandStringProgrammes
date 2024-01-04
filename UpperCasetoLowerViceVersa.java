import java.util.Scanner;


public class UpperCasetoLowerViceVersa {

    public static String convert(String s)
    {
        String ns="";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch>='a'&&ch<='z')
            {
                ns += (char) (ch - ('a' - 'A'));
            }
            else if(ch>='A'&&ch<='Z')
            {
                ns += (char) (ch +('a' - 'A'));
            }
        }

        return ns;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.next();
        System.out.println(convert(str));

    }
    
}
