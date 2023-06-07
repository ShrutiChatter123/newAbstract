import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1,urlPatterns = "/prime")
public class PmInfo extends HttpServlet {

	public PmInfo() {
		System.out.println("No-arg pminfo...");

	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Executing do get in pminfo...");

		String ref=	req.getParameter("PmName");
		System.out.println("PmName"+":"+ref);
		
		resp.setContentType("text/html");
		PrintWriter var=	resp.getWriter();
		var.print("PmName");
		var.print("<a href='Index.html'> Fo to Index></a>");
	
	
	}
	
}
