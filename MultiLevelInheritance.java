import java.io.*;

class Ornaments
{
	double cost;//eg.$35,000.567
	boolean HasWarranty;
}
class Watch extends Ornaments
{
	int hours;
	int minutes;
	int seconds;
}
class Rolex extends Watch
{
	String bought_place;
	String watch_type;
	int carates_of_gold;
	void input()
	{
		cost=17293.978;
		HasWarranty=false;
		hours=16;
		minutes=54;
		seconds=35;
		bought_place="Abu dhabi";
		watch_type="analog";
		carates_of_gold=24;
	}
	void display()
	{
		System.out.println("detail of ROLEX watch that I brought\ncost=$"+cost+"\nwarranty!="+HasWarranty+"\ntime="+hours+":"+minutes+":"+seconds+"\nbought in "+bought_place+"\nwatch is of "+carates_of_gold+" carates "+watch_type+" gold\n");
	}
}

class MultiLevelInheritance
{
	public static void main(String[] args) {
		Rolex r=new Rolex();
		r.input();
		r.display();
	}
}