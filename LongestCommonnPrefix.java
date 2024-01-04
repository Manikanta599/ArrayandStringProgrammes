public class LongestCommonnPrefix {

    public static int len(String[] arr)
    {
        int min=arr[0].length();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i].length()<min)
            {
                min=arr[i].length();
            }
        }
        return min;
    }

    public static String prefix(int n,String[] arr)
    {
        int min=len(arr);
        String res="";
        char current;
        for(int i=0;i<min;i++)
        {
            current=arr[0].charAt(i);
            for(int j=1;j<n;j++)
            {
                if(current!=arr[j].charAt(i))
                {
                    return res;
                }
            }
            res+=current;
        }
        return res;
    }

    public static void main(String[] args) {
        String arr[] = {"geeksforgeeks", "geeks","geek", "geezer"};
        int n = arr.length;
        System.out.println(prefix(n, arr));
    }
    
}
