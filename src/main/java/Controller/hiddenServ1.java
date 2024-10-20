package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class hiddenServ1
 */
@WebServlet("/hiddenServ1")
public class hiddenServ1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public hiddenServ1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String info=request.getParameter("process");
		if(info.equals("page1Info")) {
			String name=request.getParameter("uname");
			out.print("Hello"+name);
		}else if(info.equals("page2Info")) {
			String college=request.getParameter("coll");
			out.print("Is your college name is?"+college);
		}
	}

}
