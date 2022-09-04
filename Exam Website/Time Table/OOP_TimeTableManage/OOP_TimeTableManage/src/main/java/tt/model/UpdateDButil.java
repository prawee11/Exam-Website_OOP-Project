package tt.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import tt.dbConnect.*;

public class UpdateDButil 
{
	private static boolean isUpdated = false;
	private static Connection tt = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	public static boolean UpdateTimeTable(String Eid, String Type, String Year, String Semester, String Module, String Date, String Time) 
 	{
		int convId = Integer.parseInt(Eid);			
		boolean isUpdated = false;
		
 	try {
 		
 		Connection connect = dbConnect.getConnection();
    	Statement state = connect.createStatement();
 		String sql = "update timetable set Eid='"+Eid+"',Type='"+Type+"',Year='"+Semester+"',Module='"+Module+"', Date='"+Date+"', Time='"+Time+"' where Eid='"+convId+"'";
 		int result = state.executeUpdate(sql);
 		
 		if(result > 0) 
 		{
 			isUpdated = true;
 			System.out.print("ok");
 		}
 		else {
 			isUpdated = false;
 			System.out.print("not ok");
 		}
 		
 	}
 	catch(Exception e) {
 		e.printStackTrace();
 	}
 	
 	return isUpdated;
 }
}


