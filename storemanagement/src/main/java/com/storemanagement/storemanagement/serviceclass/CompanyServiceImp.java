package com.storemanagement.storemanagement.serviceclass;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.storemanagement.storemanagement.model.Company;
import com.storemanagement.storemanagement.repository.CompanyRepository;
import com.storemanagement.storemanagement.serviceinterface.CompanyServiceClass;

@Service
public class CompanyServiceImp implements CompanyServiceClass {
	@Autowired
	CompanyRepository companyRepository;

	@Override
	public List<Company> viewCompany() {

		return companyRepository.findAll();
	}

	@Override
	public void insertComapny(Company company) {
		this.companyRepository.save(company);

	}

	@Override
	public void deleteCompany(int companyId) {
		this.companyRepository.deleteById(companyId);
	}

	@Override
	public Company editCompany(int companyId) {
		return companyRepository.findById(companyId).get();
	}

}
