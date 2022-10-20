package com.storemanagement.storemanagement.serviceinterface;

import java.util.List;

import com.storemanagement.storemanagement.model.Company;
import com.storemanagement.storemanagement.model.Product;

public interface ProductServiceClass {
	List<Product> viewCompany();
	void insertComapny(Product company);
	void deleteCompany(int product_id );
	Company editCompany(int product_id);

}
