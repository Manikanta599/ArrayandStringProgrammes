/* public class DuplicateElements {
    public static void main(String[] args) {
        int arr[]={2,3,3,5,7,4,5,9,7,7};

        for(int i=0;i<arr.length-1;i++)
        {
            int c=0;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    c++;
                }
            }
            if(c==1)
            {
                System.out.println(arr[i]);
            }
        }
    }
     
}*/

import java.util.ArrayList;
import java.util.Arrays;

/**
 * DuplicateElements
 */
public class DuplicateElements {

    public static void main(String[] args) {
        int arr[]={6,6,2,3,3,5,7,4,5,9,7,7,2,2,1,6};
        //int temp[]=new int[arr.length];
       int max=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        int temp[]=new int[max+1];
        for(int i=0;i<arr.length;i++)
        {
            temp[arr[i]]+=1;
        }
        String s="";
        for(int k=0;k<arr.length;k++)
        {
            if(temp[arr[k]]==3)
            {
                System.out.println(arr[k]);
                s+=arr[k];
                temp[arr[k]]=0;
                
            }
        }
        System.out.println(Arrays.toString(temp));
        System.out.println(s);
        int l=s.length();
        int nums[]=new int[l];
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            System.out.println(ch);
            int n=(int)ch-48;
            nums[i]=n;
        }
        System.out.println(Arrays.toString(nums));
    }
} 