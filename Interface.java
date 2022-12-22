import java.io.*;
interface Vitamin
{
	void mapping();
	void display();
}
class Uses implements Vitamin
{
	char lemon;
	char leafy_vegetables;
	char sunlight;
	char carrot;
	char dates;
	public void mapping()
	{
		lemon='C';
		leafy_vegetables='B';
		sunlight='D';
		carrot='A';
		dates='K';
	}
	public void display()
	{
		System.out.println("vegetables->vitamins\nlemon->"+lemon+"\nleafy vegetables->"+leafy_vegetables+"\nsunlight->"+sunlight+"\ncarrot->"+carrot+"\ndates->"+dates);
	}
}
class Interface
{
	public static void main(String[] args) {
		Uses a=new Uses();
		a.mapping();
		a.display();
	}
}