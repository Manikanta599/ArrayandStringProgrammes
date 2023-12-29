//package MultiArrPrograms;

/* import java.util.Scanner;

public class PrimePatern {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the no of rows");
        int row=s.nextInt();
        System.out.println("enter the no of cols");
        int cols=s.nextInt();
        int arr[][]=new int[row][cols];
        boolean f=true;
        int n=2;
        while (true) {
            if(isprime(n))
            {
                //System.out.println(n);
            for(int i=0;i<arr.length;i++)
        {
            for(int j=1;j<arr.length-i;j++)
            {
                System.out.print("  ");
            }
            for(int k=0;k<=i;k++)
            {
                
                    System.out.print(n+" ");
                    f=false;
                    n++;

                
            }
            System.out.println();
        }
    }
    else
    {
        n++;
        f=false;
        break;
    }
            
        }

    }
     public static boolean isprime(int num)
        {
            int c=0;
            for(int i=1;i<=num;i++)
            {
                if(num%i==0)
                {
                    c++;
                }
            }
            if(c==2)
            {
                return true;
            }
            
            return false;
        }
    
}
 */



// package MultiArrPrograms;

import java.util.Scanner;

/**
 * PrimePatern
 */
public class PrimePatern {
public static int nextPrime(int n)
{
    for(int i=n+1;;i++)
    {
        int c=0;
        for(int j=1;j<=i;j++)
        {
            if(i%j==0)
            {
                c++;
            }
        }
        if(c==2)
        {
            return i;
        }

    }
}

public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("enter the no of rows");
    int row=s.nextInt();
    System.out.println("enter the no of cols");
    int cols=s.nextInt();
    int n=2;
    int arr[][]=new int[row][cols];

    for(int i=0;i<arr.length;i++)
    {
        for(int j=0;j<arr[i].length;j++)
        {
           if(j>=(i-j)+1)
           {
                arr[i][j]=nextPrime(n);
           }
        }
    }

    for(int i=0;i<arr.length;i++)
    {
        for(int j=0;j<arr[i].length;j++)
        {
            if(arr[i][j]>0)
            {
                System.err.print(arr[i][j]);
            }
        }
        System.out.println();
    }
    
}
    
}