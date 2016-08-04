package session4;

import java.util.Scanner;

public class Jobs implements Comparable<Jobs>
{
	public int priority;
	public String documentName;
	public static Heap heap = new Heap();
	
	private static final int CHAIR = 4;
	private static final int PROFESSORS = 3;
	private static final int GRADUATES = 2;
	private static final int UNDERGRADUATES = 1;
	
	public Jobs()
	{
		this.priority=0;
		this.documentName="";
	}
	
	public Jobs(int priority, String documentName)
	{
		this.priority=priority;
		this.documentName=documentName;
	}

	public int getPriority() 
	{
		return priority;
	}

	public void setPriority(int priority) 
	{
		this.priority = priority;
	}

	public String getDocumentName() 
	{
		return documentName;
	}

	public void setDocumentName(String documentName) 
	{
		this.documentName = documentName;
	}
	
	@Override
	public int compareTo(Jobs o) 
	{
		if(priority > o.getPriority())
		{
			return 1;
		}
		else 
		{
			return -1;
		}
	}
	
	public void insertJob(int priority,String document)
	{
		heap.insert(new Jobs(priority,document));
	}
	
	public void doJob() 
	{
		Jobs job1=(Jobs) heap.delete();
		if(job1!=null)
		System.out.println(job1.getDocumentName()+ " is printed");
	}
	
	public void insertOptionDisplay()
	{
		Scanner sc=new Scanner(System.in);
		int prior = 0;
		do{
			try
			{
				System.out.println("Enter the Priority");
				System.out.println("1. Undergraduate students");
				System.out.println("2. Graduate students");
				System.out.println("3. Professors");
				System.out.println("4. Department Head");
				prior=sc.nextInt();
			}
			catch(Exception e)
			{
				System.out.println("Wrong input enter");
			}
		}while(prior<1&&prior>4);
		System.out.println("Enter the document name");
		String doc=sc.next();
		insertJob(prior,doc);
	}
	
}
