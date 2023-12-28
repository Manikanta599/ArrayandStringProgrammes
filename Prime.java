import java.util.Arrays;

public class Prime {
    public static void main(String[] args) {
        int arr[]={2,4,7,8,12,11,22,24};

        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if((!isprime(arr[i]))&&(!isprime(arr[j])))
                {
                    if(arr[i]<arr[j])
                    {
                        int temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
                }
            }
            
        }

        System.out.println(Arrays.toString(arr));
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
