import java.util.Arrays;

public class S {

    public static void main(String[] args) {
        int[] ar = {1, 1,2,3,3,3,3};
        int[] temp = new int[ar.length];
        temp[0] = ar[0];

        for (int i = 1; i < ar.length; i++) {
            if (ar[i] <= temp[i - 1]) {
                int sum = 0;
                for (int j = i; j < ar.length; j++) {
                    sum += ar[j];
                    if (sum > temp[i-1]) {
                        temp[i] = sum;
                        i=j;
                        break;
                    }
                }
            } else {
                temp[i] = ar[i];
            }
        }

        System.out.println(Arrays.toString(temp));
        
    }
}
