import java.util.Arrays;

/**
 * CombinationsSwap
 */
public class CombinationsSwap {

    public static void main(String[] args) {
        int arr[]={95,70,24,63,54};
        for(int i=0;i<arr.length-1;i+=2)
        {
            arr[i]=arr[i]+arr[i+1];
            arr[i+1]=arr[i]-arr[i+1];
            arr[i]=arr[i]-arr[i+1];
        }
        System.out.println(Arrays.toString(arr));
    }
}