class WithoutSuperKeyword
{
	public static void main (String []args)
	{
		B b1;
		b1= new B();
		b1.setData(10,20);
		b1.disp();
	}
}

class A
{
	int i;
}

class B extends A
{
	int i;

	void setData(int x,int y)
	{
		i=x;
        i=y;
	}
	void disp()
	{
		System.out.println("The value of x= "+i);
		System.out.println("The value of y= "+i);
	}
}
