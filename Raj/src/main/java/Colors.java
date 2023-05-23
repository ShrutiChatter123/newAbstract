import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/C")
public class Colors extends HttpServlet {

	public Colors() {
		System.out.println("Creating No-org constructor to Colors");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Executing colors....");

		System.out.println(req.getRequestURL());
		Enumeration<String> enumaration = req.getHeaderNames();

		while (enumaration.hasMoreElements()) {
			String getheader = (String) enumaration.nextElement();
			System.out.println(getheader + " : " + req.getHeader(getheader));
		}

		String ref1 = req.getParameter("ColorName");
		String ref2 = req.getParameter("ShopName");
		String ref3 = req.getParameter("Cost");
		
		System.out.println("ColorName"+" "+ref1 +"ShopName"+ref2+" "+ "Cost"+ref3);
		
		resp.setContentType("text/html");
		PrintWriter vari=resp.getWriter();
		vari.print("<html>");
		vari.print("<body>");
		vari.print("<h1>");
		vari.print("Hear is the information about colors...");
		vari.print("ColorName" + ": "+ref1);
		vari.print("ShopName" + ": "+ref2);
		vari.print("Cost" + ": "+ref3);
		vari.print("</h1>");
		
		
		vari.print("</body>");
		vari.print("</html>");
	}

}
