public class SwapFirstandLast {

    public static void swap(String s)
    {
        String[] arr=s.split(" ");
        String ns="";
        for(int i=0;i<arr.length;i++)
        {
            String st=arr[i];
            char[] carr=st.toCharArray();
            // System.out.println(carr[0]);
            // System.out.println(carr[carr.length-1]);
            char temp=carr[0];
            carr[0]=carr[carr.length-1];
            carr[carr.length-1]=temp;
            String str=new String(carr);
            // System.out.println(str);
            ns=ns+" "+str;
            System.out.println(ns);
        }
    }
    public static void main(String[] args) {
        String str="hello how";
        swap(str);
    }
    
}
