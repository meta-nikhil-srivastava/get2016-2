package session5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class ReadCharacterPosition 
{
	public static void main(String args[])
	{
		String words="";
		HashMap<Character, ArrayList<Integer>> wordIndexes=new HashMap<Character, ArrayList<Integer>>();
		
		//to concatenate the String word array into String
		for(int i=0;i<args.length;i++)
		{
			words+=args[i];
		}
		
		words = words.toLowerCase();//convert string into lower case
		
		//store different character into hashmap 
		for(int i=0;i<words.length();i++)
		{
			char ch=words.charAt(i);
			ArrayList<Integer> charList = new ArrayList<Integer>();
			
			//if character is already in map then just add to array list 
			if(wordIndexes.containsKey(ch)) 
			{
				charList = wordIndexes.get(ch);
				charList.add(i);
				wordIndexes.put(ch,charList);
			} 
			
			//else add to new array list
			else
			{		
				charList.add(i);
				wordIndexes.put(ch,charList);
			}
		}
		
		retrieveValuesFromListMethod(wordIndexes);
	}
	
	//to retrieve value of hash map
	 public static void retrieveValuesFromListMethod(HashMap map)
	    {
	        Set keys = map.keySet();
	        Iterator itr = keys.iterator();
	 
	        char key;
	        ArrayList<Integer> value;
	        while(itr.hasNext())
	        {
	            key = (char)itr.next();
	            value = (ArrayList<Integer>)map.get(key);
	            System.out.println(key + " - "+ value);
	        }
	    }
}
