package tt.model;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/InsertDataServlet")
public class InsertDataServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//link insert.jsp to servlet
		String Eid = request.getParameter("Eid");
		String  Type =request.getParameter("ExamType");
		String Year=request.getParameter("Year");
		String Semester=request.getParameter("Semester");
		String Module=request.getParameter("Module");
		String Date=request.getParameter("Date");
		String Time=request.getParameter("Time");
		
		boolean isTrue;
		
		//pass parameters 
		isTrue=TimtTableUtill.inserData(Eid,Type,Year,Semester, Module,Date, Time);
		if(isTrue==true) {
			RequestDispatcher dis=request.getRequestDispatcher("dashboard.jsp");
			dis.forward(request, response);
		}else {
			RequestDispatcher dis2=request.getRequestDispatcher("Success.jsp");
			dis2.forward(request, response);
		}
		
		

	}

}
