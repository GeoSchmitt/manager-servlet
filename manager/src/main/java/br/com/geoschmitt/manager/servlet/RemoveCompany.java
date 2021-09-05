package br.com.geoschmitt.manager.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RemoveCompany
 */
@WebServlet("/removeCompany")
public class RemoveCompany extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	
		Integer id = Integer.valueOf(req.getParameter("id"));
		
		Database db = new Database();
		db.remove(id); 
		
		res.sendRedirect("listCompany");
		
	}

}
