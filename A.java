/* /**
 * Pra
 */

/* import java.lang.String;
public class Pra {

    public static void main(String[] args) {

        String str="abAc";

        String s=new String(str);

        String a=s.substring(2);

        System.out.println(s.charAt(2));
        System.out.println(s.codePointAt(2));

        System.out.println(s.codePointBefore(3));

        System.out.println(s.codePointCount(0, 2));

        System.out.println(s.compareTo("z"));
        
    }
} */


/* class Derived {
    public void getDetails(String temp) {
        System.out.println("Derived class " + temp);
    }
}

public class Pra extends Derived {
    public void getDetails(String temp) {
        System.out.println("Test class " + temp);
       // return 0;
    }

    public static void main(String[] args) {
        Pra obj = new Pra();
        obj.getDetails("GFG");
    }
}
 */


/**
 * Pra
 */
/* public class Pra {

    public static void main(String[] args) {
       // System.out.println(fun());

       String s1="abc";
       String s2="abc";
       System.out.println(s1.equals(s2));
    }

    
}

 */

/* 
s=race
s=care */

//import java.util.Arrays;

/**
 * Pra
 */
/* public class Pra {

    public static void main(String[] args) {
        String s1="race";
        String s2="careq";

    

        char[] c1=s1.toCharArray();
        char[] c2=s2.toCharArray();

        // System.out.println(c1.toString());

        Arrays.sort(c1);
        Arrays.sort(c2);

        boolean s=Arrays.equals(c1, c2);

        if(s)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("noo");
        }
    }
} */

/* 
interface left
{
    void m1();
    int x=888;
}

interface right
{
    int m1();
    int x=999;
}

class Demo implements left,right
{
    public int m1()
    {
        return 1;
    }
    public void m1()
    {
        System.out.println("void..");
    }

    public void dis()
    {
        System.out.println(left.x);
        System.out.println(right.x);

    }

    
} */
/* 
abstract class Sup
{
    public Sup()
    {
        System.out.println("sup abstract..");
    }

   abstract public void Met();
}

class Sub extends Sup 
{
    public void Met()
    {
        System.out.println("sub met");
    }
} */

/**
 * Pra
 */
/* public class Pra {

    public static void main(String[] args) {
        Sub s=new Sub();
        s.Met();
    }
} */


/**
 * Pra
 */
/* public class Pra {

    public static void main(String[] args) {
        String s1="abc";
        String rev="";
        for(int i=0;i<=s1.length()-1;i++)
        {
            rev=s1.charAt(i)+rev;

        }

        System.out.println(rev);
    }
} */


/**
 * Pra
 */
/* public class Pra {

    public static void main(String[] args) {
        String s="abcabcbb";

        int count=0;

        int p_u=s.codePointAt(0);
        

        for(int i=1;i<=s.length()-1;i++)
        {
            int c_u=s.codePointAt(i);
            if(c_u==p_u+1)
            {
                count++;
            }
            p_u=c_u;
        }

        System.out.println(count);
    }
} */
/* 

class A 
{
    final public int met()
    {
        return 1;
    }
}

class B extends A 
{
   final public int met(int a)
    {
        return 2;
    }
}

public class Pra {

    public static void main(String[] args)
    {
        B b1=new B();
        System.out.println(b1.met());
        System.out.println(b1.met(9));
    }
} */

//import java.util.Arrays;

/**
 * Pra
 */
/* public class Pra {

    public static void main(String[] args) {
        int[] arr={3,7,4,9,3,8};

        Arrays.sort(arr,2,arr.length);

        System.out.println(Arrays.toString(arr));

        int a=Arrays.binarySearch(arr,)
    }
} */

/**
 * Pra
 */
/* 
import java.util.Scanner;
public class Pra {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); */
        //int n=9;
        // String s="";

        /* while (n>0) {
            int r=n%2; */
            // s=r+s;
           /*  System.out.print(r);
            n/=2;

            
        }
        System.out.println();

        int basev=1;
        int bin=0;

        while(n>0)
        {
            int d=n%2;
            bin=bin+d*basev;
            basev=basev*10;
            n/=2;
        }

        System.out.println(bin);


        
    }
} */

/* 
class Clidder
{ 
	public final void flipper() 
	{ 
		System.out.println("Clidder"); 
	} 
} 

public class Pra extends Clidder 
{ 
	public final void flipper() 
	{ 
		System.out.println("Clidlet"); 
	} 
	public static void main(String[] args) 
	{ 
		new Pra().flipper(); 
	} 
} 
 */

/* 
class Alpha 
{ 
	static String s = " "; 
	protected Alpha() 
	{ 
		s += "alpha "; 
	} 
} 
class SubAlpha extends Alpha 
{ 
	private SubAlpha() 
	{ 
		s += "sub "; 
	} 
} 

public class SubSubAlpha extends Alpha 
{ 
	private SubSubAlpha() 
	{ 
		s += "subsub "; 
	} 
	public static void main(String[] args) 
	{ 
		new SubSubAlpha(); 
		System.out.println(s); 
	} 
} 
 */

/* 

public class A extends B
{
	public static String sing() 
	{
		return "fa";
	}
	public static void main(String[] args) 
	{
		A a = new A();
		//B b = new A();
	System.out.println(a.sing());
	}
}
class B 
{
	public static String sing() 
	{
		return "la";
	}
}
 */



/* public class A { 
	public static void main(String[] args) 
	{ 
		char[] str = { 'i', 'n', 'c', 'l', 'u', 
				'd', 'e', 'h', 'e', 'l', 'p' }; 
		System.out.println(str.toString()); 

        String res=new String(str);

        System.out.println(res);
	} 
} 
 */


/**
 * A
 */
    public class A {

        public static void main(String[] args) {
            String s1 = "anagrab";
            String s2 = "margana";

            int s1len = s1.length();
            int s2len = s2.length(); 

            if (s1len != s2len) {
                System.out.println("noo");
            } else {
                for (int i = 0; i < s1len; i++) {
                    char c = s1.charAt(i);
                    String s = new String(new char[] {c}); 

                    if (s2.contains(s)) { 
                        continue;
                    } else {
                        System.out.println("noo"); 
                        return; 
                    }
                }
                System.out.println("yes");
            }
        }
    }
