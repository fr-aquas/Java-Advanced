class InheritanceCyclicMotion 
{
	public static void main(String[] args) 
	{
		C c1;
		c1= new C();
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
class C extends B
{
	int k;
	C()
	{
		System.out.pritnln("C's constructor executed");
	}
}