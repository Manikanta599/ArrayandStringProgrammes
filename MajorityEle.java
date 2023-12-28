import java.util.Arrays;
import java.util.Scanner;

/**
 * MajorityEle
 */
public class MajorityEle {
   static String vov="";
    public static char[] initialize(int n)
    {
        Scanner s=new Scanner(System.in);
        char arr[]=new char[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=s.next().charAt(0);
        }

        return arr;

    }

    public static int count(char[] a)
    {
        int  c=0;
        String sc="";
        for(int i=0;i<a.length;i++)
        {
            if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u')
            {
                c++;
                sc+=a[i];
                vov=vov+a[i];
            }
        }

        System.out.println(vov);
        return c;



    }

    public static char[] create(int c)
    {
        char[] arr=vov.toCharArray();

        return arr;

    }
    

    

    public static void main(String[] args) {
        System.out.println("enter size");
        Scanner s=new Scanner(System.in);
        int size=s.nextInt();
        char v[]=create(count(initialize(size)));
        System.out.println(Arrays.toString(v));




   
        
    }


}