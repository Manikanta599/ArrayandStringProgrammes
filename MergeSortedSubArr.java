import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * MergeSortedSubArr
 */
public class MergeSortedSubArr {

    public static void main(String[] args) {
        int ar[]={3, 3, 9, 11, 1, 3, 3, 4};
        int ind=3;
        int ind1 = 0;
        int ind2 = ind+1;
        int newAr[] = new int[ar.length];
        for(int i = 0;i<ar.length;i++){
            if(ind1>ind){
                newAr[i]=ar[ind2];
                ind2++;
            }
            else if(ind2>ar.length-1){
                newAr[i]=ar[ind1];
                ind1++;
            }
            else if(ar[ind1]<ar[ind2]){
                newAr[i]=ar[ind1];
                ind1++;
            }
            else{
                newAr[i]= ar[ind2];
                ind2++;
            }
        }

        System.out.println(Arrays.toString(newAr));

       

        
    }
}