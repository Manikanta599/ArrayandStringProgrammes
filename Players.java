import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Players {
    public static void main(String[] args) {
        int[] arr={2,3,4,1};

        Integer[] intarr=new Integer[arr.length];

        for (int i = 0; i < intarr.length; i++) {

            intarr[i]=Integer.valueOf(arr[i]);
            
        }

        List<Integer> ls =new ArrayList<Integer>(Arrays.asList(intarr));

        System.out.println(ls);
      
        int f_S=0;
        int s_c=0;

        for (Integer x : ls) {

            if(x%2==0)
            {
                f_S+=x;
            }
            else
            {
                s_c+=x;
            }
            ls.remove(Integer.valueOf(x));
            
            if(x%2==0)
            {
                Collections.reverse(ls);
                System.out.println(ls);
            }
        }

        System.out.println(f_S-s_c);



        

    }
    
}
