import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 1,urlPatterns = "/fav")
public class FavoriteItems extends HttpServlet {

	public FavoriteItems() {
		System.out.println("Creating No-Org Constructor to FavoriteItems ");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Executing serviceMethod...");
		super.service(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Executing doPost method.....");
//		super.doPost(req, resp);

//		setattribute get attribute are method ans scope of the method is
//		transfer data to one servlet to another servelet/jsp file thats call scope
		req.setAttribute("Food", req.getParameter("Food"));
		req.setAttribute("Place", req.getParameter("Place"));
		req.setAttribute("Person", req.getParameter("Person"));
		
		String[] things= {"dell","Hp","Samsung"};
		req.setAttribute("brand1", things[0]);
		req.setAttribute("brand2", things[1]);
		req.setAttribute("brand3", things[2]);

		RequestDispatcher dispatcher = req.getRequestDispatcher("/InfoDisplay.jsp");
		dispatcher.forward(req, resp);

	}

}
