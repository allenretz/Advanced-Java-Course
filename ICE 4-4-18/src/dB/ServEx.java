package dB;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ServEx extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		PrintWriter out = response.getWriter();
		
		out.println("<h1>Allen is Awesome!</h1>");
	}

}
