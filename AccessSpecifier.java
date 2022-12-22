public class Fun
{
	private int x=13;
	protected void talk()
	{
		System.out.println("no words");
		System.out.println(x);
	}
}
class Frustation extends Fun
{
	void getangry()
	{
	System.out.println("not at all");
		talk();
	}
}
class AccessSpecifier{
	public static void main(String[] args) {
		Frustation f=new Frustation();
		f.getangry();
		f.talk();
	}
	}