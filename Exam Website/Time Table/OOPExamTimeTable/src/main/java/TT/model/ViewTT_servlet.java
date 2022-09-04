package TT.model;

import java.io.IOException;
import java.util.List;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import TT.db.*;

@WebServlet("/ViewTT_servlet")
public class ViewTT_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
	String Year=request.getParameter("Year");
	String Semester=request.getParameter("Semester");
	boolean isTrue;
	
	
	//try {
		//List<TimeTable> isSuccess= TimeTableDBUtill.validate(Year, Semester);
		
	isTrue = TimeTableDBUtill.validate1(Year, Semester);
	
		if(isTrue == true) {
			List<TimeTable> ttDetail = TimeTableDBUtill.getTimeTable(Year);
			request.setAttribute("ttDetail", ttDetail);
			
			RequestDispatcher dis = request.getRequestDispatcher("useraccount.jsp");
			dis.forward(request, response);
			System.out.println("isTrue true!");
			
			  RequestDispatcher disp=request.getRequestDispatcher("TimeTable.jsp");
			    disp.forward(request, response);
		
		
		}else {
			System.out.println("isTrue false!");
		
		}
		}
		}
		/*catch(Exception e) {
			e.printStackTrace();
		}
		
		//RequestDispatcher dis =request.getRequestDispatcher("timetableAccount.jsp");
		//dis.forward(request, response);
		
	}}
	
	*/
	/*boolean isTrue;
	
	isTrue = TimeTableDBUtill.validate(Year, Semester);
	
	
	try {
	List<TimeTable>TTDetail=TimeTableDBUtill.validate(Year, Semester);
	//atrtribute name and pass the object
	request.setAttribute("TTDetail", TTDetail);
	}
	catch (Exception e) {
		e.printStackTrace();
	}
	//servlet to navigate page link
	
	RequestDispatcher dis=request.getRequestDispatcher("TimeTable.jsp");
	dis.forward(request, response);
	}

}
*/