package session2;

public class Counselling 
{

	String [][]collegeList;	//name of colleges with limited seats
	int row;	//row display number of colleges register for counseling
	int availableSeats[]; //available seats in college
	
	//CONSTRUCTOR 
	public Counselling()
	{
		/** max 5 colleges with 5 seats each
		 * first column of every row has the name of college */
		collegeList=new String[5][6]; 
		
		row=0;
		availableSeats=new int[]{0,0,0,0,0};
	}
	
	
	//add college in list 
	public void addCollege(String college)
	{
		//if row equal to max number of colleges than no more colleges can be added
		if(row==collegeList.length)
		{
			System.out.println("No more College can be added in the list");
		}
		
		//else college is added at first column of the row
		else
		{
			collegeList[row++][0]=college;

			System.out.println(college+" is added sucessfully in the list");
		}
	}
	
	//display the available colleges having free seats
	public void displayAvalableCollege()
	{
		//display the register college if it has seat available for counseling
		for(int college=0;college<row;college++)
		{
			if(availableSeats[college]<5)
			{
				System.out.println((college+1)+". "+collegeList[college][0]);
			}
		}
	}
	
	
	//assign college to candidate if seats is available
	public void assignCollege(String candidate,int college)
	{
		//Wrong choose if college number pass is more than number of register
		if(college>row)
		{
			System.out.println("Wrong choose Entered");
		}
		
		//seats are full of chosen college
		else if(availableSeats[college]>=collegeList[0].length)
		{
			System.out.println("Seats Full");
		}
		
		//else assign the college to student
		else
		{
			availableSeats[college]++;
			collegeList[college-1][availableSeats[college]]=candidate;
			System.out.println("student  "+candidate+" is assign"+collegeList[college-1][0]);
		}
	}
	
	
	//display the college assigned to candidate
	public void displayCollegeAssigned()
	{
		System.out.println("Coleges assigned are:");
		for(int college=0;college<row;college++)
		{
			for(int candidate=1;candidate<6;candidate++)
			{
				System.out.println(collegeList[college][0]+" is assign to "+collegeList[college][candidate]);
			}
		}
	}
}
