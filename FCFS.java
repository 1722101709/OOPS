import java.util.*;

class Fcfs{
int orderness(int temp[],int n)
{ 
int a=1;
	for(int i=1;i<=n;i++)
	{
	  if(temp[i]>=temp[a] && temp[i]>=0)
	  {
			a=i;
		}
	}
	return a;
}

public static void main(String args[])
{
	int n;
	Fcfs f=new Fcfs();
	Scanner s=new Scanner(System.in);
	double avgtat=0,avgwt=0,throughput;
	System.out.println("supply the processes count");
	n=s.nextInt();
	System.out.println();
	int[] at=new int[n+1];
	int[] bt=new int[n+1];
	int[] ct=new int[n+1];
	int[] wt=new int[n+1];
	int[] tat=new int[n+1];
	int[] p=new int[n+1];
	int[] temp=new int[n+1];

 	System.out.println("give the arrival and burst times of each process one after other");
	at[0]=0;
	bt[0]=0;
	p[0]=0;
	for(int i=1;i<=n;i++)
	{
		at[i]=s.nextInt();
		bt[i]=s.nextInt();
	}
	for(int i=0;i<=n;i++)
	{
		temp[i]=at[i];
	}
	for(int i=n;i>0;i--)
	{
		p[i]=f.orderness(temp,n);
		temp[p[i]]=-1;
	}
	ct[p[1]]=at[p[1]]+bt[p[1]];
	wt[p[1]]=0;
	tat[p[1]]=ct[p[1]]-at[p[1]];
	for(int i=2;i<=n;i++)
	{
ct[p[i]]=(ct[p[i-1]]>at[p[i]])?(ct[p[i-1]]+bt[p[i]]):(at[p[i]]+bt[p[i]]);
wt[p[i]]=(ct[p[i-1]]>at[p[i]])?(ct[p[i-1]]-at[p[i]]):0;
		tat[p[i]]=ct[p[i]]-at[p[i]];
	}
	for(int i=1;i<=n;i++)
	{
		avgtat=tat[i]+avgtat;
		avgwt=wt[i]+avgwt;
	}
	avgwt/=n;
	avgtat/=n;
	System.out.println("pid  at   bt   ct   tat   wt  ");
	for(int i=1;i<=n;i++)
	{
		System.out.println(p[i]+"   "+at[p[i]]+"    "+bt[p[i]]+"    "+ct[p[i]]+"    "+tat[p[i]]+"    "+wt[p[i]]+"    ");
	}
	System.out.println();
	System.out.println();
		System.out.println("average wt="+avgwt);
			System.out.println();
			System.out.println("average tat="+avgtat);
System.out.println("throughput="+n+"/"+ct[p[n]]);
}
}