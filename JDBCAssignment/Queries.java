package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;



public class Queries 
{

	Scanner sc=new Scanner(System.in);
	//question 1
	public List<Titles> booksOfAuthor() throws SQLException
	{
		Titles titles=new Titles();
		List<Titles> titleList=new ArrayList<Titles>();
		
		System.out.println("Enter the name of author whose book is to be Listed");
		String author=sc.nextLine();
		
		
		String query1;
		query1="Select t.tit_name from titles t inner join title_author ta on t.tit_id =ta.tit_id inner join authors a on ta.aur_id =a.aur_id where aur_name='"+author+"'";

		ConnectionClass connect=new ConnectionClass();
		Connection connection=connect.callConnection();
		Statement statement=connection.createStatement();
	    ResultSet resultset=statement.executeQuery(query1);
	    while(resultset.next())
	    {
	    	titles.setTitleName(resultset.getString(1));
	      	titleList.add(titles);
	    }
	    resultset.close();
	    statement.close();
	    connection.close();
	    
	    return titleList;
	}
	
	//question 2
	public Boolean checkIssueBooks() throws SQLException
	{
		BookIssue bookissue=new BookIssue();
		
		Boolean flag=false;
		
		System.out.println("Enter the name of book which has to be find");
		String book="";
		try{
			book=sc.next();
		} catch(Exception e) {
			System.out.println("Int he query");
			e.printStackTrace();
		}
		
		String query1;
		query1="select bi.access_no from book_issue bi inner join books b On b.access_no=bi.access_no inner join titles t On t.tit_id=b.tit_id where t.tit_name='"+book+"'";
		
		ConnectionClass connect=new ConnectionClass();
		Connection connection=connect.callConnection();
		Statement statement=connection.createStatement();
	    ResultSet resultset=statement.executeQuery(query1);
	    while(resultset.next())
	    {
	    	bookissue.setAccessionNo(resultset.getString(1));
	    	flag=true;
	    }
	    if(flag)
	    {
	    	//to take today date using java in build class
	    	DateFormat date = new SimpleDateFormat("yyyy-mm-dd");
	    	Date today = new Date();
	    	bookissue.setIssueDate(date.format(today));
	    	
	    	//take member id
	    	System.out.println("enter member id");
	    	bookissue.setMemberID(sc.nextLine());
	    	
	    	//take due date
	    	System.out.println("enter due date");
	    	bookissue.setDueDate(sc.nextLine());
	    	
	    	//update in book issue
	    	String query2;
	    	query2="Insert into book_issue values('"+today+"','"+bookissue.getAccessionNo()+"','"+bookissue.getMemberID()+"','"+bookissue.getDueDate()+"';";
	    	System.out.println(query2);
	    	resultset=statement.executeQuery(query2);
	    }
	    else
	    {
	    	System.out.println("Book is already issue");
	    }
	    resultset.close();
	    statement.close();
	    connection.close();
		return flag;
	}
	
	//Question 3
	public void deleteBooks() throws SQLException
	{
		String query1;
		query1="DELETE FROM Books WHERE access_no NOT IN (SELECT access_no FROM book_Issue bi WHERE bi.issue_date NOT BETWEEN CURDATE() AND DATE_SUB(CURDATE(),INTERVAL 12 MONTH));";

		ConnectionClass connect=new ConnectionClass();
		Connection connection=connect.callConnection();
		Statement statement=connection.createStatement();
	    int resultset=statement.executeUpdate(query1);
	    
	    System.out.println("No of rows effected after deleting books which are not been issued from 1 year :"+resultset);
	    statement.close();
	    connection.close();
	    
	}

}
