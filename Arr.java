/* public class Arr {
    public static void main(String[] args) {
        int rowCount = 5;
        int currentNumber = 11;

        for (int i = 1; i <= rowCount; i++) {
            for (int j = rowCount - i; j > 0; j--) {
                System.out.print("   ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(currentNumber + " ");
                currentNumber = getNextPrime(currentNumber);
            }

            System.out.println();
        }
    }

    public static int getNextPrime(int currentNumber) {
        int nextNumber = currentNumber + 1;
        while (!isPrime(nextNumber)) {
            nextNumber++;
        }
        return nextNumber;
    }

    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
  */


/**
 * Arr
 */
/* public class Arr {

    public static void main(String[] args) {
        int n=5;
        int c=11;
        for(int i=1;i<=n;i++)
        {
            for(int j=n-i;j>=1;j--)
            {
                System.out.print(" ");
            }

            for(int k=1;k<=i;k++)
            {
                if(prime(c))
                {

                
                System.out.print(c+" ");
                }
                else
                {
                    c++;
                }

            }


            
           System.out.println();
        }

        
        
    }

    public static boolean prime(int m)
        {
            int co=0;
            for(int i=1;i<=m;i++)
            {
                if(m%i==0)
                {
                    co++;
                }
            }
            if(co==2)
            {
                return false;
            }
            else
            {
                return true;
            }
        }
}  */



/**
 * Arr
 */
public class Arr {

    public static void main(String[] args) {
        
    }
}