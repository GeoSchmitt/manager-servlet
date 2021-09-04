package br.com.geoschmitt.manager.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class newCompanyServlet
 */
@WebServlet("/newCompany")
public class newCompanyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("Success");
		PrintWriter out = res.getWriter();
		String companyName = req.getParameter("companyName");
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>New Company " + companyName + " Success</h1>");
		out.println("</body>");
		out.println("</html>");
	}

}
