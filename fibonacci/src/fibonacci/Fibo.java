package fibonacci;
import java.util.*;

public class Fibo 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number between 1-20: ");
		
		int n=sc.nextInt();
		
		if (n > 20) 
		{
			System.out.println("Please enter a number within the range. Re - run the program");
		}
		
		else
		{
		    int a=0,b=1,next;
		    System.out.println("Fibonacci series is: ");
		
		    int i=0;
	
		    while(i<n)
		        {
		            if(i<=1)
		            next=i;
			
		            else
		                {
		                     next=a+b;
		                     a=b;
		                     b=next;
		                }
		            System.out.print(next + ", ");
		            i++;
		         }
		    System.out.println("\r\n" + "Re - run the program for another number.");
		}
	}
}
