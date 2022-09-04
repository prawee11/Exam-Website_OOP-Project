package TT.model;

import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



import TT.db.*;



public class TimeTableDBUtill {
	private static boolean isSuccess;

	private static Connection tt =null;
	private static Statement stmt  =null;
	private static ResultSet rs =null;
	
public static boolean validate1(String Year, String Semester) {
		
		try {
			tt = DatabaseConnect.getConnection();
			stmt = tt.createStatement();
			 String sql="select * from timetable where Year='"+Year+"' and Semester='"+Semester+"'";
			rs = stmt.executeQuery(sql);
			
			if (rs.next()) {
				isSuccess = true;
			} else {
				isSuccess = false;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
	}
	
	
	public static List<TimeTable>getTimeTable(String Year){
		
		ArrayList<TimeTable> TimeTable=new ArrayList<>();
		
		//connection
		 /* String url = "jdbc:mysql://localhost:3306/timetable";
		  String username = "root";
		  String password = "Praweena";*/
		
		
		
		//validate
		try {
	
			
			tt = DatabaseConnect.getConnection();
			stmt = tt.createStatement();
			 String sql="select * from timetable where Year='"+Year+"' ";
			rs = stmt.executeQuery(sql);
			
		   
			//ResultSet rs = stmt.executeQuery(sql);
			rs=stmt.executeQuery(sql);
			//correct informations
			while(rs.next()) {
				String EID=rs.getString(1);
				String Year1=rs.getString(2);
				String Semester1=rs.getString(3);
				String Module=rs.getString(4);
				String Date=rs.getString(5);
				String Time=rs.getString(6);
				
				//pass TImeTable.java data
				TimeTable t=new TimeTable(EID,Year1,Semester1,Module,Date,Time);
				//pass TimeTable object to  array list
				TimeTable.add(t);
		}}
			
		catch(Exception e) {
		e.printStackTrace();
		}
		
		return TimeTable;
		
		
	}}



	
	
