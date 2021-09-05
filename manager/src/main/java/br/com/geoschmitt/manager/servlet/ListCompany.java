package br.com.geoschmitt.manager.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ListCompany
 */
@WebServlet("/listCompany")
public class ListCompany extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		Database db = new Database();
		List<Company> list = db.getCompany();
		PrintWriter out = res.getWriter();
		
		out.println("<html>");
		out.println("<body>");
		out.println("<ul>");
		for(Company company : list) {
			out.println("<li>" + company.getNome() + "</li>");
		}
		out.println("</ul>");
		out.println("</body>");
		out.println("</html>");
	}

}
