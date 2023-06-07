import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/func")
public class Function extends HttpServlet {

	public Function() {
		System.out.println("No -arg constructor");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Excecuting do get...");

		
		
//		System.out.println(req.getRequestURL());
//		Enumeration<String> enumaration = req.getHeaderNames();
//		while (enumaration.hasMoreElements()) {
//			String getheader = enumaration.nextElement();
//			System.out.println(getheader + req.getHeader(getheader));
//		}
			String ref1 = req.getParameter("Date");
			String ref2 = req.getParameter("FunctionHallName");
			System.out.println("Date"+" "+ref1+" "+"FunctionHallName"+ref2);

			resp.setContentType("text/html");

			PrintWriter vari = resp.getWriter();
			vari.print("<html>");
			vari.print("<body>");
			vari.print("<h1>");
			vari.print("Date" + " : " + ref1);
			vari.print("FunctionHallName" + " : " + ref2);
			
			vari.print("<form method='get' action='prime'>");
			vari.print("<h3>");
			vari.print(" PmName:<input type='send' value='pmName'>"+"<br>");
			vari.print("<input type='submit' value='Send Pm'>"+"<br>");
			vari.print("</h3>");
			
			vari.print("</form>");
			vari.print("<h1>");
			vari.print("<body>");
			vari.print("<html>");

		

	}

}
