package br.com.geoschmitt.manager.servlet;

import java.util.ArrayList;
import java.util.List;

public class Database {

	private static List<Company> list = new ArrayList<>();
	
	static {
		Company company = new Company();
		company.setNome("company1");
		Database.list.add(company);
		Company company2 = new Company();
		company2.setNome("company2");
		Database.list.add(company2);
		Company company3 = new Company();
		company3.setNome("company3");
		Database.list.add(company3);
	}
	
	void add(Company company) {
		Database.list.add(company);
	}
	
	List<Company> getCompany() {
		return Database.list;
	}
	
}