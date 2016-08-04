package session4;

public class HashLogic 
{
	static final int NumberOfRooms = 7;
	int roomArray[];
	int key;
	
	//constructor
	public HashLogic()
	{
		roomArray=new int[NumberOfRooms];
		key=-1;
	}
	
	
	//room assignment
	public void assignRoom(int age)
	{
		key=age%NumberOfRooms;
		do
		{
			//if room is free allocate room
			if(roomArray[key]==0)
			{
				roomArray[key]=age;
				break;
			}
			
			//else do linear probing 
			else
			{
				if(key<roomArray.length)
				{
					key++;
				}
				else
				{
					key=0;
				}
				continue;
			}
		}while(true);
	}
	
	//display the rooms allocated
	public void displayRoomAllocates()
	{
		for(int index=0;index<roomArray.length;index++)
		{
			if(roomArray[index]>0)
			System.out.println("Room "+ (index+1) +" is assign to "+roomArray[index]+" years guest");
		}
	}
}
