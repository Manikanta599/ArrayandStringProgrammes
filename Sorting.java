import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] arr = { 5, -2, 23, 7, 87, -42, 509 };
        int n=arr.length;
        int f=0;
        int l=n-1;
        //int i=0;
        while(f<l)
        {
            if(arr[f]>arr[l])
            {
                int temp=arr[f];
                arr[f]=arr[l];
                arr[l]=temp;

                
            }
            f++;
            l--;
        }

        System.out.println(Arrays.toString(arr));
        
    }
    
}
