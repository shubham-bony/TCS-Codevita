import java.math.*;
import java.util.Scanner;
class sumPrime
{	
	public static void main(String[] args)
	{
		int a[]=new int[1000];
		int k=1;
		int c;
		int z=0;
		int sum;
		int count=0;
		a[0]=2;
		Scanner keyboard= new Scanner(System.in);
		int n=keyboard.nextInt();
		for(int i=1;i<=n;i++)
		{	c=0;
			for(int j=i;j>1;j--)
			{
				if((i%j)==0)
				{	
					c++;
				}
				else
				{
					z=i;
				} 
			}
			if(c==1)
			{
				a[k]=z;
				k++;
			}
		}

		for(int x=2;x<k;x++)
		{	sum=0;
			for(int y=0;y<x;y++)
			{
				sum+=a[y];
				if(sum==a[x])
				{
					count++;

				}

			}
		}
		System.out.println(count);

	}
}