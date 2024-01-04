import java.util.Scanner;

public class NoOfWordsStr {
    public static int countWords(String s)
    {
        String[] arr=s.split(" ");
        int l=arr.length;
        return l;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        System.out.println(countWords(str)); 
    }
    
}
