import java.util.*;

abstract class Shape
{
 double area;
 Scanner scan= new Scanner(System.in);

	abstract void input();
    abstract void calcArea();

	void disp()
	{
		System.out.println("Area is = "+area);
	}
}

class Square extends Shape
{
	double l;

	void input()
	{
		
		System.out.println("Enter the value of lenght l= ");
		l= scan.nextFloat();
	}
     void calcArea()
    {
        area= l*l;
    }
}

class Rectangle extends Shape 
{
	double l,b;
	
	void input()
	{
		
		System.out.println("Enter the value of length l= ");
		l=scan.nextFloat();
		System.out.println("Enter the value of breadth b= ");
		b=scan.nextFloat();
	}
 
     void calcArea()
	{
		 area=l*b;
	 }
}

class Circle extends Shape
{
	double r;

	void input()
	{
		
		System.out.println("Enter the value of radius r= ");
		r=scan.nextFloat();
	}

	void calcArea()
	{
		area=3.14f*r*r;
	}
}

class Geometry
{
	void allowShape(Shape ref)
	{
		ref.input();
        ref.calcArea();
		ref.disp();
	}
}

class ShapeApp
{
	public static void main(String []args)
	{
		Square s=new Square();
		Rectangle r= new Rectangle();
		Circle c= new Circle();
		Geometry g =new Geometry();

		g.allowShape(s);
		g.allowShape(r);
		g.allowShape(c);
	}
}