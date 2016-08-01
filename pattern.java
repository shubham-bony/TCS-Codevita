import java.io.*;
import java.lang.*;
   class pattern{
        public static void main(String args[]) throws IOException{
        	int s=0;
          BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
          
          String str = buff.readLine();
          for ( int i = 0; i < str.length(); ++i ){
            char c = str.charAt(i);
            int j = (int) c;// your work is done here
            if (j==32)
            	System.out.println();
            else
            {s=j-64;

            	if(i%2==0)
            	{
            		for(int y=s;y>0;y--)
            			System.out.print("0");
            	}
            	else
            	{
            		for(int y=s;y>0;y--)
            			System.out.print("!");
            	}
            }}
        }
      }
