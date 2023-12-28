//package javaLibrary;
/* import java.util.Scanner;

import java.util.Arrays;

public class Str {
	
	public static String[] rev(String s) {
	  String[] arr = s.split(" ");
	  
	  for(int i =0;i<arr.length;i++) {
		  String ele = arr[i];
		  String n = "";
		  for(int j = 0;j<ele.length();j++) {
			  n = ele.charAt(j)+n;
		  }
		  arr[i]= n;
	  }
	  return arr;
	}

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	String[] f = rev(sc.nextLine());
	System.out.println(Arrays.toString(f));

	}

} */

/* 

import java.util.Scanner;

public class Str {

    

    // Method to find the maximum difference in the array
    public static int findMaxDifference(int[] arr) {
        if (arr == null || arr.length < 2) {
            System.out.println("Array should have at least two elements");
            return -1; // or throw an exception
        }

        int minElement = arr[0];
        int maxDifference = arr[1] - arr[0];

        for (int i = 1; i < arr.length; i++) {
            int currentElement = arr[i];

            // Update minimum element if a smaller element is found
            if (currentElement < minElement) {
                minElement = currentElement;
            }

            // Update maximum difference if a larger difference is found
            int currentDifference = currentElement - minElement;
            if (currentDifference > maxDifference) {
                maxDifference = currentDifference;
            }
        }

        return maxDifference;
    }

    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create an array to store user input
        int[] inputArray = new int[size];

        // Prompt user to enter array elements
        System.out.println("Enter the array elements:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            inputArray[i] = scanner.nextInt();
        }

        // Close the scanner to prevent resource leak
        scanner.close();

        // Find and display the maximum difference
        int maxDifference = findMaxDifference(inputArray);
        System.out.println("Maximum Difference: " + maxDifference);
    }
}
 */


/**
 * Str
 */
/* public class Str {

    public static void main(String[] args) {


        public int Met(int[] ar)
        {
            int len=ar.length;
            int maxdif=0;

            for (int i = 0; i < ar.length-1; i++) {

                if(ar[i]<ar[i+1])
                {
                    int dif=ar[i+1]-ar[i];
                    if(dif>maxdif)
                    {
                        maxdif=dif;
                    }
                }
                
            }
            return maxdif;
        }
    }
} */


/**
 * Str
 */
/* import java.util.Scanner;

public class Str {

    public String findLongestSubstring(String s) {
        String[] arr = s.split(" ");
        String longestSubstring = "";
        int maxLen = 0;

        for (int i = 0; i < arr.length; i++) {
            int currentLen = arr[i].length();

            if (currentLen > maxLen) {
                maxLen = currentLen;
                longestSubstring = arr[i];
            }
        }

        return longestSubstring;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        Str longestSubstringFinder = new Str();
        String longestSubstring = longestSubstringFinder.findLongestSubstring(inputString);

        System.out.println("Input String: " + inputString);
        System.out.println("Longest Substring: " + longestSubstring);

        
    }
}
 */

 /* 
import java.util.Scanner;

public class Str {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        scanner.close();

        String reversedString = reverseStringWithSpecialChars(inputString);

        System.out.println("Original String: " + inputString);
        System.out.println("Reversed String: " + reversedString);
    }

    public static String reverseStringWithSpecialChars(String s) {
        char[] charArray = s.toCharArray();
        int start = 0;
        int end = charArray.length - 1;

        while (start < end) {
            if (!Character.isLetterOrDigit(charArray[start])) {
                start++;
            } else if (!Character.isLetterOrDigit(charArray[end])) {
                end--;
            } else {
                char temp = charArray[start];
                charArray[start] = charArray[end];
                charArray[end] = temp;
                start++;
                end--;
            }
        }

        return new String(charArray);
    }
}
  */





/**
 * Str
 */
/* public class Str {

    public static void main(String[] args) {
        String org="java@sql#technology";
        String fs="";

        StringBuffer sb=new StringBuffer(org);

        for(int i=0;i<org.length();i++)
        {
            char ch=org.charAt(i);

            if(Character.isLetterOrDigit(ch))
            {
                String 

            }
        }
    }
} */

import java.util.Scanner;

/**
 * Str
 */
/* public class Str {

    public void validate(int d)
    {
        StringBuffer sb=new StringBuffer(d);

        int len=sb.length();

        if(len==8)
        {
            int date =Integer.parseInt(sb.substring(0, 2));
            int  mon=Integer.parseInt(sb.substring(2, 4));
            String  year=sb.substring(4, 7);
            boolean y=true;

            for(int i=0;i<=year.length();i++)
            {
                char ch=year.charAt(i);
                if(!Character.isDigit(ch))
                {
                    y=false;
                }
            }

            if((date>=1 && date<=31) && (mon>=1 && mon<=12)&&y)
            {
                System.out.println("valid date");
            }
            else
            {
                System.out.println("invalid date");
            }

            

        
        }


    }


    public static void main(String[] args) {

        Str s=new Str();
        s.validate(26111996);
        
    }
} */
/* 

public class Str {

    public void validate(int d) {
        String dateStr = String.valueOf(d);
        StringBuffer sb = new StringBuffer(dateStr);

        int len = sb.length();

        if (len == 8) {
            int date = Integer.parseInt(sb.substring(0, 2));
            int mon = Integer.parseInt(sb.substring(2, 4));
            String year = sb.substring(4, 8);
            boolean y = true;

            for (int i = 0; i < year.length(); i++) {
                char ch = year.charAt(i);
                if (!Character.isDigit(ch)) {
                    y = false;
                }
            }

            if ((date >= 1 && date <= 31) && (mon >= 1 && mon <= 12) && y && year.length() == 4 && Integer.parseInt(year) >= 1000) {
                System.out.println("Valid date");
            } else {
                System.out.println("Invalid date");
            }
        }
        else
        {
            System.out.println("Invalid date");
        }
    }

    public static void main(String[] args) {
        Str strValidator = new Str();
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        strValidator.validate(n);
    }
}
 */


/**
 * Str
 */
public class Str {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int num=0;

        for(int i=1;i<=2;i++)
        {
            num+=n;
        }

        System.out.println(num);
    }
}