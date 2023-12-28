import java.util.Arrays;

public class CheckValuePresent {

    public static void main(String[] args) {
        int[] arr={5, 1, 1, 9, 7, 2, 6, 10};
        int key=8;
        
        boolean find=false;
        int res=Arrays.binarySearch(arr,key);

        if(res<=0)
        {
            System.out.println("not present");
        }
        else
        {
            System.out.println("present");
        }
        for(int i=0;i<arr.length;i++)
        {
            if(key==arr[i])
            {
                find=true;
            }
        }
        
        if(find)
        {
            System.out.println("present");
        }
        else
        {
            System.out.println("no");
        }

    }
    
}
