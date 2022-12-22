class Fruit
{
	Fruit(){
		System.out.println("every fruit has seed");
	}
	void eat()
	{
		System.out.println("tasty food only");
	}
}
class Mango extends Fruit
{
	
	Mango()
	{
	System.out.println("mango has only one seed");
	}
	void eat()
	{
		System.out.println("healthy food only");
		super.eat();
	}
}
	public class DynamicPolymorphismOrMethodOverriding {
	public static void main(String[] args) {
		Fruit f=new Fruit();
		Fruit m=new Mango();
		m.eat();
		
	}
}