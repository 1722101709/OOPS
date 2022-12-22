import java.util.*;
public class ScannerExample {
	public static void main(String[] args) {
		Scanner take=new Scanner(System.in);
		System.out.println("give the number");
		int a=take.nextInt();
		int b=1;
		for(int i=1;i<=a;i++)
		{
			b*=i;
		}
		System.out.println("factorial of "+a+" is "+b);
	}
}