class Person
{
	String name;
	int age;
	Person(int a,String b)
	{
		age=a;
		name=b;
	}
	void display(){
		System.out.println("----------------------->PERSON DETAILS<--------------------------");
		System.out.println("name:-"+name+"\tage:-"+age);
	}
}
class Student extends Person
{
	int rollno;
	String branch;
	Student(int a,String b,int c,String d)
	{
		super(a,b);
		rollno=c;
		branch=d;
	}
	void display()
	{
		System.out.println("----------------------->STUDENT DETAILS<--------------------------");
		System.out.println("name:-"+name+"\tage:-"+age+"\trollno:-"+rollno+"\tbranch:-"+branch);
	}
}
class Employee extends Person
{
	int ecNo;
	String doj;//date of joining eg:-23/11/2021
	Employee(int a,String b,int c,String d)
	{
		super(a,b);
		ecNo=c;
		doj=d;
	}
	void display()
	{
		System.out.println("----------------------->EMPLOYEE DETAILS<--------------------------");
		System.out.println("name:-"+name+"\tage:-"+age+"\tecNo:-"+ecNo+"\tdate of joining:-"+doj);
	}
}
class Faculty extends Employee
{
	String designation;//Assistant Professor (or) Associate Professor (or) Professor
	Faculty(int a,String b,int c,String d,String e)
	{
		super(a,b,c,d);
		designation=e;
	}
	void display()
	{
		System.out.println("----------------------->FACULTY DETAILS<--------------------------");
		System.out.println("name:-"+name+"\tage:-"+age+"\tecNo:-"+ecNo+"\tdate of joining:-"+doj+"\tdesignation:-"+designation);
	}
}
class Staff extends Employee
{
	String designation;//Technical or Clerical
	Staff(int a,String b,int c,String d,String e)
	{
		super(a,b,c,d);
		designation=e;
	}
	void display()
	{
		System.out.println("----------------------->STAFF DETAILS<--------------------------");
		System.out.println("name:-"+name+"\tage:-"+age+"\tecNo:-"+ecNo+"\tdate of joining:-"+doj+"\tdesignation:-"+designation);
	}
}
 public class MainDemoClass
 {
 	public static void main(String[] args) {
 		Person a=new Person(19,"mohan kumar");
 		Student b=new Student(19,"mohan kumar",411935,"cse");
 		Employee c=new Employee(27,"jack sparrow",1234,"23/7/2019");
 		Faculty d=new Faculty(27,"jack sparrow",1234,"23/7/2019","professor");
 		Staff e=new Staff(21,"jack",4567,"27/7/2019","Clerical");
 		a.display();
 		b.display();
 		c.display();
 		d.display();
 		e.display();
 	}
 }