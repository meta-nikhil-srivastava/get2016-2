package session4;

import java.util.Scanner;

public class RoomAllocatment 
{
	public static void main(String args[])
	{
		HashLogic HL=new HashLogic();
		Scanner sc=new Scanner(System.in);
		int choose=0,age,noOfGuests=0;
		do
		{
			//take the input for guest room allocation
			try
			{
				System.out.println("Do you want to allocat room");
				System.out.println("1. Yes");
				System.out.println("2. No");
				System.out.print("Enter Choose:");
				choose=sc.nextInt();
				
				
				if(choose==1)
				{
					noOfGuests++;
					//age of the guest
					System.out.println("Enter the age of guest "+noOfGuests);
					age=sc.nextInt();
					
					//room assign to guest
					HL.assignRoom(age);
				}
			}
			catch(Exception e)
			{
				System.out.println("Wrong Input");
			}
		}while(noOfGuests<=HL.NumberOfRooms&&choose==1);
		
		//display the rooms allocated
		HL.displayRoomAllocates();
	}
}
