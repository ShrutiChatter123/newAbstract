import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1,urlPatterns = "/pm")
public class PmInfo extends HttpServlet {

	public PmInfo() {
		System.out.println("No-org for pmInfo...");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Excecuting do get in pmInfo...");

		String ref = req.getParameter("PmName");
		System.out.println("PmName" + ref);

		resp.setContentType("text/html");
		PrintWriter vari = resp.getWriter();
		vari.print("PmName"+ref);
		vari.print("<a href='Index.html'>Enter for Index</a>");
		
	}

}
