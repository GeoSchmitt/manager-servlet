package br.com.geoschmitt.manager.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NewCompanyServlet
 */
@WebServlet("/newCompany")
public class NewCompany extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("Success");
		PrintWriter out = res.getWriter();
		String companyName = req.getParameter("companyName");
		Company company = new Company();
		company.setNome(companyName);
		
		Database db = new Database();
		db.add(company);
		
		//mandando pro JSP
		RequestDispatcher rd = req.getRequestDispatcher("/newCompanyCreated.jsp");
		req.setAttribute("company", company.getNome());
		rd.forward(req, res);
		
	}

}
