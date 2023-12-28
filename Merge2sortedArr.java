import java.util.Arrays;

public class Merge2sortedArr {

    public static void main(String[] args) {
        int A[]={1,3};
        int B[]={2,4};
        int len=A.length+B.length;
		int c[]=new int[len];
		int j=0;
		for(int i=0;i<len;i++)
		{
			if(i<A.length)
			{
				c[i]=A[i];
			}
			else
			{
				c[i]=B[j];
				j++;
			}
		}

        Arrays.sort(c);

        System.out.println(Arrays.toString(c));
    }
    
}
