package beans;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class AddNodeServlet
 */
@WebServlet("/AddNodeServlet")
public class AddNodeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String data = request.getParameter("data");

        HttpSession session = request.getSession();
        LinkedList linkedList = (LinkedList) session.getAttribute("linkedList");

        if (linkedList == null) {
            linkedList = new LinkedList();
            session.setAttribute("linkedList", linkedList);
        }

        linkedList.addNode(data);

        request.setAttribute("linkedList", linkedList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
        dispatcher.forward(request, response);
    }
}

