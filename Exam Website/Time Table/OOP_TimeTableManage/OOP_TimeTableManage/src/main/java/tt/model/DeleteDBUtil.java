package tt.model;

import java.sql.Connection;
import java.sql.Statement;

import tt.dbConnect.*;

public class DeleteDBUtil 
{
	public static boolean deleteTimeTable(String EId) 
 	{
		int convId = Integer.parseInt(EId);			
		boolean isDeleted = false;
		
 	try {
 		
 		Connection connect = dbConnect.getConnection();
    	Statement state = connect.createStatement();
 		String query = "delete from timetable where empID='"+convId+"'";
 		int result = state.executeUpdate(query);
 		
 		if(result > 0) 
 		{
 			isDeleted = true;

 		}
 		else {
 			isDeleted = false;
 		}
 		
 	}
 	catch(Exception e) {
 		e.printStackTrace();
 	}
 	
 	return isDeleted;
 }
}






