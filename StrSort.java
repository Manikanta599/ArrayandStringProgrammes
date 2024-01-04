import java.sql.Struct;
import java.util.Arrays;
import java.util.Scanner;

public class StrSort {

    public static void sSort(String s)
    {
        char[] arr=s.toCharArray();
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        String st=new String(arr);
        System.out.println(st);

        int f=0;
        int l=arr.length-1;
        while (f<l) {
            if(arr[f]>arr[l])
            {
                char temp=arr[f];
                arr[f]=arr[l];
                arr[l]=temp;
            }   

            f++;
            l--;
        }
        System.out.println(Arrays.toString(arr));


       

        
    }
    

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.next();
        sSort(str);
    }
}
