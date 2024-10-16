package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Serv7
 */
@WebServlet("/Serv7")
public class Serv7 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Serv7() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		ServletConfig config=getServletConfig();
		String name=config.getInitParameter("t1");
		out.print("Data that is fetch from get init param tag:"+name);
		
		ServletContext context=request.getServletContext();
		String college=context.getInitParameter("College");
		out.print("<br>College name that is fetch from context param tag:"+college);
		//ServletConfig interface method is used to fetch data Stored inside<init-param> tag
		//ServletContext interface method is used to fetch data stored inside <context-param>
	}

}
