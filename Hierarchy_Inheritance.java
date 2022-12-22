class verb 
{
	protected String x="explain";
	void display()
	{
		System.out.println(x);
	}
}
class helping_verb extends verb
{
	String x;
	void show()
	{
		System.out.println(x+"\n"+super.x);
	}
}
class auxiliary_verb extends verb
{
	String x;
	void show()
	{
		System.out.println(x+"\n"+super.x);
	}
}
	class Hierarchy_Inheritance {
	public static void main(String[] args) {
		verb v=new verb();
		v.display();
		helping_verb h=new helping_verb();
		h.x="have";
		h.show();
		auxiliary_verb a=new auxiliary_verb();
		a.x="does";
		a.show();
	}
}