package kaveriServerProject;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/s")
public class Country extends HttpServlet {

	public Country() {
		System.out.println("Creating No-org Constructor to Country");
	}
 
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Executing DoGet Method...");

		System.out.println(req.getRequestURL());
		Enumeration<String> enumaration = req.getHeaderNames();
		while (enumaration.hasMoreElements()) {
			String getheader = (String) enumaration.nextElement();

			System.out.println(getheader + " : " + req.getHeader(getheader));
		}

		String ref1 = req.getParameter("ContryName");
		String ref2 = req.getParameter("Code");
		String ref3 = req.getParameter("CapitalCity");
		String ref4=req.getParameter("PmName");

		System.out.println("ContryName" + ref1 + " " + "Code" + ref2 + " " + "CapitalCity" + ref3 +" "+"PmName"+ref4);

		resp.setContentType("text/html");

		PrintWriter vari = resp.getWriter();
		vari.print("<html>");
		vari.print("<body>");
		vari.print("<h1>");
		vari.print("Hear is the information about Contry");
		vari.print("ContryName"+ " " + ref1 +"<br>");
		vari.print("Code"+ " " + ref2 + "<br>");
		vari.print("CapitalCity" + " " + ref3 + "<br>");
		vari.print("PmName"+ " "+ ref4);
		vari.print("</h1>");
		vari.print("<form method='get' action='s1'>");
		vari.print("<h3>");
		vari.print("PM Name:<input type='text' name='PrimeMinistar'>" + "<br>");
		vari.print("<input type='submit' value='Send PM'> " + "<br>");
		
		vari.print("</h3>");
		vari.print("</form>");

		//vari.print("<a href='PmInfo.html'> Info For Pm</a>");
		vari.print("</body>");
		vari.print("</html>");

	}

}
