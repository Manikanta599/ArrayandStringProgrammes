import java.util.Arrays;

public class BinarySearch {
    public static int[] sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i - 1;
            int temp = arr[i];
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }
        
    
    public static int binarySearch(int[] arr,int val)
    {
        int f=0;
        int l=arr.length-1;
        while (f<=l) {
            int mid=(f+l)/2;
            if(arr[mid]==val)
            {
                return val;
            }
            else if(arr[mid]<val)
            {
                f=mid+1;
            }
            else if(arr[mid]>val)
            {
                l=mid-1;
            }
            
        }
        return -1;
    }


    public static void main(String[] args) {
        int arr[]={5,8,3,7,9,-2,0,6,-1,10};
        int main[]=sort(arr);
        // System.out.println(Arrays.toString(main));
        int value=23;
        int res=binarySearch(main, value);
        if(res==-1)
        {
            System.out.println("element not found");
        }
        System.out.println(res);

    }
}
