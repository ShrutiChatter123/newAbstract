package reqScope;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1,urlPatterns = "/yes")
public class Scope extends HttpServlet {

	public Scope() {
	System.out.println("No-args constructor..");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Service method in Scope class..");
		super.service(req, resp);

	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Excecuting Do pos in Scope Class..");
		
		req.setAttribute("Name", req.getParameter("Name"));
		req.setAttribute("Age", req.getParameter("Age"));
		req.setAttribute("Collage", req.getParameter("Collage"));
		
		String[] ref= {"DELL","Hp","Lenovo"};
		req.setAttribute("brand", ref[0]);
		req.setAttribute("brand1", ref[1]);
		req.setAttribute("brand2", ref[2]);
		
		
	RequestDispatcher m1=	req.getRequestDispatcher("Display.jsp");
		m1.forward(req, resp);
	}
	
}
