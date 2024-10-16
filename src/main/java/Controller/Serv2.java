package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Serv2
 */
@WebServlet("/Serv2")
public class Serv2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Serv2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		 * getParameter("") method of HttpServletRequest request is used to fetch information from the web page.We have to 
		 * pass the name attribute of our input tag as parameter of getParameter method.
		 * 
		 * get Parameter method returns String value.If we want to get the number from this String then we have to use parse method
		 * of wrapper classes.
		 * 
		 * getParameter method of HttpServletResponse response object returns the object of PrintWriter and print() method
		 * of PrintWriter is used to print any message on the fresh web page.
		 * get Writer method.
		 * */
		PrintWriter out=response.getWriter();
		String name=request.getParameter("t1");
		out.print("<b>Hello "+name+"</b>");
	}

}
