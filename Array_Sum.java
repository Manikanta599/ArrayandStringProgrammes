public class Array_Sum {
    public static void main(String[] args) {
        int[] arr={1,4,20,3,10,5};
        int sum=33;
        int start=0;
        int end=0;
        

        for(int i=0;i<=arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
                int s=0;
                for(int k=i;k<=j;k++)
                {
                    s+=arr[k];
                }
                if(s==sum)
                {
                    start=i;
                    end=j;
                    

                }
            }


        }

    }
    
}
