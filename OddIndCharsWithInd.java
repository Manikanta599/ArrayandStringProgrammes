import java.util.Scanner;

public class OddIndCharsWithInd {
    public static int replace(String s)
    {
        String ns="";
        int d=0;
        for(int i=0;i<s.length();i++)
        {
            if(i%2!=0)
            {
                ns=ns+i;
                d++;
            }
            else
            {
                ns=ns+s.charAt(i);
            }
        }
        System.out.println(ns);
        return d;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        System.out.println(replace(str)); 
    }
    
}
