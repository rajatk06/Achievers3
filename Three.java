import java.util.*;
public class Main
{
    public static int maxSum(int a[]) //function to get the max sum
    {
        if(a.length==0)
        { 
        return 0;
        }
        int max=a[0],m=a[0];                        //initialising variables
        for(int i=1;i<a.length;i++)
        {
            m = (int)Math.max(a[i],a[i]+m);           //sum till ith number
            max = (int)Math.max(m,max);               //update max value
        }
        return max;
    }
	public static void main(String[] args)
	{
	    int a[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
	    System.out.println( maxSum(a) );
	}
}

//time complexity O(n)
//space 1 