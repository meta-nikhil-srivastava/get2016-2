/**
 Input:- 	ABC
 Output:- 	ABC
 			ACB
 			BAC
 			BCA
 			CAB
 			CBA
 */

package session4;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PermutationOfLetter {
	
	static String word;
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the string");
		word=sc.next();
		PermutationOfLetter obj=new PermutationOfLetter();
		obj.combinations(word);
		for(int i=0;i<a.size();i++){
		    System.out.println(a.get(i));
		} 
		sc.close();
	}
	
	//list to store the combination of String
	static List<String> a=new ArrayList<String>();
	
	//method called by user
	public List<String> combinations(String str) 
	{
		combinations("", str);
		return a;
	}

	//method called with 2 parameter containing prefix as null string 
	private List<String> combinations(String prefix, String str)	
	{
		int n = str.length(); //length of string 
		
		//if length is 0 than add prefix
		if (n == 0)
			a.add(prefix);
		else 
		{
			for (int i = 0; i < n; i++)
			{
				/*call function recursively by change the position of each character */
				combinations(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
			}
		}
		return a;
	}
}