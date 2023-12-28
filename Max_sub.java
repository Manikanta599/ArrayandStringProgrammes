/* public class Max_sub {
    public static void main(String[] args) {
        int [] arr={6,-3,-10,0,2};

        int len=arr.length;
        int f_mul=1;
        int start=0;
        int end=0;

        for(int i=0;i<=len;i++)
        {
            for(int j=i;j<=len;j++)
            {
                int mul=1;
                for(int k=i;k<j;k++)
                {
                    mul*=arr[k];
                    if(mul>f_mul)
                    {
                        f_mul=mul;
                        start=i;
                        end=j;
                    }
                }
            }
        }

        System.out.println(f_mul);

        for(int m=start;m<end;m++)
        {
            System.out.println(arr[m]);
        }
    }
    
}
 */


/**
 * Max_sub
 *//* 

public class Max_sub {

    public static void main(String[] args) {
        int[] arr={};
        int res=arr[0];
        int f_res=0;
        int start=0;
        int end=0;
        int s=0;

        for(int i=0;i<=arr.length;i++)
        {
           // System.err.println("*********************");
            int mul=arr[0];
            for(int j=i+1;j<arr.length;j++)
            {
                res=Math.max(res,mul);
               // System.out.println(res);
                mul*=arr[j];
               // System.out.println(mul);
                s=j;
               

            }
            res=Math.max(res,mul);
            if(res>f_res)
            {
                f_res=res;
                start=i;
                end=s;
            }
            
            
            
        }
        System.out.println(res);

            for(int m=start;m<end;m++)
            {
                System.out.print(arr[m]+" ");
            }
    }
} 
 */

/**
 * Max_sub
 */
/* public class Max_sub {

    public static void main(String[] args) {
        int[] arr={6,-3,-10,0,2};

        for(int i=0;i<=arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
                System.out.print(arr[j]+" ");
            }
            System.out.println();
        }
    }
} */





/**
 * Max_sub
 */
public class Max_sub {

    public static void main(String[] args) {
        int[] arr={}
    }
}