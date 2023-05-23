
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/m1")
public class PmInfo extends HttpServlet {

	public PmInfo() {
		System.out.println("Creating No-org constructor to PmInfo");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Executing PmInfo......");

		String pmName = req.getParameter("PrimeMinistar");
		System.out.println("pmName"+ " : "+   pmName);

		resp.setContentType("text/html");
		PrintWriter value = resp.getWriter();
		value.print("pmName"+ " : "+   pmName);
		value.print("<a href='Index.html'>Go To Index</a>");

	
		
		
		
		
	}

}
