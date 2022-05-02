package jsonWriter;

import java.sql.*;

public class JSONrunner 
{

	static Connection getConnection(String url, String user, String pass) 
	{
		try 
		{
			return DriverManager.getConnection(url, user, pass);
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return null;
	}

	public static void main(String[] args) 
	{
		try 
		{
			String url = "jdbc:mysql://localhost:3306/json";
			String user = "root";
			String pass = "";

			Connection c = getConnection(url, user, pass);

			JSONWriter.write(c, "C:\\Users\\ogisha\\Desktop\\Schule\\3AHWII\\INFI\\json.txt");

			c.close();
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}
}