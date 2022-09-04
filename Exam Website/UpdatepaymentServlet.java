package com.customer;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/UpdatepaymentServlet")
public class UpdatepaymentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id=request.getParameter("Userid");
		String Paymenttype=request.getParameter("Payment type");
		String Amount=request.getParameter("Amount");
		
		boolean isTrue;
		isTrue=CustomerDBUtil.updatepayment(id, Paymenttype, Amount);
		if(isTrue==true) {
			
			List<payment>payDetails=CustomerDBUtil.getpaymentDetails(id);
			request.setAttribute(payDetails, payDetails);
			
			RequestDispatcher dis =request.getRequestDispatcher("payment.jsp");
			dis.forward(request, response);
			
		}
		else {
			List<customer>cusDetails=CustomerDBUtil.getpaymentDetails(id));
			request.setAttribute("payDetails", payDetails);
			
			RequestDispatcher dis =request.getRequestDispatcher("useraccount.jsp");
			dis.forward(request, response);
		}
	}

}
