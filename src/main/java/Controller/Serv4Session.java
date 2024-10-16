package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Serv4Session
 */
@WebServlet("/Serv4Session")
public class Serv4Session extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Serv4Session() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*
		 * We can alse use forward and include method of RequestDispatcher to travel from this servlet to another servlet.
		 * 
		 * We use forward method when we do not want to print anything in first servlet because forward method will create fresh
		 * page of printing the message of second servlet.So we will not be able to see any message that we try to print using first servlet.
		 * 
		 * We use incluse mehod to travel from one servlet to another when we want to see the message printed in first servlet and second 
		 * servlet  both in one single page itself.
		 * 
		 *  Note-
		 *  If we make the object of RequestDispatcher in the doGet method of first servlet then while going to the second servlet
		 *  , we will reach the doGet method of second servlet also.
		 *  
		 *  If we male the object of RequestDispatcher in the doPost method of first servlet then while
		 * */
		PrintWriter out=response.getWriter();
		String name=request.getParameter("t1");
		out.print("Hello"+name+"I am on First page<br>");
		HttpSession session=request.getSession();
		session.setAttribute("Key", name);
		
		session.setAttribute("fkey", "Apple");
		RequestDispatcher rd=request.getRequestDispatcher("Serv6Session");
		rd.include(request, response);
	}

}
