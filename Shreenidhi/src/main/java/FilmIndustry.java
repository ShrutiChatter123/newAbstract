import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(loadOnStartup = 1,urlPatterns = "/Film")
public class FilmIndustry extends HttpServlet {

	public FilmIndustry() {
		System.out.println("Creating No-org Constructor FilmIndustry.");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Executing service method...");
		super.service(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Executing doPost method ......!!!!");
		
	
	System.out.println("calling status...");
	   RequestDispatcher dispacDispatcher= req.getRequestDispatcher("display.jsp");
	   dispacDispatcher.forward(req, resp);

	
	}
	
		

}
