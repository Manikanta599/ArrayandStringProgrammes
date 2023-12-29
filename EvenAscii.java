//package MultiArrPrograms;

import java.util.Scanner;

public class EvenAscii {
    public static int ascii(char ch)
    {
        for(char i=ch;;i++)
        {

            int n=ch;
            if(n%2==0)
            {
                return n;
            }
        }
    }

    public static void main(String[] args) {
        char c='a';
        Scanner s=new Scanner(System.in);
        System.out.println("enter the no of rows");
        int row=s.nextInt();
        System.out.println("enter the no of cols");
        int cols=s.nextInt();
        int arr[][]=new int[row][cols];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                
                
                arr[i][j]=ascii(c);
            }
        }

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                
                
               System.out.print(arr[i][j]);
            }
            System.out.println();
        }

        
                


    }
    
}
