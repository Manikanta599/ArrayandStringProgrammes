// /**
//  * ConsecutiveArr
//  */
// public class ConsecutiveArr {

//     public static void main(String[] args) {
//         int arr[] = {2, 8, 9, 5, 6, 7, 10, 4};

//         for (int i = 0; i < arr.length - 1; i++) {
//             int j = i + 1;

//             while (j < arr.length && arr[j] == arr[j - 1] + 1) {
//                 j++;
//             }

//             if (j - i > 1) {
//                 // Found a consecutive subarray
//                 for (int k = i; k < j; k++) {
//                     System.out.print(arr[k] + " ");
//                 }
//                 System.out.println();
//             }
//         }
//     }
// }


/**
 * ConsecutiveArr
 */
/* public class ConsecutiveArr {

    public static void main(String[] args) {
        int arr[] = {2, 8, 9, 5, 6, 7, 10, 4};

        for(int i=0;i<arr.length;i++)
        {
            int j=i+1;
            while (j<arr.length&&arr[j]==arr[j]-1) {
                j++;
                
            }
            if(j-i>1)
            {
                for (int k = i; k < j; k++) {
                System.out.print(arr[k] + " ");
            }

        }
    }
}
} */

/* public class ConsecutiveArr {
    public static void main(String[] args) {
        int[] arr = {2, 8, 9, 5, 6, 7, 10, 4};

        consecutiveSubarrays(arr);
    }

    static void consecutiveSubarrays(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                // Create subarray from index i to j
                if(j-i>=1)
                {
                    for (int k = i; k <= j-1; k++) {
                        if(arr[k]==arr[k+1]+1)
                        {
                            System.out.print(arr[k] + " "+arr[k+1]);
                        }
                    
                        
                }
                }
               
                System.out.println(); // Move to the next line after printing each subarray
            }
        }
    }
}
 */

public class ConsecutiveArr {
    public static void main(String[] args) {
        int[] arr = {2, 8, 9, 5, 6, 7, 10, 4};

        consecutiveSubarrays(arr);
    }

    static void consecutiveSubarrays(int[] arr){
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                // Create subarray from index i to j
                if (j - i >= 1) {
                    boolean isConsecutive = true;

                    // Check if the elements in the subarray are consecutive
                    for (int k = i; k < j; k++) {
                        if (arr[k] != arr[k + 1] - 1) {
                            isConsecutive = false;
                            // System.out.println("con");
                            break;
                        }
                    }

                    // Print the consecutive subarray if found
                    if (isConsecutive) {
                        for (int k = i; k <= j; k++) {
                            // System.out.println("pc");;
                            System.out.print(arr[k] + " ");
                        }
                        System.out.println(); // Move to the next line after printing each subarray
                    }
                }
            }
        }
    }
}
