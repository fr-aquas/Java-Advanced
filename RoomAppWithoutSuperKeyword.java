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
		int res;
		res=l*b;
		System.out.println("Area is = "+res);
	}

class Bedroom extends Room
{
	int h;
		Bedroom(int x,int y,int z)
	{
		h=z;
		
	}

     void volume()
	{
		 res=l*b*h;
		 System.out.println("Volume is = "+res);

	 }
}

class RoomAppWthtSupK
	{ 
	public static void main(String []args)
		{
    Bedroom br;
	br=new Bedroom(10,20,30);
		br.area();
	br.volume();
		}
}