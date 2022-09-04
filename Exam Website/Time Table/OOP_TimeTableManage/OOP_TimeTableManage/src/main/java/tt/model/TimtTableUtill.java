package tt.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import tt.dbConnect.*;

public class TimtTableUtill {
	private static boolean isSuccess = false;
	private static Connection tt = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
//	private static final String DELETE_timetable_SQL="delete from timetable where Eid =?;";
//	private static final String UPDATE_timetable_SQL="update timetable set Type = ?, Year=?, Semester =? Module=? Date =?Time=?;";
	
	 
	 //insert data

	public static List<ExamineeTT> getDetails(String Eid1) {
				
				int empId = Integer.parseInt(Eid1);
		    	
		    	ArrayList<ExamineeTT> ExamineeTT = new ArrayList<>();  	
		    	try {
		    		
		    		Connection connect = dbConnect.getConnection();
		        	Statement state = connect.createStatement();
		    		String query = "select * from employee where Eid='"+Eid1+"'";
		    		ResultSet result = state.executeQuery(query);
		    		
		    		while(result.next()) {
		    			String Eid11 = result.getString(1);
		    			String Type = result.getString(2);
		    			String Year = result.getString(3);
		    			String Semester = result.getString(4);
		    			String Module = result.getString(5);
		    			String Date = result.getString(6);
		    			String Time = result.getString(7);
		    			
		    			ExamineeTT u = new ExamineeTT(Eid11,Type,Year,Semester, Module, Date, Time);
		    			ExamineeTT.add(u);
		    			}
		    		}
		    	catch(Exception e) 
		    	{
		    		e.printStackTrace();
		    	}	
		    	return ExamineeTT;	
		    }
		
		
			
			 public static boolean inserData(String Eid,String type, String year, String semester, String module, String date, String time) { 
		 boolean isSuccess=false;
		 
		 //db Connect
			
	
		 try {
			
			 
            tt=dbConnect.getConnection();
            stmt= tt.createStatement();
			 String sql="insert into timetable values('"+Eid+"','"+type+"','"+year+"','"+semester+"','"+module+"','"+date+"','"+time+"')";
			 int rs=stmt.executeUpdate(sql);
			 
			 if(rs > 0) {
					isSuccess=true;
					System.out.println("In Success!");
				}else {
					isSuccess=false;
					System.out.println("In unSuccess!");
				}
			 
		 }
		 catch(Exception e) {
			 e.printStackTrace();
			 System.out.println("Error");
		 }
		 
		 
		 return isSuccess;
		 
		 
		 
}
			 public static boolean UpdateTimeTable(String Eid, String Type, String Year, String Semester, String Module, String Date, String Time) 
			 	{

					boolean isUpdated = false;
					int convId = Integer.parseInt(Eid);			
					System.out.println(convId);

			 	try {
			 		
			 		Connection connect = dbConnect.getConnection();
			    	Statement state = connect.createStatement();
			 		String query = "update timetable  Eid='"+Eid+"',Type='"+Type+"',Year='"+Semester+"',Module='"+Module+"', Date='"+Date+"', Time='"+Time+"' where Eid='"+convId+"'";
			 		int result = state.executeUpdate(query);
			 		
			 		if(result > 0) 
			 		{
			 			isUpdated = true;
			 		}
			 		else {
			 			isUpdated = false;
			 		}
			 		
			 	}
			 	catch(Exception e) {
			 		e.printStackTrace();
			 	}
			 	
			 	return isUpdated;
			 }
				
				
				
				public static boolean deleteTimeTable(String Id) 
			 	{
					int convId = Integer.parseInt(Id);			
					boolean isDeleted = false;
					
			 	try {
			 		
			 		Connection connect = dbConnect.getConnection();
			    	Statement state = connect.createStatement();
			 		String query = "delete from employee where empID='"+convId+"'";
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


	
