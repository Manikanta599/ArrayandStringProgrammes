import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveEle {
    public static void main(String[] args)
    {
        int[] nums={3,2,2,3};
        int val=3;
        /* int l=0;
        List<Integer> ls=new ArrayList<>();
        for(int i=0;i<a.length;i++)
        {
            if(a[i]!=val)
            {
                ls.add(a[i]);
            }
            
        }

        System.out.println(Arrays.toString(a));
        System.out.println(ls);
        System.out.println(ls.size()); */
        /* if(nums.length==0)
        {
            return 0;
        } */

        int i=0; //initial
       for(int j:nums)
        {
            if(j!=val)
            {
                nums[i++]=j;
                
            }
        }

        // return i;

        System.out.println(Arrays.toString(nums));
        System.out.println(i);
        
    }
    
}
