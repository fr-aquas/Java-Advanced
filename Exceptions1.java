import java.util.*;
class Exceptions1
{
	public static void main(String[] args) 
	{
		System.out.println("Entering Main()");
		Scanner scan=new Scanner(System.in);
		{
			int a,b,c;
			System.out.println("Enter a= ");
			a=scan.nextInt();
			System.out.println("Enter b= ");
			b=scan.nextInt();
			try
			{
			c=a/b;	
			System.out.println(c);
			}
			catch (Exception e)
			{
				System.out.println("System has accounted an error");
			}
			
		}
		System.out.println("Exiting in normal manner");
	}
}
