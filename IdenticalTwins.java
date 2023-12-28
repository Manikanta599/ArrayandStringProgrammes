public class IdenticalTwins {
    public static void main(String[] args) {
        int arr[]={1, 2, 3, 2, 1};
        int s=0;
        int l=arr.length;

        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    System.out.println(i+" "+j);
                }
            }
        }
        int j=1;mer
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==arr[j])
            {
                System.out.println(i+" "+j);
                j++;

            }
        }

        
        }
    }
    

