class Room
{
	int l,b;
	Room(int x,int y)
	{
		l=x;
		b=y;
	}
	void area()
	{
		int area;
		area =l*b;
		System.out.println("Area is = "+area);
	}
}

class Bedroom extends Room
{
	int h;
	Bedroom(int x,int y,int z)
	{
		super(x,y);
		h=z;
	}

	void volume()
	{
		int vol;
		vol=l*b*h;
		System.out.println("Volume is = "+vol);
	}
}

class RoomAppWidSupK
{
	public static void main(String []args)
	{
		Bedroom br;
		br=new Bedroom(10,20,30);
		br.area();
		br.volume();
	}
}