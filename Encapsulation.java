import java.io.*;
public class Organism
	{
		private int lifespan;
		private String living_place;
		private String name;
	public Organism(int x,String y,String z)
		{
			lifespan=x;
			living_place=y;
			name=z;
		}
		public void information()
		{
System.out.println(name+" lives in "+living_place+" for "+lifespan+" years");
		}
	}

class Encapsulation
{
   public static void main(String[] args)
   {
	Organism org=new Organism(300,"water","dolphin");
	org.information();
	}
}