import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/sendA")
public class WorkingServlet extends HttpServlet {


	//private static final long serialVersionUID = 1L;

	public WorkingServlet() {
		System.out.println("No org constructor to working servlet");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("do get method running in workingServlet");
	}

}
