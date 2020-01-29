public class Main
{
	public static void main(String[] args)
	{
	    int a[] = { 1,2,3,4,5 } , n=0 ;
	    
	    for(int x : a) n = n*10 + x;                //converting to integer
	    n++;                                         
	    a = new int[(int)(Math.log(n)/Math.log(10)) + 1];  //new array allocation after increment
	    
	    for(int i=a.length-1;i>=0;i--)          
	    {
	        a[i] = n%10;                        // inserting new values
	        n /= 10;                            //  into array
	    }
	    
	    for(int x : a) System.out.print(x+" ");
	}
}
// time complexity 2n+1
// space n+1