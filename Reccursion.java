public class Reccursion {
    public static void strrev(String s,int n)
    {
        int c=0;
        if(n==-1)
        {
            System.out.println("");
            return;
        }
        
            System.out.print(s.charAt(n));
        

        strrev(s, n-1);
        System.out.println(n);
    }

    public static void numrev(int num)
    {
        if(num==0)
        {
            return;
        }
       
            System.out.print(num%10);
            
            numrev(num/=10); 
            
        
    }


    public static void main(String[] args) {
        String s="hello";
        int n=s.length();
        strrev(s, n-1);
        numrev(124);
    
}
}
