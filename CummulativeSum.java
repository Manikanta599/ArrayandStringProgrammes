/*The cumulative sum of an array at index i is defined as the sum of all elements of the array from index 0 to index i.

* Examples
* Initial Array: [1, 2, 3, 4]
* Cumulative Sum: [1, 3, 6, 10]

* public class CummulativeSum {
    
}/* */

import java.util.Arrays;

/**
 * CummulativeSum
 */
public class CummulativeSum {

    public static void main(String[] args) {
        int arr[]={1, -1, -1, -1, 1};
        // System.out.println(Arrays.toString(arr));
        int s=0;
        for(int i=0;i<arr.length;i++)
        {
            s+=arr[i];
            arr[i]=s;
            

            
        }

        System.out.println(Arrays.toString(arr));
    }
}
