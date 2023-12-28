public class Leaders {
    public static void main(String[] args) {
        int arr[]={54,78,32,46,12,68,52};
        int max=arr[arr.length-1];
        Lis
        for(int i=arr.length-1;i>0;i--)
        {
            if(arr[i]>max)
            {
                max=arr[i];
                System.out.println(max);
            }
        }
        System.out.print(arr[arr.length-1]); 


    }

   
}

import java.io.*;
public class LeadersInArray 
{
	/*Java Function to print leaders in an array */
	void printLeaders(int arr[], int size) 
	{
		for (int i = 0; i < size; i++) 
		{
			int j;
			for (j = i + 1; j < size; j++) 
			{
				if (arr[i] <=arr[j])
					break;
			}
			if (j == size) // the loop didn't break
				System.out.print(arr[i] + " ");
		}
	}

	/* Driver program to test above functions */
	public static void main(String[] args) 
	{
		LeadersInArray lead = new LeadersInArray();
		int arr[] = new int[]{16, 17, 4, 3, 5, 2};
		int n = arr.length;
		lead.printLeaders(arr, n);
	}
}
