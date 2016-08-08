package session6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class UniqueStringcharacters 
{
	HashMap<String, Set<Character>> uniqueString;
	Set<Character> uniqueCharacter;
	public UniqueStringcharacters()
	{
		uniqueString =new HashMap<String, Set<Character>>();
		uniqueCharacter=new HashSet<Character>();
	}
	
	public boolean addString(String word)
	{
		word=word.toLowerCase();
		uniqueCharacter=new HashSet<Character>();
		for(int wordIndex=0;wordIndex<word.length();wordIndex++)
		{
			char ch=word.charAt(wordIndex);
			uniqueCharacter.add(ch);
		}
		uniqueString.put(word, uniqueCharacter);
		return true;
	}
	
	public void display()
	{
		Set keys = uniqueString.keySet();
        Iterator itr = keys.iterator();
 
        String key;
        Set<Character> value;
        while(itr.hasNext())
        {
            key = (String)itr.next();
            value =(Set<Character>)uniqueString.get(key);
            int noOfCharacter=value.size();
            System.out.println(key + "\t-"+ noOfCharacter);
        }
	}
}
