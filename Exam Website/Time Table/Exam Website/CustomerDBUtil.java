package com.customer;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CustomerDBUtil {
	private static boolean isSuccess;
	private static Connection con=null;
	private static Statement stmt=null;
	private static ResultSet rs = null;
	
	public static boolean validate(String username , String password){
		
		try {
			con=DBConnect.getConnection();
			stmt=con.createStatement();
			String sql = "select * from customer where username='"+username+"' and password='"+password+"'";
			rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				isSuccess=true;
             }else {
            	 isSuccess=false;
             }
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return isSuccess;
	}
	
	public static List<customer> getcustomer(String userName){
		
		ArrayList<customer>customer=new ArrayList<>();
		
		try {
			con=DBConnect.getConnection();
			stmt=con.createStatement();
			String sql="select* from customer where username='"+userName+"'";
			rs=stmt.executeQuery(sql);
			
			while(rs.next()) {
				int id=rs.getInt(1);
				String name=rs.getString(2);
				String email=rs.getString(3);
				String phone=rs.getString(4);
				String username=rs.getString(5);
				String password=rs.getString(6);
				
				customer cus =new customer(id , name , email , phone , username , password);
				customer.add(cus);
			}
		}
		catch(Exception e) {
			
		}
		
		return customer;
	}
 
	
	
	public static boolean insertManager(String name , String email , String phone , String username , String password) {
		
		
		try {
            con=DBConnect.getConnection();
            stmt=con.createStatement();
			String sql="insert into customer values(0,'"+name+"','"+email+"','"+phone+"','"+username+"','"+password+"')";
			int rs=stmt.executeUpdate(sql);
			
			if(rs>0) {
				isSuccess=true;
			}else {
				isSuccess=false;
			}
				
			
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
	}
	
	public static boolean updateManager(String id , String name , String email ,String phone , String username , String password ) {
		
		try {
			con=DBConnect.getConnection();
			stmt=con.createStatement();
			String sql ="update customer set name='"+name+"',email='"+email+"',phone='"+phone+"',username='"+username+"',password='"+password+"'"
    				+ "where id='"+id+"'";
			int rs= stmt.executeUpdate(sql);
			
			if(rs>0) {
				isSuccess=true;
			}
			else {
				isSuccess=false;
			}
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
	}
	public static List<customer> getCustomerDetails(String Id){
		
		int convertedID=Integer.parseInt(Id);
		
		ArrayList<customer> cus =new ArrayList<>();
		
		try {
			
			con=DBConnect.getConnection();
			stmt=con.createStatement();
			String sql="select*from customer where id='"+convertedID+"'";
			rs=stmt.executeQuery(sql);
			
			while(rs.next()) {
				int id=rs.getInt(1);
				String name= rs.getString(2);
				String email=rs.getString(3);
				String phone=rs.getString(4);
				String username=rs.getString(5);
				String password=rs.getString(6);
				
				customer c=new customer(id,name , email , phone , username , password);
				cus.add(c);
			}
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return cus;
		
	}
	public static boolean deleteManager(String id) {
		int convId= Integer.parseInt(id);
		
		try {
			con=DBConnect.getConnection();
			stmt=con.createStatement();
			String sql="delete from customer where id='"+convId+"'";
			int rs=stmt.executeUpdate(sql);
			
			if(rs>0) {
				isSuccess=true;
			}
			else {
				isSuccess=false;
				
			}
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		return isSuccess;
	}
  public static List<payment>getpaymentDetails(String Id){
	  
	   
	  
	  ArrayList<payment>pay=new ArrayList<>();
	  
	  try {
		  con=DBConnect.getConnection();
		  stmt=con.createStatement();
		  String sql="select * from payment";
		  rs=stmt.executeQuery(sql);
		  
		  
		  while(rs.next()) {
			  int Userid=rs.getInt(1);
			  String Paymenttype=rs.getString(2);
			  String Amount=rs.getString(3);
			  
			  payment p= new payment(Userid , Paymenttype , Amount);
			  
			  pay.add(p);
		  }
		  
	  }
	  catch(Exception e) {
		  e.printStackTrace();
	  }
	  return pay;
  }
  public static boolean updatepayment(String Userid , String Paymenttype , String Amount ) {
		
		try {
			con=DBConnect.getConnection();
			stmt=con.createStatement();
			String sql ="update customer set Userid='"+Userid+"',Paymenttype='"+Paymenttype+"',Amount='"+Amount+"'"
  				+ "where =Userid='"+Userid+"'";
			int rs= stmt.executeUpdate(sql);
			
			if(rs>0) {
				isSuccess=true;
			}
			else {
				isSuccess=false;
			}
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
	}
}

