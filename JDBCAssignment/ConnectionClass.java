package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionClass 
{
	static Connection connection;
	public Connection callConnection() throws SQLException 
    {
        try 
        {
           
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        } 
        catch (Exception ex)
        {
            System.out.println("Error loading driver");
        }
        
        String host="jdbc:mysql://localhost:3306/";
        String dbname="library";
        String mysqlURL=host+dbname;
        
        String userId="root";
        String password="ayushi";
        connection=DriverManager.getConnection(mysqlURL,userId,password);
        
        return connection;
    }
}
