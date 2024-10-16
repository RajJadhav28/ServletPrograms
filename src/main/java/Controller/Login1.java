package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login1
 */
@WebServlet("/Login1")
public class Login1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		 * sendRedirect method of response object is used to travel from one servlet to another servlet/page.
		 * 
		 * if we got to another servlet by using this method then we will always reach the doGet method of that servlet.We do not have the 
		 * option of explicitly calling doPost method over here.
		 * 
		 * Note-sendRedirect method will take us to next servlet's doGet
		 * method, but this doGet method will have a fresh request object so any data
		 * that was present in the first servlet request object will not be present in the request object of second servlet.
		*/
		PrintWriter out=response.getWriter();
		String user=request.getParameter("user");
		String pass=request.getParameter("pass");
		if(user.equals("quastech")&&pass.equals("root")) {
			response.sendRedirect("Login2.html");
			//out.print("Login successfull");
		}else {
			out.print("Please try again");
		}
		
	}

}
