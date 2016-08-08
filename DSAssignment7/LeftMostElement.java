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
	
	public int getLeftmostPosition(int  item)
	{
		int temp=-1;
		int start = 1, end = numbers.size();

		while (start <= end) 
		{
			int mid = (start + end / 2);
			if ( numbers.get(mid) == item ) 
			{
				end=mid-1;
				temp=mid;
				continue;
			}
			if ( numbers.get(mid) > item) 
			{
				end = mid - 1;
		    }
			if ( numbers.get(mid) < item) 
			{
				start = mid + 1;
			}
	    }
		if(temp==-1)
		{
			return -1;
		}
		else
		{
			return temp;
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
						System.out.println("4. exit");
						option=sc.nextInt();
					}
					catch(Exception e)
					{
						System.out.println("Wrong choose entered");
					}
				}while(option<1&&option>4);
			
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
					int position=LE.getLeftmostPosition(number);
					System.out.println("Left most Position of element "+number+" is "+position+1);
				}
				
				else if(option==3)
				{
					LE.display();
				}
				
				else if(option==4)
				{
					System.exit(0);
				}
			}while(option!=4);
			sc.close();
		}
	}
}