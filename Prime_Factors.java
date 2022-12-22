import java.util.*;
public class Prime_Factors {
	public static void main(String[] args) {
		int n;
		Scanner b=new Scanner(System.in);
		n=b.nextInt();
		System.out.println("prime factors of "+n+" are :-");
		for(int i=2;i<=(n/2);i++)
		{
			if(n%i==0)
			{
				int count=0;
				for(int j=2;j<i;j++)
				{
					if(i%j==0)
					{
						count++;
					}
				}
				if(count==0)
				{
					System.out.println(i);
				}
			}
		}
	}
}