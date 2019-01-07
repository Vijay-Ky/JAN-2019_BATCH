import java.sql.*;
class B 
{
	public static void main(String[] args) 
	{
		try
		{
			Connection con = DriverManager.getConnection("","","");
		}
		catch (SQLException ex)
		{
		}
	}
}
