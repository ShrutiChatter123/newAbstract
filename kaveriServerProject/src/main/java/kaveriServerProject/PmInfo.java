package kaveriServerProject;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/s1")
public class PmInfo extends HttpServlet {

	public PmInfo() {
		System.out.println("Creating No-org constructor to PmInfo");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Excuting Pm info...");
		
	String pmName=	req.getParameter("PrimeMinistar");
	System.out.println("pmName"+pmName);
	
	resp.setContentType("text/html");
	PrintWriter veri=	resp.getWriter();
	veri.print("<html><body><h1> This is my first response..</h1></body></html>");
	veri.print("<a href='Index.html'> Go to Index<a/> ");
	
	
	}
	
	
}
