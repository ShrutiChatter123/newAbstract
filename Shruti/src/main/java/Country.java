import java.io.IOException;

import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/m")
public class Country extends HttpServlet {

	public Country() {
		System.out.println("Creating No-Org constructor to Country");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Excecution of the doGet method");

//		System.out.println(req.getRequestURL());
//		Enumeration<String> enumaration = req.getHeaderNames();
//		while (enumaration.hasMoreElements()) {
//			String headerName = enumaration.nextElement();
//
//			System.out.println(headerName + ":" + req.getHeader(headerName));
//		}

		String ref = req.getParameter("CountryName");
		String ref1 = req.getParameter("Code");
		String ref2 = req.getParameter("CapitalCity");
		String ref3 = req.getParameter("Population");
		String ref4 = req.getParameter("PrimeMinistar");
		System.out.println("CountryName" + ref + " : " + "Code" + ref1 + " : " + "CapitalCity" + ref2 + " : "
				+ "Population" + ref3 + " : " + "PrimeMinistar " + ref4);

		resp.setContentType("text/html");
		PrintWriter vari = resp.getWriter();
		vari.print("<html>");
		vari.print("<body bgcolor= 'lightblue'>");
		vari.print("<h1>");
		vari.print("Hear is the information about contry!!");
		vari.print("CountryName  " + ":" + ref + "<br>");
		vari.print("Code    " + ":" + ref1 + "<br>");
		vari.print("CapitalCity   " + " " + ref2 + "<br>");
		vari.print("Population   " + ":" + ref3 + "<br>");
		vari.print("PrimeMinistar" + ":" + ref4 + "<br>");

		vari.print("</h1>");
		vari.print("<form method='get' action='m1'>");

		vari.print("<h3>");
		vari.print("PM Name:<input type='text' name='PrimeMinistar'>" + "<br>");
		vari.print("<input type='submit' value='Send PM '> " + "<br>");
		
		vari.print("</h3>");

		vari.print("</form>");
		
		vari.print("</body>");

		vari.print("</html>");

	}

}
