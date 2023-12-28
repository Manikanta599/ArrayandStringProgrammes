/* import java.util.Arrays;
import java.util.Scanner;

import javafx.scene.SubScene;

public class LargestDiff {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] inputArray = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            inputArray[i] = scanner.nextInt();
        }

        int maxDifference = findMaxDifference(inputArray);
        System.out.println("Maximum Difference: " + maxDifference);
    }

       
    
        public static int findMaxDifference(int []arr)
        {

        //int ldif=arr[0]-arr[1];
        int m=Integer.MIN_VALUE;
        int n=Integer.MAX_VALUE;
        System.out.println(m);
        System.out.println(n);

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>m)
            {
                m=arr[i];
            }
            if(arr[i]<n)
            {
                n=arr[i];
            }

        }
        System.out.println(m+" "+n);

        return m-n;
    }
    }
     */



/* 
public class SmallestDiff {

    public static void main(String[] args) {
        int arr[] = {5, 9, 17, 8, 26, 4, 32, 1, 15};

        if (arr.length < 2) {
            System.out.println("Array should have at least two elements");
            return;
        }

        // Sort the array to make finding the smallest difference easier
        Arrays.sort(arr);

        int smallestDiff = Integer.MAX_VALUE;

        for (int i = 1; i < arr.length; i++) {
            int currentDiff = arr[i] - arr[i - 1];
            if (currentDiff < smallestDiff) {
                smallestDiff = currentDiff;
            }
        }

        System.out.println("Smallest Difference: " + smallestDiff);
    }
}
 */



import java.util.Arrays;
import java.util.Scanner;

public class LargestDiff {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] inputArray = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            inputArray[i] = scanner.nextInt();
        }

        int maxDifference = findMaxDifference(inputArray);
        System.out.println("Maximum Difference: " + maxDifference);
    }

    public static int findMaxDifference(int[] arr) {
        if (arr.length < 2) {
            System.out.println("Array should have at least two elements");
            return 0;
        }

        int m = arr[0];
        int n = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > m) {
                m = arr[i];
            }
            if (arr[i] < n) {
                n = arr[i];
            }
        }

        return m - n;
    }
}
