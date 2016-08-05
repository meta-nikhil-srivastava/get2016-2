package session6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class UniqueStringcharacters 
{
	HashMap<String, List<Character>> uniqueString;
	List<Character> uniqueCharacter;
	
	public UniqueStringcharacters()
	{
		uniqueString =new HashMap<String, List<Character>>();
		uniqueCharacter= new ArrayList<Character>();
	}
	
	public boolean addString(String word)
	{
		word=word.toLowerCase();
		if(uniqueString.containsKey(word))
		{
			return false;
		}

		uniqueCharacter=new ArrayList<Character>();
		for(int wordIndex=0;wordIndex<word.length();wordIndex++)
		{
			char ch=word.charAt(wordIndex);
			if(!uniqueCharacter.contains(ch))
			{
				uniqueCharacter.add(ch);
			}
		}
		uniqueString.put(word, uniqueCharacter);
		return true;
	}
	
	public void display()
	{
		Set keys = uniqueString.keySet();
        Iterator itr = keys.iterator();
 
        String key;
        ArrayList<Character> value;
        while(itr.hasNext())
        {
            key = (String)itr.next();
            value = (ArrayList<Character>)uniqueString.get(key);
            int noOfCharacter=value.size();
            System.out.println(key + "\t-"+ noOfCharacter);
        }
	}
}
