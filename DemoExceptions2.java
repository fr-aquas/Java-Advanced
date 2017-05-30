import java.util.*;
class  DemoExceptions2
{
	public static void main(String[] args) 
	{
		System.out.println("Entering main()");
		
		int a[]=new int[5];
		int i;
		Scanner scan=new Scanner(System.in);
		
		
		for (i=0;i<=4 ;i++ )
		{
			System.out.println("Enter an element= ");
			a[i]=scan.nextInt();
		}
		 for (i=0;i<=5 ;i++ )
		 {
			 System.out.println(a[i]);
		 }

		System.out.println("Exiting in normal mannner");
	}
}
