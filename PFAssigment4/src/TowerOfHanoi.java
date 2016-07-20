package session4;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class TowerOfHanoi {
	
	static int n;
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of disks");
		n=sc.nextInt();
		TowerOfHanoi obj=new TowerOfHanoi();
		a=obj.TOH("A","B","C",n);
		for(int i=0;i<a.size();i++){
		    System.out.println(a.get(i));
		} 
		sc.close();
	}
	
	//list to store the disk movement
	static List<String> a=new ArrayList<String>();
	
	//method to find disk movement
	public List<String> TOH(String source,String aux, String des, int n)
	{
		if(n==1)	//if there is only one disk then disk will move from source peg to end peg
		{
			a.add("MoveDisk "+n+" From "+source+" to "+des);
		}
		
		else
		{
			/**
			 n-1 have move to auxiliary peg so that 
			 only one disk in source till there is only one disk in source peg
			 Therefore auxiliary peg will become the destination peg*/
			TOH(source,des,aux,n-1);  
			
			//movement of peg is stored
			a.add("MoveDisk "+n+" From "+source+" to "+des);
			
			/**
			 n-1 had been move to auxiliary peg therefore 
			 Auxiliary peg will become the source peg and 
			 move the disk to destination peg*/
			TOH(aux,source,des,n-1);
		}
		
		//return the list containing the movement of peg
		return a;
		
	}

}
