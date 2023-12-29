//package MultiArrPrograms;

import java.util.Scanner;

/**
 * FibinnacciInMultiArr
 */
public class FibinnacciInMultiArr {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the no of rows");
        int row=s.nextInt();
        System.out.println("enter the no of cols");
        int cols=s.nextInt();
        int arr[][]=new int[row][cols];
        int a=-1;
        int b=1;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                
                int c=a+b;
                arr[i][j]=c;
                a=b;
                b=c;

            }
        }
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        
    }

    
}