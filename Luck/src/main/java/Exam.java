import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/m")
public class Exam extends HttpServlet {

	public Exam() {
		System.out.println("Creating No-org to Exam");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Excecuting doget method in Exam");

		System.out.println(req.getRequestURI());
		Enumeration<String> enumaration = req.getHeaderNames();
		while (enumaration.hasMoreElements()) {
			String headerName = enumaration.nextElement();
			System.out.println(headerName + ":" + " " + req.getHeader(headerName));

		}

		resp.setContentType("text/html");

		PrintWriter vari = resp.getWriter();
		vari.print("<html><body><h1>this is my first response</html></body></h1>");

		System.out.println("==================================");
		String ref = req.getParameter("fname");
		String ref1 = req.getParameter("lname");
		String ref3 = req.getParameter("email");
		String ref4 = req.getParameter("mobile");

		System.out.println(ref + " " + ref1 + "" + ref3 + " " + ref4);

	}

}
