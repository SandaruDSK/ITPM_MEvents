package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ViewAllProducts
 */
@WebServlet("/ViewAllEvents")
public class ViewAllEvents extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewAllEvents() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		service.Events PS = new service.Events();
		if (request.getParameter("did")!= null)
		{
			PS.removeEvent(Integer.parseInt( (String) request.getParameter("did")));
		}
		
		
		
		
		response.setContentType("text/html");
		
		List<model.Events_model> eventList=PS.getAllEvent();
		
		request.setAttribute("PL", eventList);
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/View_All_Events.jsp");
		rd.forward(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
}
