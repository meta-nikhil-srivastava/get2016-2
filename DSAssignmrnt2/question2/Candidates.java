package session2;

public class Candidates 
{
	
	//object of queue class is created
	MyQueue<String> candidateList;
	
	//constructor of candidate class
	public Candidates()
	{
		candidateList=new MyQueue<String>();
	}
	
	//add candidate in queue
	public void addCandidate(String name)
	{
		candidateList.enqueue(name);
	}
	
	//get candidate from queue and return the name of candidates
	public String getCandidate()
	{
		String candi=(String) candidateList.dequeue();
		return candi;
		
	}

}
