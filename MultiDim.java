import java.util.Scanner;

public class MultiDim {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter no of rows");
        int rows=s.nextInt();
        System.out.println("Enter no of columns");
        int col=s.nextInt();
        int arr[][]=new int[rows][col];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                arr[i][j]=s.nextInt();
            }
        }
        System.out.println("Array elements are ");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
