import java.util.*;
class  Exceptions2
{
	public static void main(String[] args) 
	{
		System.out.println("Entering main()");
		int a[]=new int[5];
		int i;
		Scanner scan =new Scanner(System.in);

		for (i=0;i<=4 ;i++ )
		{
			System.out.println("Enter an element= ");
			a[i]=scan.nextInt();

		}

		try
		{
			for (i=0;i<=5 ;i++ )
			
			{
				System.out.println(a[i]);
			}
			
		}
		catch (Exception e)
		{
			System.out.println("Problem encoutered");
		}

		System.out.println("Exiting in normal manner");


	}
}
