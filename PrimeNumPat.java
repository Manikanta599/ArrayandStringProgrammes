public class PrimeNumPat {
    public static void main(String[] args) {
        int n=5;
        int c=11;
        for(int i=1;i<=5;i++)
        {
            for(int j=n-i;j>=1;j--        
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                while (true) {
                if(isprime(c))
                {
                    System.out.print(c+" ");
                    c++;
                    break;
                }
                else
                {
                    c++;
                }
            }
                
            } 
            System.out.println();
        }
    }
    public static boolean isprime(int n)
    {
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }   
}
