import java.util.*;
class DemoExceptions1 
{
	public static void main(String[] args) 
	{
		System.out.println("entering the main method");
		Scanner scan= new Scanner(System.in);
			int a,b,c;
		{
		System.out.println("Enter a= ");
		a=scan.nextInt();
		System.out.println("Enter b= ");
		b=scan.nextInt();
		c=a/b;
		System.out.println(c);
		}
		System.out.println("Exiting in normal manner");

	}
	
}

