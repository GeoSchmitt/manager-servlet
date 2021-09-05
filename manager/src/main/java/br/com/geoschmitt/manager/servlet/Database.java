package br.com.geoschmitt.manager.servlet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Database {

	private static List<Company> list = new ArrayList<>();
	private static Integer sequencialKey = 1;
	
	static {
		Company company = new Company();
		company.setName("company1");
		company.setId(sequencialKey++);
		Database.list.add(company);
		Company company2 = new Company();
		company2.setName("company2");
		company2.setId(sequencialKey++);
		Database.list.add(company2);
		Company company3 = new Company();
		company3.setName("company3");
		company3.setId(sequencialKey++);
		Database.list.add(company3);
	}
	
	void add(Company company) {
		company.setId(Database.sequencialKey++);
		Database.list.add(company);
	}
	
	void remove(Integer id) {
		Iterator<Company> it = Database.list.iterator();
		while(it.hasNext()) {
			Company company = it.next();
			if(company.getId() == id) {
				it.remove();
			}
		}
	}
	
	public Company getCompany(Integer id) {
		Iterator<Company> it = Database.list.iterator();
		while(it.hasNext()) {
			Company company = it.next();
			if(company.getId() == id) {
				return company;
			}
		}
		return null;
	}
	
	List<Company> getCompany() {
		return Database.list;
	}
	
}
