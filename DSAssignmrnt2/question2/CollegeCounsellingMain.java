package session2;

public class CollegeCounsellingMain 
{

	public static void main(String[] args) 
	{
		Candidates candidate =new Candidates();
		Counselling counselling=new Counselling();
		
		counselling.addCollege("JEC");
		candidate.addCandidate("Ayushi");
		String str=candidate.getCandidate();
		counselling.displayAvalableCollege();
		counselling.assignCollege(str,1);
		counselling.displayCollegeAssigned();
		
	}

}
