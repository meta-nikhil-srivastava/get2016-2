package session7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LeftMostElement 
{
	List<Integer> numbers;
	
	public LeftMostElement()
	{
		numbers=new ArrayList<Integer>();
	}
	public void addElement(int value)
	{
		boolean flag=false;
		for(int index=0;index<numbers.size();index++)
		{
			if(value<numbers.get(index))
			{
				numbers.add(index,value);
				flag = true;
				break;
			}			
		}
		if(!flag)
		{
			numbers.add(numbers.size(),value);
		}
	}
	
	public void getLeftmostPosition(int number)
	{
		int position=mergeSort(number, 0, numbers.size()-1);
		System.out.println("Left most position of number is: "+ (position+1));
	}
	
	public int mergeSort(int number,int low,int high)
	{
		int mid=(low+high)/2;
		int leftposition;
		if(low>high)
		{
			return -1;
		}
		else if(number==numbers.get(mid))
		{
			leftposition= mergeSort(number, low, mid-1);
			if(leftposition==-1)
			{
				return mid;
			}
			else 
			{
				return leftposition;
			}
		}
		
		else if(number<numbers.get(mid))
		{
			return mergeSort(number, low, mid-1);
		}
		else
		{
			return mergeSort(number, mid+1, high);
		}
	}
	
	public void display()
	{
		System.out.println();
		for(int i=0;i<numbers.size();i++)
		{
			System.out.print(numbers.get(i)+"\t");
		}
	}
	public static void main(String args[])
	{
		LeftMostElement LE=new LeftMostElement();
		Scanner sc = new Scanner(System.in);
		int option=0;
		{
			do{
				do
				{	
					try
					{
						System.out.println("1. add more numbers");
						System.out.println("2. Search number position");
						System.out.println("3. display array");
						option=sc.nextInt();
					}
					catch(Exception e)
					{
						System.out.println("Wrong choose entered");
					}
				}while(option<1&&option>2);
			
				if(option==1)
				{
					System.out.println("Enter the number");
					int number=sc.nextInt();
					LE.addElement(number);
				}
				
				else if(option==2)
				{
					System.out.println("Enter the number to be searched");
					int number=sc.nextInt();
					LE.getLeftmostPosition(number);
				}
				
				else if(option==3)
				{
					LE.display();
				}
			}while(option!=2);
		}
	}
}
