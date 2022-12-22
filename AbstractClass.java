import java.io.*;
abstract class Identification
{
	String get_method()
	{
		return "iris scan";
	}
	abstract boolean check(String x);
}
 class Details extends Identification
{
	public boolean check(String x)
	{
		if(x=="iris scan")
		{
			return true;
		}
		return false;
	}
}
class AbstractClass
{
	public static void main(String[] args) {
		Details d=new Details();
		System.out.println(d.check(d.get_method()));
	}
}