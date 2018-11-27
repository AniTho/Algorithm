import java.io.*;
import java.util.*;
class prg
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();                   
	int arr[][]=new int[n][n];   
	int visit[]=new int[n];
	for(int i=0;i<n;i++)                 
	{
		for(int j=0;j<n;j++)
		{
		arr[i][j]=sc.nextInt();
	    }
		visit[i]=0;
	}
      int cost=0;
      int counter=1;
      int node=0;
      int path[]=new int[n+1];
      path[0]=1;
      int t=1;
      while(counter < n)
      {
    	  int jj=0;
    	  int min=999;
    	  int k=node;
    	  for(int j=0;j<n;j++)
    	  {
    		  if(arr[node][j]!=0) 
    		  {
    		   if(visit[j]==0)
    		  {
    			  if(arr[node][j]<min)
    			  {
    				  min=arr[node][j];
    				  jj=j;
    			  }
    		  }
    	  }
    	  }
    	  System.out.println("min= "+ min);
    	  visit[node]=1;
    	  node=jj;
    	  arr[node][k]=0;
    	  cost=cost+min;
    	  counter++;
    	  path[t]=node+1;
    	  t++;
      }
      cost=cost+arr[0][node];
      path[n]=1;
     for(int i=0;i<=n;i++)
      {
    	  System.out.print(path[i] + "  ");
      }
      System.out.print("cost="+ cost);
	}
}
