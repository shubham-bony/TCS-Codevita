import java.math.*;
import java.util.Scanner;
import java.io.*;
import java.lang.*;
class mahaBharat1
{
	public static void main(String args[])
	{
		
		int p=0;
		int c=0;
		Scanner in = new Scanner(System.in);
int n = in.nextInt();
		int a[][]=new int[100][100];
		      int k=1, c1=0, c2=n-1, r1=0, r2=n-1;
 
        while(k<=n*n)
        {
        	for(int i=c1;i<=c2;i++)
        	{
             	a[r1][i]=k++;
            }
 			
   	        for(int j=r1+1;j<=r2;j++)
            {
                a[j][c2]=k++;
            }
 
            for(int i=c2-1;i>=c1;i--)
            {
                a[r2][i]=k++;
            }
 
            for(int j=r2-1;j>=r1+1;j--)
            {
 	             a[j][c1]=k++;
            }            
 			p++;
           	c1++;
          	c2--;
           	r1++;
           	r2--;
        }
        for (int i=0;i<n;i++) 
        {
        	for(int j=0;j<n;j++)
			{	if(j!=0)  
				System.out.print(" ");
        		System.out.print(+a[i][j]);
        	}
        	System.out.println();
        }
        System.out.println("Total Power points: "+p);
        System.out.println("(0,0)");
        c1=0;
        c2=n-1;
        r1=0; 
        r2=n-1;
        k=1;
        while(k<=n*n)
        {
            for(int i=c1;i<=c2;i++)
            {
                k++;
                if(a[r1][i]%11==0)
                    {System.out.println("("+r1+","+i+")");}
            }
            
            for(int j=r1+1;j<=r2;j++)
            {
                k++;
                if(a[j][c2]%11==0)
                    {System.out.println("("+j+","+c2+")");}

            }
 
            for(int i=c2-1;i>=c1;i--)
            {
                k++;
                if(a[r2][i]%11==0)
                    {System.out.println("("+r2+","+i+")");}
            }
 
            for(int j=r2-1;j>=r1+1;j--)
            {
                 k++;
                 if(a[j][c1]%11==0)
                    {System.out.println("("+j+","+c1+")");}
            }            
            p++;
            c1++;
            c2--;
            r1++;
            r2--;
        }
	}
}