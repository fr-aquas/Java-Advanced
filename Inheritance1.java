class Inheritance1
{
	public static void main(String[] args) 
	{
	 B b1;
	 b1= new B();
	}
}

class C
{ int k;
     C()
	{
System.out.println("C's constructor executed");
	}
}

class A extends C
{ 
	int i;
	A()
	{
		System.out.println("A's constructor executed");
	}
}

class B extends A
{
	int j;
	B()
	{
		System.out.println("B's contructor executed");
	}
}