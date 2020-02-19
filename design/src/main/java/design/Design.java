package design;

	
import java.util.*;
interface Calculate
{
	public int process_numbers(int a,int b);
}
	class Add implements Calculate
	{
		public int process_numbers(int a,int b)
		{
			return (a+b);
		}
		
	}
	class Subtract implements Calculate
	{
		public int process_numbers(int a,int b)
		{
			return (a-b);
		}
	}
	class Multiply implements Calculate
	{
		public int process_numbers(int a,int b)
		{
			return (a*b);
		}
	}
	class Divide implements Calculate
	{
		public int process_numbers(int a,int b)
		{
			return (a/b);
		}
	}
	public class Design 
	{
	    public static void main( String[] args )
	    {
	    	Scanner sc= new Scanner(System.in);
	        Calculate c;
	        System.out.println("enter first element : ");
	        int num_1=sc.nextInt();
	        System.out.println("enter second element : ");
	        int num_2=sc.nextInt();
	        c=new Add();
	        System.out.println("after addition between "+num_1+" and "+ num_2+ " : "+c.process_numbers(num_1, num_2));
	        c=new Subtract();
	        System.out.println("after subtraction between "+num_1+" and "+ num_2+ " : "+c.process_numbers(num_1, num_2));
	        c=new Multiply();
	        System.out.println("after multiplication between "+num_1+" and "+ num_2+ " : "+c.process_numbers(num_1, num_2));
	        c=new Divide();
	        System.out.println("after dividion between "+num_1+" and "+ num_2+ " : "+c.process_numbers(num_1, num_2));
	        sc.close();
	    }
	}



