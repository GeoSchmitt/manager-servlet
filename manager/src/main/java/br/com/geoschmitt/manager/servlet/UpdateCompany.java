package br.com.geoschmitt.manager.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpdateCompany
 */
@WebServlet("/updateCompany")
public class UpdateCompany extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		System.out.println("Success");
		PrintWriter out = res.getWriter();
		Integer id = Integer.valueOf(req.getParameter("id"));
		String companyName = req.getParameter("companyName");
		Date date = null;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			date = sdf.parse(req.getParameter("date"));
		} catch (ParseException e) {
			throw new ServletException(e); 
		}
		
		Database db = new Database();
		Company company = db.getCompany(id); 
		company.setName(companyName);
		company.setDate(date);
		
		res.sendRedirect("listCompany");
		
	}

}
