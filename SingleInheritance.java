import java.io.*;
class Vehicle
{
	int mileage;
	String fuel_type;
	String ownername;
}
public class Lorry extends Vehicle
{
	boolean HasNationalPermit;
	int load_capacity;
	String cleaner_name;
	
	void input()
	{
		mileage=50;
		fuel_type="diesel";
		ownername="rangaiah";
		HasNationalPermit=true;
		load_capacity=1729;//kgs
		cleaner_name="samba";
	}
	
	void display()
	{
		System.out.println("mileage="+mileage+"\nfuel type="+fuel_type+"\nownername="+ownername+"\nnational permit="+HasNationalPermit+"\nload capacity ="+load_capacity+"\ncleaner name="+cleaner_name);
 }
 
}
class StringInheritance
{
	public static void main(String[] args)
	 {
		Lorry L=new Lorry();
		L.input();
		L.display();
	}
}