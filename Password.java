import java.util.Scanner;



class Pass
{
    String pss;
    public Pass(String pss) throws PasswordnotmatchingRequirementException
    {
        int d=0;
        int c=0;
        int s=0;
        for(int i=0;i<pss.length();i++)
        {
            char ch=pss.charAt(i);

            if(Character.isAlphabetic(ch))
            {
                c++;
            }
            else if(Character.isDigit(ch))
            {
                d++;
            }
            else
            {
                s++;
            }
            
        }
        
        if(d>1&&c>1&&s>=2)
        {
            this.pss=pss;
            System.out.println("password success");
        }
        else
        {
            throw new PasswordnotmatchingRequirementException();
        }
    }

   
}

// package execptions;

/**
 * Password
 */
public class Password {
public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    String p=s.next();
   

    while (true) {
        try
        {
            Pass obj=new Pass(p);
            

        }
        catch(PasswordnotmatchingRequirementException pnmr)
        {
            System.out.println("re-enter password");
            p=s.next();

        }
        
    }
    
}
    
}