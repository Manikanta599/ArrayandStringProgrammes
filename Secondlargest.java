public class Secondlargest {
    public static void main(String[] args) {
        int arr[]={2,4,5,6,99,67};

        int max=arr[0];
        int sm=arr[1];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<max)
            {
                sm=max;
                max=arr[i];
            }
            if (arr[i]<sm&&arr[i]!=max) {
                sm=arr[i];
                
            }
        }
        System.out.println(sm);
        
    }
    
}
