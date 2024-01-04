import java.util.Scanner;

public class OccuranceOfChar {
    public static void occurance(String s,char c)
    {
        int co=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch==c)
            {
                co++;
            }
        }
        if(co>=1)
        {
            System.out.println(c+" ---> "+co);
        }
        else
        {
            System.out.println("not found");
        }
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        char ch=s.next().charAt(0);
        occurance(str,ch);
    }
    
}
