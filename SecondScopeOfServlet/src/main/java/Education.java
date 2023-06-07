import java.io.IOException;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(loadOnStartup = 1,urlPatterns = "")
public class Education extends HttpServlet {

	public Education() {
		System.out.println("Creating No-org Constructor to education");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Executing do post method...");
//		super.doPost(req, resp);
		
	HttpSession session=	req.getSession();
	session.setAttribute("Xworkz", "education");
	
	
		
		
	}
	

	
}
