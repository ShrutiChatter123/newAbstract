import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/yes")
public class FunJsp extends HttpServlet {

	public FunJsp() {
		System.out.println("No-Org constructor for FunJsp...");
	}
	
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Excecuting service method...");
		super.service(req, resp);

	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Excecuting DoPost in FunJsp...");
	
		
		System.out.println("Getting methods !!!");
		RequestDispatcher dispach=	req.getRequestDispatcher("Display.jsp");
		dispach.forward(req, resp);
	
	
	}
	
	
}
