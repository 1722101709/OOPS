class OverLoadingOrStaticPolymorphism{
	public void wish()
	{
		System.out.println("hi");
	}
	public void wish(String s)
	{
		System.out.println(s);
	}
	public void wish(String s,int a)
	{
		for(int i=0;i<a;i++)
		{
		System.out.println("\t"+s);
		}
	}
	
	public static void main(String[] args) {
OverLoadingOrStaticPolymorphism b=new OverLoadingOrStaticPolymorphism();
b.wish();
b.wish("Good morning",3);
b.wish("how are you!");

	}
}