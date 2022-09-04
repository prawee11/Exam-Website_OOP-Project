package tt.model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import tt.dbConnect.*;

@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String Eid = request.getParameter("Eid");
		String Type = request.getParameter("Type");
		String Year = request.getParameter("Year");
		String Semester = request.getParameter("Semester");
		String Module = request.getParameter("Module");
		String Date = request.getParameter("Date");
		String Time = request.getParameter("Time");
	 
		
		//id = eid;
		
		boolean isUpdated = UpdateDButil.UpdateTimeTable( Eid,  Type,  Year,  Semester,  Module,  Date,  Time); 
		if(isUpdated == true) 
		{
			
			List<ExamineeTT> UserDetails = TimtTableUtill.getDetails(Eid);
			//ArrayList<ExamineeTT> user = new ArrayList<>();
			request.setAttribute("UserDetails", UserDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("TimeTable.jsp");
			dis.forward(request, response);
		}
		else {
			List<ExamineeTT> UserDetails = TimtTableUtill.getDetails(Eid);
			request.setAttribute("UserDetails", UserDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("unsuccess.jsp");
			dis.forward(request, response);

		}

	}
	

}
