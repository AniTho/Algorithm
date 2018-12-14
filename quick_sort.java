import java.util.*;
class prg
{
public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
 int n=sc.nextInt();
 int arr[]=new int[n];
 for(int i=0;i<n;i++)
 {
	 arr[i]=sc.nextInt();
 }
 q_sort(arr,0,n-1);
 System.out.println("The sorted array is: ");
 for(int i=0;i<n;i++)
 {
	 System.out.print(arr[i] + " ");
 }
 }
static void q_sort(int arr[],int l,int r)
{
	int i=l;
	int j=r;
	int piv=arr[(l+r)/2];
	while(i<=j)
	{
		while(arr[i]<piv)
			i++;
		while(arr[j]>piv)
			j--;
		
		if(i<=j)
		{
			int t=arr[i];
			arr[i]=arr[j];
			arr[j]=t;
			i++;
			j--;
		}
	}
	if(l<j)
		q_sort(arr,l,i-1);
	if(i<r)
		q_sort(arr,i,r);
}
}
