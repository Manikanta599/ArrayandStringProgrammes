public class CcombinationsArr {
    public static void main(String[] args) {
        int arr[]={3,7,9,6};
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                System.out.println(arr[i]+" "+arr[j]);
            }
        }
    }
    
}
