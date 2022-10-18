package com.storemanagement.storemanagement.serviceinterface;

import java.util.List;

import com.storemanagement.storemanagement.model.Company;

public interface CompanyServiceClass {
	List<Company> viewCompany();
	void insertComapny(Company company);
	void deleteCompany(int companyId);
	Company editCompany(int companyId);

}
