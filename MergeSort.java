package Assignment6;

import java.util.Scanner;
public class MergeSort {

	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int a[];
		int b[];
		System.out.print("Enter the no of element in array1");
		int asize=sc.nextInt();
		System.out.print("Enter array1 in sorted order");
		a=new int[asize];
		for(int i=0;i<asize;i++)
		{
		    a[i]=sc.nextInt();
		}
		System.out.print("Enter the no of element in array2");
		int bsize=sc.nextInt();
		System.out.print("Enter array2 in sorted order");
		b=new int[bsize];
		for(int i=0;i<bsize;i++)
		{
		    b[i]=sc.nextInt();
		}
		MergeSort obj=new MergeSort();
		int c[]=new int[asize+bsize];
		c=obj.join(a, asize, b, bsize, c);
		for(int i=0;i<asize+bsize;i++)
		{
		    System.out.print(c[i]+"\t");;
		}
		sc.close();
	}
	
	public int[] join(int a[], int asize, int b[], int bsize, int c[])
	{
		int i,j,k;
		for(i=0,j=0,k=0;i<asize&&j<bsize;k++)
		{
			if(a[i]<b[j])
			{
				c[k]=a[i++];
			}
			else
			{
				c[k]=b[j++];
			}
		}
		while(i<asize)
		{
			c[k++]=a[i++];
		}
		while(j<bsize)
		{
			c[k++]=b[j++];
		}
		return c;
	}
}
