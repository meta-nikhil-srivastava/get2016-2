package jdbc;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class MainClass 
{
	public static void main(String args[]) throws SQLException 
	{
        ConnectionClass obj = new ConnectionClass();
        obj.callConnection();
        Queries query = new Queries();

        
        try 
        {
            ArrayList<Titles> titleList = (ArrayList<Titles>) query.booksOfAuthor();
            ListIterator<Titles> itr = titleList.listIterator();
            
            while(itr.hasNext())
            {
                Titles newT = itr.next();
                System.out.println(newT);
            }
        } 
        catch (NoSuchElementException e) 
        {
            System.out.println("No Such Element Found");
            e.printStackTrace();
        }
       
        try 
        {
        	System.out.println("No Such Element Found");
        	query.checkIssueBooks();
       } 
        catch(Exception e) 
        {
    	   e.printStackTrace();
       }
       query.deleteBooks();
    }
}
