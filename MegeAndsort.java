import java.text.DecimalFormat;
import java.util.Arrays;

public class MegeAndsort {

    public static void main(String[] args) {
        int a1[] = {1, 2};
        int a2[] = {3,4};

        int len = a1.length + a2.length;
        int a3[] = new int[len];
        int j = 0;

        for (int i = 0; i < len; i++) {
            if (i < a1.length) {
                a3[i] = a1[i];
            } else {
                a3[i] = a2[j];
                j++;
            }
        }
        Arrays.sort(a3);

        System.out.println(Arrays.toString(a3));
        int mid=len/2;
        // System.out.println(mid);
        DecimalFormat dc=new DecimalFormat("#.00000");
        
        if(len%2==0)
        {
            int s=a3[mid-1]+a3[mid];
            double m=s/2.0;
            String f1=dc.format(m);
            double d=Double.valueOf(f1);
            System.out.println(d);
            
        }
        else
        {
            int m1=a3[mid];
            String f2=dc.format(m1);
            System.out.println(f2);
        }

        
    }
}
