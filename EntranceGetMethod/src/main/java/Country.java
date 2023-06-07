import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/count")
public class Country extends HttpServlet {

	public Country() {
		System.out.println("No-arg for country");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Excecuting doget method....");
//		super.doGet(req, resp);

//		System.out.println(req.getRequestURL());
//		Enumeration<String> enumaration = req.getHeaderNames();
//		while (enumaration.hasMoreElements()) {
//			String getheader = enumaration.nextElement();
//
//			System.out.println(getheader + req.getHeader(getheader));
//		}

		String ref1 = req.getParameter("Name");
		String ref2 = req.getParameter("Age");
		String ref3 = req.getParameter("FavePlace");

		System.out.println("Name" + ref1 + " " + "Age" + ref2 + " " + "FavePlace" + ref3);

		resp.setContentType("text/html");
		PrintWriter var = resp.getWriter();
		var.print("Name" + ref1);
		var.print("Age" + ref2);
		var.print("FavePlace" + ref3);

		var.print("<form method='get' action='pm'>");

		var.print("<input type='text' name='PmName' " + "<br>");
		var.print("<input type='submit' value='SendPm' " + "<br>");
		

		var.print("</form>");

	}

}
